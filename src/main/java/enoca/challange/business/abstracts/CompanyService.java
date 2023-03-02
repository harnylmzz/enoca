package enoca.challange.business.abstracts;

import java.util.List;

import enoca.challange.business.requests.CreateCompanyRequest;
import enoca.challange.business.requests.DeleteCompanyRequest;
import enoca.challange.business.requests.UpdateCompanyRequest;
import enoca.challange.business.responses.GetAllCompanyResponse;

/** Service interface for Company. */

public interface CompanyService {
	
	
	/** Get all the company responses */
	List<GetAllCompanyResponse> getAll();  
	
	/** Create a company */
	void add(CreateCompanyRequest createCompanyRequest);  
	
	/** Delete the "id" company */
	void delete(DeleteCompanyRequest deleteCompanyRequest); 
	
	/** Updates a company */
	void update(UpdateCompanyRequest updateCompanyRequest); 
	
}
