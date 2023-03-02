package enoca.challange.business.concretes;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import enoca.challange.business.abstracts.EmployeeService;
import enoca.challange.business.requests.CreateEmployeeRequest;
import enoca.challange.business.requests.DeleteEmployeRequest;
import enoca.challange.business.requests.UpdateEmployeeRequest;
import enoca.challange.business.responses.GetAllEmployeeResponse;
import enoca.challange.core.utilities.mappers.ModelMapperService;
import enoca.challange.entity.concretes.Employee;
import enoca.challange.repository.EmployeeRepository;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class EmployeeManager implements EmployeeService {

	private EmployeeRepository employeeRepository;
	private ModelMapperService modelMapperService;

	@Override
	public List<GetAllEmployeeResponse> getAll() {
		List<Employee> employees = employeeRepository.findAll();

		List<GetAllEmployeeResponse> employeeResponses = employees.stream()
				.map(employee -> this.modelMapperService.forResponse().map(employee, GetAllEmployeeResponse.class))
				.collect(Collectors.toList());
		return employeeResponses;
	}

	@Override
	public void add(CreateEmployeeRequest createEmployeeRequest) {
		Employee employee = this.modelMapperService.forRequest().map(createEmployeeRequest, Employee.class);
		this.employeeRepository.save(employee);

	}

	@Override
	public void delete(DeleteEmployeRequest deleteEmployeRequest) {
		Employee employee = this.modelMapperService.forRequest().map(deleteEmployeRequest, Employee.class);
		this.employeeRepository.delete(employee);

	}

	@Override
	public void update(UpdateEmployeeRequest updateEmployeeRequest) {
		Employee employee = this.modelMapperService.forRequest().map(updateEmployeeRequest, Employee.class);
		this.employeeRepository.save(employee);

	}

}
