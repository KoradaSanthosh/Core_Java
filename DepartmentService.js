import axios from "axios";

const DEPARTMENT_API_BASR_URL = "http://localhost:6555/api/department";
//const API_BASR_URL = "http://localhost:8080/api/department";

class DepartmentService{

    getDepartment(){
        return axios.get(DEPARTMENT_API_BASR_URL);
    }
    createDepartment(department){
        return axios.post(DEPARTMENT_API_BASR_URL, department);
    }

    getDepartmentById(departmentId){
        return axios.get(DEPARTMENT_API_BASR_URL + '/' + departmentId);
    }
    updateDepartment(department,departmentId){
        return axios.put(DEPARTMENT_API_BASR_URL + '/' + departmentId, department);
    }
    deleteDepartment(departmentId){
        return axios.delete(DEPARTMENT_API_BASR_URL + '/' + departmentId);
    }
    //loginDepartment(department){
        //return axios.post(DEPARTMENT_API_BASR_URL + '/' + department);}
}

export default new DepartmentService();