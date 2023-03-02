package enoca.challange.api;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import enoca.challange.business.abstracts.EmployeeService;
import enoca.challange.business.requests.CreateEmployeeRequest;
import enoca.challange.business.requests.DeleteEmployeRequest;
import enoca.challange.business.requests.UpdateEmployeeRequest;
import enoca.challange.business.responses.GetAllEmployeeResponse;
import lombok.AllArgsConstructor;

/** REST controller for managing. */

@RestController
@RequestMapping("/api/employees")
@AllArgsConstructor
public class EmployeesController {
	
	private final EmployeeService employeeService;

	
	/**
     * {@code GET  /companies} : Get all employee responses. 
     * 
     */
	
	
	@GetMapping("/getall")
	public List<GetAllEmployeeResponse> getall() {
		return this.employeeService.getAll();
	}

	
	/**
     * {@code POST  /employees} : Create a new employee.
     * 
     */
	
	@PostMapping("/add")
	@ResponseStatus(code = HttpStatus.CREATED)
	public void add(@RequestBody CreateEmployeeRequest createEmployeeRequest) {
		this.employeeService.add(createEmployeeRequest);
	}
	
	/**
     * {@code DELETE  /employees/id} : Delete an employee.
     *
     */

	@DeleteMapping("/delete")
	public void delete(DeleteEmployeRequest deleteEmployeeRequest) {
		this.employeeService.delete(deleteEmployeeRequest);
	}

	
	/**
     * {@code PUT  /employees} : Updates an existing employee.
     * 
     */
	@PutMapping("/update")
	public void update(@RequestBody UpdateEmployeeRequest updateEmployeeRequest) {
		this.employeeService.update(updateEmployeeRequest);
	}
}
