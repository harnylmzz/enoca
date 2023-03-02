package enoca.challange.business.concretes;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import enoca.challange.business.abstracts.CompanyService;
import enoca.challange.business.requests.CreateCompanyRequest;
import enoca.challange.business.requests.DeleteCompanyRequest;
import enoca.challange.business.requests.UpdateCompanyRequest;
import enoca.challange.business.responses.GetAllCompanyResponse;
import enoca.challange.core.utilities.mappers.ModelMapperService;
import enoca.challange.entity.concretes.Company;
import enoca.challange.repository.CompanyRepository;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class CompanyManager implements CompanyService {

	private CompanyRepository companyRepository;
	private ModelMapperService modelMapperService;

	@Override
	public List<GetAllCompanyResponse> getAll() {

		List<Company> companies = companyRepository.findAll();

		List<GetAllCompanyResponse> companyResponses = companies.stream()

				.map(company -> this.modelMapperService.forResponse().map(company, GetAllCompanyResponse.class))
				.collect(Collectors.toList());

		return companyResponses;
	}

	@Override
	public void add(CreateCompanyRequest createCompanyRequest) {

		Company company = this.modelMapperService.forRequest().map(createCompanyRequest, Company.class);
		this.companyRepository.save(company);

	}

	@Override
	public void delete(DeleteCompanyRequest deleteCompanyRequest) {
		Company company = this.modelMapperService.forRequest().map(deleteCompanyRequest, Company.class);
		this.companyRepository.delete(company);
	}

	@Override
	public void update(UpdateCompanyRequest updateCompanyRequest) {
		Company company = this.modelMapperService.forRequest().map(updateCompanyRequest, Company.class);
		this.companyRepository.save(company);

	}

}
