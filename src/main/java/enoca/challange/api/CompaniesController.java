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

import enoca.challange.business.abstracts.CompanyService;
import enoca.challange.business.requests.CreateCompanyRequest;
import enoca.challange.business.requests.DeleteCompanyRequest;
import enoca.challange.business.requests.UpdateCompanyRequest;
import enoca.challange.business.responses.GetAllCompanyResponse;

/** REST controller for managing. */

@RestController
@RequestMapping("/api/companies")
public class CompaniesController {

	private CompanyService companyService;

	public CompaniesController(CompanyService companyService) {
		super();
		this.companyService = companyService;
	}

	/**
     * {@code GET  /companies} : Get all company responses. 
     * 
     */
	
	@GetMapping("/getall")
	public List<GetAllCompanyResponse> getall() {
		return this.companyService.getAll();
	}

	 /**
     * {@code POST  /companies} : Create a new company. 
     * 
     */
	
	@PostMapping("/add")
	@ResponseStatus(code = HttpStatus.CREATED)
	public void add(@RequestBody CreateCompanyRequest createCompanyRequest) {
		this.companyService.add(createCompanyRequest);
	}
	
	
	/**
     * {@code DELETE  /companies/id} : Delete a company.
     *
     */
	

	@DeleteMapping("/delete")
	public void delete(DeleteCompanyRequest deleteCompanyRequest) {
		this.companyService.delete(deleteCompanyRequest);
	}
	
	/**
     * {@code PUT  /companies} : Updates an existing company.
     *
     */

	@PutMapping("/update")
	public void update(@RequestBody UpdateCompanyRequest updateCompanyRequest) {
		this.companyService.update(updateCompanyRequest);
	}
}
