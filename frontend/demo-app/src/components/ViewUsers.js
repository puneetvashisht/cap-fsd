import React, { Component } from 'react'
import * as actions from '../actions/useraction'
import { connect } from 'react-redux'; 
 class ViewUsers extends Component {

componentDidMount(){
    this.props.onFetchUsers();
}

    render() {

        let userList = this.props.users.map((user, i)=> {
            return (<li key={i}>{user.email} : {user.role.name}</li>)
        })

        return (
            <div>
                <ul>
                    {userList}
                </ul>
            </div>
        )
    }
}

const mapStateToProps = (state) => {
    return {
        users: state.userreducer.users
    }
}

const mapDispatchToProps = (dispatch) => {
    return {
        onFetchUsers: () => dispatch(actions.fetchUsers())
    }
}

export default connect(mapStateToProps, mapDispatchToProps)(ViewUsers);
