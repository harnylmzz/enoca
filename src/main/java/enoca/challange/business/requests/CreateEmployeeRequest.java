package enoca.challange.business.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


/** A DTO to create only the Employee object. */


@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateEmployeeRequest {
	
	private String firstName;
	private String lastName;
	private String idedntityNumber;
	private String phone;

}
