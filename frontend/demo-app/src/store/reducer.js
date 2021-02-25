import * as actionCreators from '../actions/action'
// 2. create reducer

const initialState = {
    message: '',
    employees: [
        // { id: 11, name: 'Abhinav', salary: 12345 },
        // { id: 102, name: 'Abhishek', salary: 23456 },
        // { id: 103, name: 'Ajay', salary: 34567 }
    ]
}


const reducer = function(state = initialState,  action){
    switch(action.type){
        case actionCreators.ADD_EMPLOYEE:
            console.log('add  data from here', action.payload);
            let newMessage =  action.payload.message;
            let newEmployees = [...state.employees, action.payload.employee]
            // newEmployees.push(action.payload)
            return {
                employees: newEmployees,
                message: newMessage
            }

        case actionCreators.FETCH_EMPLOYEES:
            console.log('fetch data from here', action);
            let freshEmployees = action.payload;
            return {
                employees: freshEmployees,
                message: ''
            }
        case actionCreators.DELETE_EMPLOYEE:
                console.log('in reducer delete method');
                // let newMessage1 =  action.payload.text;
                // let freshEmployees = [...action.payload]
                // freshEmployees.filter((employee,i)=> )

                return {
                    message: action.payload.text,
                    employees: action.payload.employees
                }
        default:
            return state;
    }
    // return state;

}

export default reducer;