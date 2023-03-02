package enoca.challange.business.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


/**A DTO to update only the Employee.*/


@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateEmployeeRequest {

	private int id;
	private String firstName;
	private String lastName;
	private String identityNumber;
	private String phone;
}
