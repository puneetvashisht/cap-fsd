import axios from 'axios';

export const ADD_EMPLOYEE = 'ADD_EMPLOYEE'
export const FETCH_EMPLOYEES = 'FETCH_EMPLOYEES'
export const DELETE_EMPLOYEE = 'DELETE_EMPLOYEE'



const baseUrl = 'http://localhost:8080/api/employees/'

const saveEmployee = (payload) => {
    return {
        type: ADD_EMPLOYEE,
        payload
    };
}

export const addEmployee = (payload) => {

    // const requestOptions = {
    //     method: 'POST',
    //     headers: { 'Content-Type': 'application/json' },
    //     body: JSON.stringify(payload)
    // };


    return dispatch => {
        // fetch(baseUrl, requestOptions)
        //     .then(res => {
        //         console.log(res.status)
        //         if(res.status === 201){
        //             console.log("success");
        //             dispatch(saveEmployee({message: 'Successfully added employee'}))
        //         }
        //     })
        axios.post(baseUrl, payload)
          .then(function (response) {
            console.log(response);
            dispatch(saveEmployee({message: 'Successfully added employee!!', employee: payload}))
          })
          .catch(function (error) {
            console.log(error);
            dispatch(saveEmployee({message: 'Uable to  add employee!!'}))
          });
    }

}


const findEmployee = (payload) => {
    return {
        type: FETCH_EMPLOYEES,
        payload

    };
}

export const fetchEmployees = () => {
    return dispatch => {
        fetch(baseUrl)
        // axios(baseUrl)
            .then(res => res.json())
            .then(res => dispatch(findEmployee(res.data)));
    }
}


const removeEmployee = (payload) => {
    return {
        type: DELETE_EMPLOYEE,
        payload
    };
}


export const deleteEmployee = (id) => {
    return dispatch => {
        // fetch(baseUrl)
        console.log('axios delete...')
        axios.delete(baseUrl + 'id')
            // .then(res => res.json())
            .then(res =>{
                console.log('After http response',  res.data)
                dispatch(removeEmployee(res.data))
            }  );
    }
}


