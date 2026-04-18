import java.util.ArrayList;
import java.util.List;

public class SistemaEmpleados {
    public static void main(String[] args) {
        List<Empleado> empleados = new ArrayList<>();

        empleados.add(new EmpleadoTiempoCompleto("Ana", 50000));
        empleados.add(new EmpleadoPorHora("Luis", 0, 120, 400));
        empleados.add(new EmpleadoComision("Carla", 30000, 200000, 0.05));
        empleados.add(new EmpleadoFreelance("Tomás", 0, 3, 15000));

        for (Empleado emp : empleados) {
            emp.mostrarInfo();
            System.out.println("Salario calculado: " + emp.calcularSalario());
            System.out.println("-----------------------------------");
        }
    }
}
