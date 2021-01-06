const redux = require('redux');


// 1. Store
const createStore = redux.createStore;


const initialState = {
    employees: [
        { id: 101, name: 'Abhinav', salary: 12345 },
        { id: 102, name: 'Abhishek', salary: 23456 },
        { id: 103, name: 'Ajay', salary: 34567 }
    ]
}

// 2. Reducers for change the state in the store
const store = createStore((state = initialState,  action)=>{
  console.log('Action fired..', action.type);
  switch(action.type){
    case 'ADD_EMPLOYEE':
        let newEmployees = [...state.employees, action.payload]
        
        // do not modify the existing state object.. not allowed
        // state.employees.push(action.payload)
        return {
            employees: newEmployees
        }

    case 'FETCH_EMPLOYEES':
        return {
            employees: state.employees
        }
}
return state;

})


//Subscribe
store.subscribe(()=> console.log(store.getState()));
// store.subscribe(function(){console.log(store.getState())} );



// 3. Trigger Actions
// store.dispatch({type: 'FETCH_EMPLOYEES'})
store.dispatch({type: 'ADD_EMPLOYEE', payload:{id: 104, name: 'Ravi', salary: 34567} })
store.dispatch({type: 'ADD_EMPLOYEE', payload:{id: 105, name: 'Priya', salary: 34567} })
// console.log(store.getState())

store.dispatch({type: 'FETCH_EMPLOYEES'});

