import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import models.FiguraGeometrica;
import request.FiguraRequest;
import jakarta.ws.rs.core.Response;

@Path("/figura")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class FiguraResource {

    @POST
    @Path("/area")
    public Response calcularArea(FiguraRequest figuraRequest) {
        FiguraGeometrica figura = figuraRequest.getFigura();
        double area = figura.calcularArea();
        return Response.ok().entity("{\"data\": {\"area\": \"" + area + " u2\"}}").build();
    }

    @POST
    @Path("/perimetro")
    public Response calcularPerimetro(FiguraRequest figuraRequest) {
        FiguraGeometrica figura = figuraRequest.getFigura();
        double perimetro = figura.calcularPerimetro();
        return Response.ok().entity("{\"data\": {\"perimetro\": \"" + perimetro + " m\"}}").build();
    }
}
