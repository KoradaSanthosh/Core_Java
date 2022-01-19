package org.postgresql.Controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.postgresql.Exception.ResourceNotFoundException;
import org.postgresql.Model.Department;
import org.postgresql.Repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class DepartmentController {

	//Call my http methods -- get, post, edit, delete

	@Autowired
	private DepartmentRepository departmentRepository;

	//get Department information - Id,name
	@GetMapping("/department")
	public List<Department>getDepartment(){
		return this.departmentRepository.findAll();
	}
	//get department information with help of Id
	@GetMapping("/department/{id}")
	public ResponseEntity<Department> getDepartmentById(@PathVariable(value = "id") Long DepartmentId)
			throws ResourceNotFoundException{
		Department department = departmentRepository.findById(DepartmentId).orElseThrow(() ->
		new ResourceNotFoundException("Department not found for this id :: "+DepartmentId));
		return ResponseEntity.ok().body(department);
	}
	//Save department
	@PostMapping("/department")
	public Department createDepartment(@RequestBody Department department) {
		return this.departmentRepository.save(department);
	}

	//update the department information
	@PutMapping("/department/{id}")
	public ResponseEntity<Department> getDepartmentById(@PathVariable(value="id") Long DepartmentId,
			@Validated @RequestBody Department department)
					throws ResourceNotFoundException{
		Department department_one = departmentRepository.findById(DepartmentId).orElseThrow(() ->
		new ResourceNotFoundException("Department not found for this id :: "+DepartmentId));
		department_one.setName(department.getName());
		return ResponseEntity.ok(this.departmentRepository.save(department_one)); 	
	}
	//delete the employee information
	@DeleteMapping("/Delete/{id}")
	public Map<String, Boolean> deleteDepartment(@PathVariable(value="id")Long departmentId)
			throws ResourceNotFoundException{
		Department department = departmentRepository.findById(departmentId).orElseThrow(() -> new ResourceNotFoundException
				("Department is not found by that id :: "+departmentId));
		this.departmentRepository.delete(department);
		Map<String,Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return response;

	}
}