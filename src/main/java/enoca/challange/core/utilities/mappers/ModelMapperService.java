package enoca.challange.core.utilities.mappers;

import org.modelmapper.ModelMapper;

/** Service interface for mapping */

public interface ModelMapperService {

	ModelMapper forResponse();

	ModelMapper forRequest();
}
