package ejercicio1;

public class Circulo extends figura {
    private double radio;
    protected Circulo(double radio,double x, double y) {
        super(x, y);
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        double pi = 3.14;
        double resultado = pi * radio * radio;
        return resultado;
    }
}