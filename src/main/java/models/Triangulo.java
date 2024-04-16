package models;

public class Triangulo implements FiguraGeometrica {
    private double lado1;
    private double lado2;
    private double lado3;

    public Triangulo(double lado1, double lado2, double lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    @Override
    public double calcularArea() {
        // Implementa aquí el cálculo del área de un triángulo
        // Puedes usar la fórmula de Herón o cualquier otra que desees
        return 0; // Solo un placeholder, reemplázalo con la fórmula adecuada
    }

    @Override
    public double calcularPerimetro() {
        return lado1 + lado2 + lado3;
    }
}
