import React, { Component } from 'react'
import {
    Link
  } from "react-router-dom";
import { connect } from 'react-redux';
import * as actions from '../actions/action'


class ViewEmployee extends Component {

    // constructor(props) {
    //     super(props);
    //     console.log('In constructor', props)
    //   }

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
          console.log('delete employee with id: ' + id)
        
        //   asynch
        this.props.onDeleteEmployee(id);


        this.props.history.push('/view');
        
        // fetch('http://localhost:8080/api/employees/' + id, {
        // method: 'DELETE', // or 'PUT'
        // headers: {
        //     'Content-Type': 'application/json',
        // }
        // })
        // .then(response => {
        //    return response.json();
        // })
        //     .then(data => {
        //         console.log(data)
        //         this.setState({message: data.text})
        //     });

      }

      handleChange(event){
          console.log(event.target.value);
          this.props.onFilterEmployee(event.target.value);
      }
      

    render() {

        // let employeeList = (
        //     <tr>
        //                 <th scope="row">No record found</th>
        //     </tr>
        // )
        let employeeList = null;
        if(this.props.employees){
             employeeList = this.props.employees.map((employee, i)=> {
                return (
                        <tr key={i}>
                        <th scope="row">{i+1}</th>
                        <td>{employee.id}</td>
                        <td><Link to={'/viewdetail/' + employee.id}>{employee.name}</Link></td>
                        <td>{employee.salary}</td>
                        <td><button className="btn btn-danger" onClick={this.delete.bind(this, employee.id)}> X </button> </td>
                        </tr>
                )
            })
        }
        

        return (
            <div>
                <div className="mb-3">
                <div class={(this.props.message === '')? '' : 'alert alert-success'} role="alert">
                    {this.props.message}
                </div>
                </div>
                <div className="mb-3">
                <input type="search" onChange={this.handleChange.bind(this)} className="form-control" placeholder="Search By Name" />
                </div>
                <table className="table">
                <thead>
                    <tr>
                    <th scope="col">#</th>
                    <th scope="col">Id</th>
                    <th scope="col">Name</th>
                    <th scope="col">Salary</th>
                    <th scope="col">Actions</th>
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
    console.log('State is:: ', state)
    return {
        message: state.employee.message,
        employees: state.employee.employees
    }
}

const mapDispatchToProps = (dispatch) => {
    return {
        onFetchEmployees: () => {
            console.log('debug info')
           return dispatch(actions.fetchEmployees())
        },
        onDeleteEmployee: (id) => dispatch(actions.deleteEmployee(id)),
        onFilterEmployee: (text) => dispatch(actions.filterEmployee(text))

    }
}

// export default ViewEmployees;
export default connect(mapStateToProps, mapDispatchToProps)(ViewEmployee);