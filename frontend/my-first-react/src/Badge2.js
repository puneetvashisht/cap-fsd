import React, { Component } from 'react'


export default class Badge2 extends Component {
// right way of using intance variable is by using state line 12
    // int count = props.count;

    constructor(props) {
        super(props);
        console.log('In constructor', props)
        
        this.state = {count: props.count};
      }

    //functionality js
    handleClick(){
        console.log('this method will handle click events')
        console.log(this.state)
        var newCount = ++this.state.count;
        this.setState({count: newCount})
    }


    render() {

        //html & css
        return (
            <div>
                 <button onClick={this.handleClick.bind(this)} type="button" className="btn btn-primary">
                    {this.props.caption} <span className="badge bg-secondary">{this.state.count}</span>
                </button>
            </div>
            
        )
    }
}

