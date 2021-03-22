import React, { Component } from 'react'
import { connect } from 'react-redux';


class ViewEmployeeDetail extends Component {

  // constructor(props){
  //   super(props)
  //   console.log(props);
  // }

componentDidMount(){
  // const { match: { params } } = this.props;
  // console.log(this.props)
  console.log('component will moutn... ', this.props.id)
  console.log(this.props);

  // fetch('/?id=' + this.props.id)

  

  //action to request data for that specific id;
}

back(){
  console.log('back...')

  // fetch();

  this.props.history.push('/add');

}

  render() {

    return (
      <div>
        {/* <h3>ID: {ownProps.match.params.title}</h3> */}
        <h3>ID: {this.props.id}</h3>
        <input type="text" name="userid" value={this.props.id} disabled/>
        <button className="btn btn-secondry" onClick={this.back.bind(this)}>Go Back</button>
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



const mapStateToProps = (state, ownProps) => {
  console.log(ownProps)
  return {
    id: ownProps.match.params.title,
    history: ownProps.history
  }
}

export default connect(mapStateToProps)(ViewEmployeeDetail);


// export default ViewEmployeeDetail;