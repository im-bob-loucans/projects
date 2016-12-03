package sb.apartment.rentals.rest.api.resources;

import org.joda.time.DateTime;

public class EchoResource {

	private String text;

	public EchoResource(final String text) {
		this.text = text;
	}

	public String getText() {
		return String.format("application responding: [%s]", text);
	}

	public DateTime getDateTime() throws Exception {
		return DateTime.now();
	}
}
