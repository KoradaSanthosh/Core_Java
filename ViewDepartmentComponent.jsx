import React, { Component } from 'react'
import DepartmentService from '../services/DepartmentService'

class ViewDepartmentComponent extends Component {
    constructor(props) {
        super(props)
        this.state = {
            id: this.props.match.params.id,
            department: {}

        }
    }
    componentDidMount(){
        DepartmentService.getDepartmentById(this.state.id).then(res => {this.setState({department: res.data});

    })
}
    render(){
        return(
            <div>
                <div className="card col-md-6 offset-md-3">
                    <h3 className="text-center"> View Department Details</h3>
                    {/*</div><div className="card-body">*/}
                        <div className="row">
                            <label> Department name: </label>
                            <div> { this.state.department.name } </div>
                        </div>
                </div>
            </div>
    )
  }
}
export default ViewDepartmentComponent;