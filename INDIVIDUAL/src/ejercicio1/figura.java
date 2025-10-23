package ejercicio1;
public abstract class  figura {
    protected double x;
    protected double y;

    protected figura(double x, double y) {
        this.x = x;
        this.y = y;
    }

    protected abstract double calcularArea();

    public void mostrar(){
        System.out.println("La area del figura es: " + calcularArea());

    }

    public static void main(String[] args){

        figura rectangulo = new Rectangulo(4.5,5);
        figura circulo = new Circulo(1.5,1.5,1.5);
        rectangulo.mostrar();
        circulo.mostrar();
    }
}
