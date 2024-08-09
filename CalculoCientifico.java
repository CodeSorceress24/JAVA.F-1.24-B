package Legado;

public class CalculoCientifico {

    double pi;

    public CalculoCientifico() {
        pi = Math.PI;
    }

    public double calcularSeno(double angulo) {
        return Math.sin(Math.toRadians(angulo));
    }

    public double calcularCosseno(double angulo) {
        return Math.cos(Math.toRadians(angulo));
    }

    public double calcularTangente(double angulo) {
        return Math.tan(Math.toRadians(angulo));
    }

    public double calcularLogaritmo(double valor) {
        return Math.log(valor);
    }

    public double calcularLogaritmoBase10(double valor) {
        return Math.log10(valor);
    }

    public double calcularRaizQuadrada(double valor) {
        return Math.sqrt(valor);
    }
}