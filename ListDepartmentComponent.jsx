import React, { Component } from 'react'
import DepartmentService from '../services/DepartmentService';

class ListDepartmentComponent extends Component{
    constructor(props) {
        super(props)
        this.state = {
            department:[]
        }
        this.adddepartment = this.adddepartment.bind(this);
        this.editDepartment = this.editDepartment.bind(this);
        this.deleteDepartment = this.deleteDepartment.bind(this);
        //this.login = this.login.bind(this);
    }
    deleteDepartment(id){
        DepartmentService.deleteDepartment(id).then( res => {
            this.setState({department: this.state.department.filter(department => department.id !== id)});
        });

    }
    viewDepartment(id){
       this.props.history.push(`/view-department/${id}`);}

    editDepartment(id){
        this.props.history.push(`/add-department/${id}`);
    }

    componentDidMount(){
        DepartmentService.getDepartment().then((res) => {
            this.setState({department:res.data});
        });
    }
    adddepartment(){
        this.props.history.push('/add-department/_add');
    }

    //login(){
       // this.props.history.push('/login-form');}
    render() {
        return (
            <div>
                <h2 className="text-center" style={{fontFamily : 'sans-serif'}}>Department List</h2>
                    <button className="btn btn-lg btn-primary" onClick={this.adddepartment}> Add department </button>
                   {/* <button style={{marginLeft: "1099px"}} className="btn btn-lg btn-success" onclick = {this.login}> Log In</button>*/}
                    <div className="row" />
                        <br />
                        
                    <table className="table table-striped table-bordered">
                        <thead>
                            <tr>
                                <th>Department Name</th>
                                <th>Actions</th>
                            </tr>
                        </thead>
                        <tbody>
                            {
                                this.state.department.map(
                                    department =>
                                    <tr key={department.id}>
                                        <td>{department.name}</td>
                                        <td>
                                            <button onClick={ () => this.editDepartment(department.id)} className="btn btn-info"> Update </button>
                                            <button style={{marginLeft: "10px"}}onClick={ () => this.deleteDepartment(department.id)} className="btn btn-danger"> Delete </button>
                                            <button style={{marginLeft: "10px"}}onClick={ () => this.viewDepartment(department.id)} className="btn btn-info"> View </button> 
                                        </td>
                                    </tr>
                                )
                            }
                        </tbody>
                    </table>
                    </ div>

               
        )
    }
}
export default ListDepartmentComponent;