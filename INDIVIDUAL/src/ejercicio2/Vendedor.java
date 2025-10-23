package ejercicio2;

public class Vendedor extends Empleado {
    private double salario;

    protected Vendedor(double salario, String nombre) {
        super(nombre);
        this.salario = salario;
    }

    @Override
    public double calcularSalario() {
        int horasTrabajadas = 8;
        double salarioVendedor = salario * horasTrabajadas;
        return salarioVendedor;
    }

}