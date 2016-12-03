package sb.apartment.rentals.rest.api.providers;

import javax.inject.Inject;
import javax.inject.Named;
import javax.ws.rs.ext.ContextResolver;
import javax.ws.rs.ext.Provider;

import com.fasterxml.jackson.databind.ObjectMapper;

@Named
@Provider
public class JacksonObjectMapperProvider implements
		ContextResolver<ObjectMapper> {

	@Inject
	private ObjectMapper objectMapper;

	@Override
	public ObjectMapper getContext(Class<?> type) {
		return objectMapper;
	}
}