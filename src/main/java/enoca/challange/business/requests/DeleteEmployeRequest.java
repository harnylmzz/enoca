package enoca.challange.business.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


/**A DTO to delete only the Employee.*/


@Data
@AllArgsConstructor
@NoArgsConstructor
public class DeleteEmployeRequest {
	
	private int id;

}
