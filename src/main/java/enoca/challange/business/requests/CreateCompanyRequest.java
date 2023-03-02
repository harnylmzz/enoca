package enoca.challange.business.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * A DTO to create only the Company object.
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateCompanyRequest {

	private String name;
	private String mail;
	private String webSite;
	private String phone;
}
