package dw.apartment.rentals.rest.api.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import dw.apartment.rentals.rest.api.api.Echo;

@Path("/echo")
@Produces(MediaType.APPLICATION_JSON)
public class EchoResource {

	private final String echoText;

	public EchoResource(final String echoText) {
		this.echoText = echoText;
	}

	@GET
	public Response getEchoMessage() {
		return Response.ok().entity(new Echo(echoText)).build();
	}
}
