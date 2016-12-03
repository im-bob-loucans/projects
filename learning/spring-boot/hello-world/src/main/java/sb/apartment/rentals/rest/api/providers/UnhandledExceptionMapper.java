package sb.apartment.rentals.rest.api.providers;

import java.util.Arrays;

import javax.inject.Named;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Named
@Provider
public class UnhandledExceptionMapper implements ExceptionMapper<Exception> {

	@Override
	public Response toResponse(Exception exception) {
		return Response
				.status(Status.INTERNAL_SERVER_ERROR)
				.entity(Arrays.asList(new Error[] { new Error(exception
						.getMessage(), "UNHANDLED_ERROR") })).build();
	}

	public class Error {
		private final String message;
		private final String code;

		public Error(String message, String code) {
			super();
			this.message = message;
			this.code = code;
		}

		public String getMessage() {
			return message;
		}

		public String getCode() {
			return code;
		}
	}

}