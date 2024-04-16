package quarkus_demo;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;


@Path("/saludar")
public class EcoResource {
	
	@GET
	public String saludar() {
		return "Hola, soy Quarkus";
	}
		
	@GET
	@Path("/despedir")
	public String despedir() {
		return "Adios, hasta pronto";
	}
	

}
