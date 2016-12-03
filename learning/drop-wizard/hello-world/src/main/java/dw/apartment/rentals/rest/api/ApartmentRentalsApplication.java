package dw.apartment.rentals.rest.api;

import com.fasterxml.jackson.databind.SerializationFeature;

import dw.apartment.rentals.rest.api.resources.EchoResource;
import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class ApartmentRentalsApplication extends
		Application<ApartmentRentalsConfiguration> {

	@Override
	public void initialize(Bootstrap<ApartmentRentalsConfiguration> bootstrap) {
	}

	@Override
	public void run(final ApartmentRentalsConfiguration configuration,
			Environment environment) throws Exception {

		environment.getObjectMapper().configure(
				SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);

		final EchoResource echoResource = new EchoResource(
				configuration.getEchoText());
		environment.jersey().register(echoResource);

	}

	public static void main(final String[] args) throws Exception {
		new ApartmentRentalsApplication().run(args);
	}
}
