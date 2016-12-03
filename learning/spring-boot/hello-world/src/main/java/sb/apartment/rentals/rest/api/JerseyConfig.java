package sb.apartment.rentals.rest.api;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

import sb.apartment.rentals.rest.api.endpoints.EchoEndpoint;

@Configuration
public class JerseyConfig extends ResourceConfig {
	public JerseyConfig() {
		packages("sb.apartment.rentals.rest.api.providers");
		register(EchoEndpoint.class);
	}
}
