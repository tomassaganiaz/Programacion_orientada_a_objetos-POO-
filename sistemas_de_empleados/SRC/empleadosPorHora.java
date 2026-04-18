public class EmpleadoPorHora extends Empleado {
    private int horasTrabajadas;
    private double valorHora;

    public EmpleadoPorHora(String nombre, double salarioBase, int horasTrabajadas, double valorHora) {
        super(nombre, salarioBase);
        this.horasTrabajadas = horasTrabajadas;
        this.valorHora = valorHora;
    }

    @Override
    public double calcularSalario() {
        return horasTrabajadas * valorHora;
    }
}
