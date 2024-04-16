package repository;

import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.Entity;
import models.FiguraGeometrica;
import request.FiguraRequest;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Path("/figura")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ResultadoCalculoRepository {

    @POST
    @Path("/area")
    @Transactional
    public double calcularArea(@Valid FiguraRequest figuraRequest) {
        FiguraGeometrica figura = figuraRequest.getFigura();
        double area = figura.calcularArea();
        guardarResultado(figuraRequest.getTipo(), "AREA", area);
        return area;
    }

    @POST
    @Path("/perimetro")
    @Transactional
    public double calcularPerimetro(@Valid FiguraRequest figuraRequest) {
        FiguraGeometrica figura = figuraRequest.getFigura();
        double perimetro = figura.calcularPerimetro();
        guardarResultado(figuraRequest.getTipo(), "PERIMETRO", perimetro);
        return perimetro;
    }

    private void guardarResultado(String tipoFigura, String tipoOperacion, double valorResultado) {
        ResultadoCalculo resultado = new ResultadoCalculo();
        resultado.tipoFigura = tipoFigura;
        resultado.tipoOperacion = tipoOperacion;
        resultado.valorResultado = valorResultado;
        resultado.persist();
    }
}

@Entity
class ResultadoCalculo extends PanacheEntityBase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;
    
    public String tipoFigura;
    public String tipoOperacion;
    public double valorResultado;
}

