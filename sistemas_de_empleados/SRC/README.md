# Sistema de Empleados

## 📌 Descripción
Este proyecto implementa un sistema básico de empleados en **Java** utilizando **herencia, abstracción y polimorfismo**.  
El objetivo es mostrar cómo diferentes tipos de empleados comparten una estructura común pero calculan su salario de manera distinta.

## 🏗️ Estructura del proyecto
El sistema está compuesto por las siguientes clases:

- **Empleado (abstracta)**  
  Clase base con atributos comunes (`nombre`, `salarioBase`) y un método abstracto `calcularSalario()`.  
  Incluye el método `mostrarInfo()` para imprimir datos básicos del empleado.

- **EmpleadoTiempoCompleto**  
  Cobra un salario fijo (`salarioBase`).

- **EmpleadoPorHora**  
  Calcula el salario en base a las horas trabajadas y el valor por hora.

- **EmpleadoComision**  
  Cobra un salario base más un porcentaje de comisión sobre ventas.

- **EmpleadoFreelance (extra)**  
  Cobra en función de la cantidad de proyectos realizados y el pago por proyecto.

- **SistemaEmpleados (main)**  
  Contiene el método `main` que crea una lista de empleados, recorre cada uno y muestra su información junto con el salario calculado.

## 📂 Organización de archivos


src/
├── Empleado.java
├── EmpleadoTiempoCompleto.java
├── EmpleadoPorHora.java
├── EmpleadoComision.java
├── EmpleadoFreelance.java
└── SistemaEmpleados.java