import React, { Component } from 'react'
import DepartmentService from '../services/DepartmentService';

class UpdateDepartmentComponent extends Component{
    constructor(props) {
        super(props)
        this.state = {
            id : this.props.match.params.id,
            name:''

        }
        this.changenameHandler = this.changenameHandler.bind(this);
        this.updateDepartment = this.updateDepartment.bind(this);
    }
    componentDidMount(){
        DepartmentService.getDepartmentById(this.state.id).then((res) =>{
            let department = res.data;
            this.setState({name:department.name});
        });
    }
    updateDepartment = (e) => {
        e.preventDefault();
        let department = {name: this.state.name};
        console.log('department =>' + JSON.stringify(department));
        DepartmentService.updateDepartment(department,this.state.id).then(res => {
            this.props.history.push('/department');
        });
    }
    changenameHandler= (event) => {
        this.setstate({name: event.target.value});
    }
    cancel(){
        this.props.history.push('/department');
    }

    render(){
        return(
            <div>
                <br></br>
                <h1>Department form</h1>
                <div className="container">
                    <div className="row">
                        <div className="card col-md-6 offset-md-3 offset-md-3">
                            <h3 className="text-center">Update department</h3>
                            <div className="card-body">
                                <form>
                                    <div className="form-group">
                                        <label> Department Name: </label>
                                        <input placeholder="Department Name" name="departmentname" className="form-control"
                                        value={this.state.department} onChange={this.changenameHandler}></input>
                                    </div>
                                    {/*<div className="form-group">
                                        <label> Medicine Price: </label>
                                        <input placeholder="Medicine Price" name="medicineprice" className="form-control"
                                        value={this.state.medicineprice} onChange={this.changeMedicinePriceHandler}></input>
                                    </div>*/}

                                    <br />
                                    <div>
                                    <button className="btn btn-success" onClick={this.updateDepartment}>save</button>
                                    <button className="btn btn-danger" onClick={this.cancel.bind(this)}
                                    style={{marginLeft:"10px"}}>cancel</button></div>
                                </form>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        )
    }
} 
export default UpdateDepartmentComponent;