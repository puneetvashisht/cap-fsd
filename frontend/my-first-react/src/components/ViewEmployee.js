import React, { Component } from 'react'

export default class ViewEmployee extends Component {

    constructor(props) {
        super(props);
        console.log('In constructor', props)
        
        this.state = {employees: []};
      }

      componentDidMount() {
          console.log('Initialization code goes here..');

// axios()

          fetch('http://localhost:8080/api/employees/')
            .then(response => response.json())
            .then(data => {
                console.log(data)
                this.setState({employees: data})
            });
          
      }

      delete(id){

        fetch('http://localhost:8080/api/employees/' + id, {
        method: 'DELETE', // or 'PUT'
        headers: {
            'Content-Type': 'application/json',
        }
        })
        .then(response => {
           if(response.status === 201){ }
           return response.json();
        })
            .then(data => {
                console.log(data)
                this.setState({message: data.text})
            });

      }
      

    render() {
        let employeeList = this.state.employees.map((employee, i)=> {
            return (
                    <tr key={i}>
                    <th scope="row">{i+1}</th>
                    <td>{employee.id}</td>
                    <td>{employee.name}</td>
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
                    <th scope="col"><button onClick={this.delete.bind(this, id)}>X</button></th>
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
