package models;

public class ResultadoCalculo {
    private String tipoFigura;
    private String tipoOperacion;
    private double valorResultado;

    public String getTipoFigura() {
        return tipoFigura;
    }

    public void setTipoFigura(String tipoFigura) {
        this.tipoFigura = tipoFigura;
    }

    public String getTipoOperacion() {
        return tipoOperacion;
    }

    public void setTipoOperacion(String tipoOperacion) {
        this.tipoOperacion = tipoOperacion;
    }

    public double getValorResultado() {
        return valorResultado;
    }

    public void setValorResultado(double valorResultado) {
        this.valorResultado = valorResultado;
    }

    public String toJson() {
        return "{\"data\": {\"tipoFigura\": \"" + tipoFigura + "\", \"tipoOperacion\": \"" + tipoOperacion + "\", \"valorResultado\": \"" + valorResultado + " u\"}}";
    }
}
