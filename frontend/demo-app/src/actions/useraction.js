import axios from 'axios';

export const ADD_USER = 'ADD_USER'
export const FETCH_USERS = 'FETCH_USERS'

const baseUrl = 'http://localhost:8080/api/users/'

const saveUser = (payload) => {
    return {
        type: ADD_USER,
        payload
    };
}
export const addUser = (payload) => {

    return dispatch => {
        axios.post(baseUrl, payload)
          .then(function (response) {
            console.log(response);
            dispatch(saveUser({users: payload}))
          })
          .catch(function (error) {
            console.log(error);
            dispatch(saveUser({message: 'Uable to  add employee!!'}))
          });
    }

}


const findUsers = (payload) => {
    return {
        type: FETCH_USERS,
        payload

    };
}

export const fetchUsers = () => {
    return dispatch => {
        axios(baseUrl)
            .then(res => dispatch(findUsers(res.data)));
    }
}




