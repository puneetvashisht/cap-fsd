

import React, { Component } from 'react'
import { connect } from 'react-redux';

class ViewEmployeeDetail extends Component {

  constructor(props){
    super(props)
    console.log(props);
  }

componentDidMount(){
  // const { match: { params } } = this.props;
  console.log(this.props)

  

  //action to request data for that specific id;
}

  render() {

    return (
      <div>
        <h3>ID: </h3>
      </div>
    );
  }
}


// function ViewEmployeeDetail() {
//     // We can use the `useParams` hook here to access
//     // the dynamic pieces of the URL.
//     let { id } = useParams();

//     // fetch('http://localhost:8080/api/employees/' + id);
  
//     return (
//       <div>
//         <h3>ID: {id}</h3>
//       </div>
//     );
//   }

  // export default ViewEmployeeDetail;



//   const mapStateToProps = (state) => {
//     return {
//         users: state.userreducer.users
//     }
// }

// const mapDispatchToProps = (dispatch) => {
//     return {
//         onFetchUsers: () => dispatch(actions.fetchUsers())
//     }
// }

export default ViewEmployeeDetail;