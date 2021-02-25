import * as actionCreators from '../actions/useraction'
// 2. create reducer

const initialState = {
    message: '',
    users: []
}


const reducer = function(state = initialState,  action){
    switch(action.type){
        case actionCreators.ADD_USER:
            console.log('add  data from here', action.payload);
            let newMessage =  action.payload.message;
            let newUsers = [...state.employees, action.payload.users]
            // newEmployees.push(action.payload)
            return {
                users: newUsers,
                message: newMessage
            }

        case actionCreators.FETCH_USERS:
            console.log('fetch data from here', action);
            let freshUsers = action.payload;
            return {
                users: freshUsers,
                message: ''
            }
        default:
            return state;
    }
    // return state;

}

export default reducer;