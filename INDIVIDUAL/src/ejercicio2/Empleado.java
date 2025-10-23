package ejercicio2;
public abstract class Empleado {
    protected String nombre;


    protected Empleado(String nombre) {
        this.nombre = nombre;
    }

    public abstract double calcularSalario();
    public void mostrarDetalle() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Salario: " + calcularSalario());
    }
    public static void main(String[] args) {
        Empleado gerente = new Gerente(100.0, "juan");
        Empleado vendedor = new Vendedor(50.0, "luis");
        gerente.mostrarDetalle();
        vendedor.mostrarDetalle();
    }
}
