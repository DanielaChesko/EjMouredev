package area.poligono;

public class Cuadrado extends Poligono {
    private double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    public double calcularArea() {
        return lado * lado;
    }
}
