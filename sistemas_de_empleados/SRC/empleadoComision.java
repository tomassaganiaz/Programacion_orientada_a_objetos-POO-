public class EmpleadoComision extends Empleado {
    private double ventas;
    private double porcentajeComision;

    public EmpleadoComision(String nombre, double salarioBase, double ventas, double porcentajeComision) {
        super(nombre, salarioBase);
        this.ventas = ventas;
        this.porcentajeComision = porcentajeComision;
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase() + (ventas * porcentajeComision);
    }
}
