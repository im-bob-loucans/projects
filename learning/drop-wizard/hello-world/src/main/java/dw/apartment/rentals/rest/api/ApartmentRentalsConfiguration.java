package dw.apartment.rentals.rest.api;

import org.hibernate.validator.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.dropwizard.Configuration;

public class ApartmentRentalsConfiguration extends Configuration {

	@NotEmpty
	private String echoText;

	@JsonProperty
	public String getEchoText() {
		return echoText;
	}
}
