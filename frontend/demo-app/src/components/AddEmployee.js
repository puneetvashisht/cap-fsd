import React, { Component } from 'react'
import { connect } from 'react-redux';
import * as actions from '../actions/action'

class AddEmployee extends Component {


    constructor(props) {
        super(props);
        // this.state = {message: ''}
        this.name = React.createRef();
        this.salary = React.createRef();
      }

    addEmployee(event){
        // sending a post request

        console.log('A name was submitted: ' + this.name.current.value);
        console.log('A salary was submitted: ' + this.salary.current.value);
        

        let input = {name: this.name.current.value, salary: this.salary.current.value}; 

        this.props.onAddEmployee(input);
        event.preventDefault();
        // fetch('http://localhost:8080/api/employees/', {
        // method: 'POST', // or 'PUT'
        // headers: {
        //     'Content-Type': 'application/json',
        // },
        // body: JSON.stringify(input)
        // })
        // .then(response => response.json())
        //     .then(data => {
        //         console.log(data)
        //         this.setState({message: data.text})
        //     });

        //     console.log('finished')
    }

    render() {
        return (


            <div>
                <p>{this.props.employees}</p>
                <div className="mb-3">
                <div class={(this.props.message === '')? '' : 'alert alert-success'} role="alert">
                    {this.props.message}
                </div>
                </div>


                <div className="mb-3">
                    <label forname="exampleFormControlInput1" className="form-label">Name</label>
                    <input type="text" ref={this.name} className="form-control" id="exampleFormControlInput1" placeholder="Enter name" />
                </div>
                <div className="mb-3">
                    <label forname="exampleFormControlInput2" className="form-label">Salary</label>
                    <input type="number" ref={this.salary} className="form-control" id="exampleFormControlInput2" placeholder="Enter salary" />
                </div>
                <button type="button" onClick={this.addEmployee.bind(this)} className="btn btn-primary">Add Employee</button>
            </div>
        )
    }
}

const mapStateToProps = (state) => {
    return {
        message: state.employee.message,
        // employees: state.employees
    }
}

const mapDispatchToState = (dispatch) => {
    return {
        onAddEmployee: (payload) => dispatch(actions.addEmployee(payload))
    }
}


export default connect(mapStateToProps, mapDispatchToState)(AddEmployee);
// connect()
