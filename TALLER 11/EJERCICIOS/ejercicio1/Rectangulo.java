package ejercicio1;

public class Rectangulo extends figura{

    private double lado;
    private double ancho;

    public  Rectangulo(double lado, double ancho) {
        super(lado,ancho);
        this.lado = lado;
        this.ancho = ancho;
    }

    @Override
    public double calcularArea() {
        double resultado = lado * ancho;
        return resultado;
    }
}