import React, { Component } from 'react'
import DepartmentService from '../services/DepartmentService';


class CreateDepartmentComponent extends Component {
    constructor(props) {
        super(props)
        this.state = {
            
            id : this.props.match.params.id,
            name:''
        }
        this.changenameHandler = this.changenameHandler.bind(this);
        this.saveDepartment = this.saveDepartment.bind(this);
    }
    componentDidMount(){

        if(this.state.id === '_add'){
            return
        }else{
            DepartmentService.getDepartmentById(this.state.id).then((res) =>{
                let department = res.data;
                this.setState({name:department.name});
            });
        }
    } 
    saveDepartment = (e) => {
        e.preventDefault();
        let department = {name: this.state.name};
        console.log('department =>' + JSON.stringify(department));

        if(this.state.id === '_add'){
            DepartmentService.createDepartment(department).then(res =>{
                this.props.history.push('/department');
            });
        }
    
        else{
            DepartmentService.updateDepartment(department,this.state.id).then(res => {
                this.props.history.push('/department');
            });
        }
        
    }
    changenameHandler= (event) => {
        this.setState({name: event.target.value});
    }
    cancel(){
        this.props.history.push('/department');
    }
    getTitle(){
        if(this.state.id === '_add'){
            return <h3 className="text-center">Add Department</h3>
        }else{
            return <h3 className="text-center">Update Department</h3>
        }
    }
  render() {
    return (
      <div>
          <h1>Department Form</h1>
          {/*<div className="container">
              <div className="col-md-10 col-md-offset-1">
                  <form className="signup-form">
                      <h2 className="text-center">Add Department</h2>
                      <hr />
                      <div className=" form-group">
                          <input type="text" maxLength={25} className="form-control" placeholder="name"
                          value={this.state.name} onChange={this.changenameHandler} required="" />
                          </div>
                          <div className="form-group text-center">
    <button type="submit" className="btn btn-primary" onClick={this.saveDepartment}>Sign Up</button></div>*/}
                          
                          
                  <div className="card col-md-6 offset-md-3 offset-md-3">
                  {
                      this.getTitle()
                  }
                    <div className="card-body">
                        <form>
                            <div className = "form-group">
                                <label> name : </label>
                                <input type="text" placeholder="name" name="name" className="form-control"
                                value={this.state.name} onChange={this.changenameHandler}></input>
                            </div>
                            <button className="btn btn-success" onClick={this.saveDepartment}>save</button>
    <button className="btn btn-danger" onClick={this.cancel.bind(this)} style={{marginLeft:"10px"}}>cancel</button> 
                        </form>
                    </div>
                  </div>
              </div>
    )
  }
}
export default CreateDepartmentComponent;