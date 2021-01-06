import * as actionCreators from '../actions/action'
// 2. create reducer

const initialState = {
    message: '',
    employees: [
        { id: 11, name: 'Abhinav', salary: 12345 },
        { id: 102, name: 'Abhishek', salary: 23456 },
        { id: 103, name: 'Ajay', salary: 34567 }
    ]
}


const reducer = function(state = initialState,  action){
    switch(action.type){
        case actionCreators.ADD_EMPLOYEE:
            console.log('add  data from here', action.payload);
            // let newMessage =  action.payload.message;
            let newEmployees = [...state.employees, action.payload]
            // newEmployees.push(action.payload)
            return {
                employees: newEmployees
                // message: action.payload.message
            }

        case actionCreators.FETCH_EMPLOYEES:
            console.log('fetch data from here');
            let freshEmployees = [...action.payload]
            return {
                employees: freshEmployees
            }
    }
    return state;

}

export default reducer;