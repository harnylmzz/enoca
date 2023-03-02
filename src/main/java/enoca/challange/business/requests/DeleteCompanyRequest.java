package enoca.challange.business.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


/**A DTO to delete only the Company.*/


@Data
@AllArgsConstructor
@NoArgsConstructor
public class DeleteCompanyRequest {

	private int id;
}
