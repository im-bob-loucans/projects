package dw.apartment.rentals.rest.api.api;

import org.joda.time.DateTime;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Echo {

	private String text;

	public Echo(final String text) {
		this.text = text;
	}

	@JsonProperty
	public String getText() {
		return String.format("application responding: [%s]", text);
	}

	@JsonProperty
	public DateTime getDateTime() {
		return DateTime.now();
	}
}
