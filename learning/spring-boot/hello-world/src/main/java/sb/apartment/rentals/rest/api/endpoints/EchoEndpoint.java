package sb.apartment.rentals.rest.api.endpoints;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import sb.apartment.rentals.rest.api.resources.EchoResource;

@Component
@Path("/echo")
@Produces(MediaType.APPLICATION_JSON)
public class EchoEndpoint {

	@Value("${echoText}")
	private String echoText;

	@GET
	public Response getEcho() {
		return Response.ok().entity(new EchoResource(echoText)).build();
	}
}
