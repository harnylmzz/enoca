package enoca.challange.business.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


/**A DTO to update only the Company.*/

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateCompanyRequest {

	private int id;
	private String name;
	private String mail;
	private String webSite;
	private String phone;
	
	
}
