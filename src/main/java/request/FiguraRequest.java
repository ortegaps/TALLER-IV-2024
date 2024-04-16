package request;

import models.FiguraGeometrica;
import models.Cuadrado;
import models.Circulo;
import models.Triangulo;
import models.Rectangulo;

public class FiguraRequest {
    private String tipo;
    private double lado;

    public FiguraRequest() {}

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public FiguraGeometrica getFigura() {
        switch (tipo.toUpperCase()) {
            case "CUADRADO":
                return (FiguraGeometrica) new Cuadrado(lado);
            case "CIRCULO":
                return (FiguraGeometrica) new Circulo(lado);
            case "TRIANGULO":
                return (FiguraGeometrica) new Triangulo(lado, lado, lado);
            case "RECTANGULO":
                return (FiguraGeometrica) new Rectangulo(lado, lado);
            default:
                throw new IllegalArgumentException("Tipo de figura no válido");
        }
    }
}
