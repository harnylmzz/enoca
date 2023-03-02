package enoca.challange.business.abstracts;

import java.util.List;

import enoca.challange.business.requests.CreateEmployeeRequest;
import enoca.challange.business.requests.DeleteEmployeRequest;
import enoca.challange.business.requests.UpdateEmployeeRequest;
import enoca.challange.business.responses.GetAllEmployeeResponse;

/** Service interface for Employee. */

public interface EmployeeService {
	
	/** Get all the employee responses */
	List<GetAllEmployeeResponse> getAll(); 
	
	/** Create an employee */
	void add(CreateEmployeeRequest createEmployeeRequest); 
	
	/** Delete an employee */
	void delete(DeleteEmployeRequest deleteEmployeRequest); 
	
	/** Updates an employee */
	void update(UpdateEmployeeRequest updateEmployeeRequest);

}
