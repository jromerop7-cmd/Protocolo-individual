package ejercicio2;

public class Gerente extends Empleado{

    private double precio;

    protected Gerente(double precio, String nombre){
        super(nombre);
        this.precio = precio;
    }


    @Override
    public double calcularSalario() {
        int horasTrabajadas = 8;
        double salarioGerente = horasTrabajadas * this.precio;
        return salarioGerente;
    }
}
