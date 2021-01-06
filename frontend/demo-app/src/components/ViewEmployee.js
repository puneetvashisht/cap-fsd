import React, { Component } from 'react'
import {
    Link
  } from "react-router-dom";
import { connect } from 'react-redux';
import * as actions from '../actions/action'


class ViewEmployee extends Component {

    constructor(props) {
        super(props);
        console.log('In constructor', props)
        
        this.state = {employees: []};
      }

      componentDidMount() {
          console.log('Initialization code goes here..');
          this.props.onFetchEmployees();
// axios()

        //   fetch('http://localhost:8080/api/employees/')
        //     .then(response => response.json())
        //     .then(data => {
        //         console.log(data)
        //         // this.state = {employees: data};
        //         this.setState({employees: data})
        //     });
          
      }

    //   shouldComponentUpdate(){
    //       return false;
    //   }

      delete(id){

        fetch('http://localhost:8080/api/employees/' + id, {
        method: 'DELETE', // or 'PUT'
        headers: {
            'Content-Type': 'application/json',
        }
        })
        .then(response => {
           return response.json();
        })
            .then(data => {
                console.log(data)
                this.setState({message: data.text})
            });

      }
      

    render() {
        let employeeList = this.props.employees.map((employee, i)=> {
            return (
                    <tr key={i}>
                    <th scope="row">{i+1}</th>
                    <td>{employee.id}</td>
                    <td><Link to={'/viewdetail/' + employee.id}>{employee.name}</Link></td>
                    <td>{employee.salary}</td>
                    </tr>
            )
        })

        return (
            <div>
                <table className="table">
                <thead>
                    <tr>
                    <th scope="col">#</th>
                    <th scope="col">Id</th>
                    <th scope="col">Name</th>
                    <th scope="col">Salary</th>
                    </tr>
                </thead>
                <tbody>
                    {employeeList}
                </tbody>
                </table>
            </div>
        )
    }
}


const mapStateToProps = (state) => {
    return {
        message: state.message,
        employees: state.employees
    }
}

const mapDispatchToProps = (dispatch) => {
    return {
        onFetchEmployees: () => dispatch(actions.fetchEmployees())
    }
}

// export default ViewEmployees;
export default connect(mapStateToProps, mapDispatchToProps)(ViewEmployee);