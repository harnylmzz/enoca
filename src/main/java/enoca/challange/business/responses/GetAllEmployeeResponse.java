package enoca.challange.business.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * A DTO (Data Transfer Object) has been implemented here. Response DTOs are
 * used in the response of an API or service and are used to process and present
 * data from the API to the user.
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllEmployeeResponse {

	private int id;
	private String firstName;
	private String lastName;
}
