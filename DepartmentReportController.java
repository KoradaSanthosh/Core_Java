package org.postgresq.Controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.postgresq.Exception.ResourceNotFoundException;
import org.postgresq.Model.DepartmentReport;
import org.postgresq.Repository.DepartmentReportRepository;
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
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class DepartmentReportController {
	
	//Call my http methods -- get, post, edit, delete
	
	@Autowired
	private DepartmentReportRepository departmentreportrepository;
	
	//get departmentreport information - id,dreport_name,dreport_description
	@GetMapping("/departmentreport")
	public List<DepartmentReport>getDepartmentReport() {
		return this.departmentreportrepository.findAll();
	}
	
	//get departmentreport information with help of Id
	@GetMapping("/departmentreport/{id}")
	public ResponseEntity<DepartmentReport> getDepartmentReportById(@PathVariable (value="id") Long DepartmentReportId)
			throws ResourceNotFoundException{
		DepartmentReport departmentreport = departmentreportrepository.findById(DepartmentReportId).orElseThrow(() ->
		new ResourceNotFoundException("DepartmentReport not found for this id :: "+DepartmentReportId));
		return ResponseEntity.ok().body(departmentreport);
				
	}
	//Save departmentreport
	@PostMapping("/departmentreport")
	public DepartmentReport createDepartmentreport(@RequestBody DepartmentReport departmentreport) {
		return this.departmentreportrepository.save(departmentreport);
		
	}
	//Update the departmentreport
	@PutMapping("/departmentreport/{id}")
	public ResponseEntity<DepartmentReport> getDepartmentRepotById(@PathVariable(value="id") Long DepartmentId,
			@Validated @RequestBody DepartmentReport departmentreportDetails)
			throws ResourceNotFoundException{
		DepartmentReport departmentreport = departmentreportrepository.findById(DepartmentId).orElseThrow(() ->
		new ResourceNotFoundException("DepartmentReport not found for this id:: "+DepartmentId));
		//departmentreport.setId(departmentreportDetails.getId());
		departmentreport.setName(departmentreportDetails.getName());
		departmentreport.setDescription(departmentreportDetails.getDescription());
		return ResponseEntity.ok(this.departmentreportrepository.save(departmentreport));
	}
	//delete the departmentreport
	@DeleteMapping("/Delete/{id}")
	public Map<String, Boolean> deleteDepartmentreport(@PathVariable(value="id")Long departmentreportId)
	throws ResourceNotFoundException{
		DepartmentReport departmentreport = departmentreportrepository.findById(departmentreportId).orElseThrow(() -> new ResourceNotFoundException
				("DepartmentReport is not found by that id :: "+departmentreportId));
				this.departmentreportrepository.delete(departmentreport);
		Map<String,Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return response;
	}
}