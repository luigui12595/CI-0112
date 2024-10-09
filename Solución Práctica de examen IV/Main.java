import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Crear un arreglo de 5 objetos Empleado
        Empleado[] empleados = new Empleado[5];
        
        // Recopilar datos para cada empleado (Ejercicio 2)
        for (int i = 0; i < empleados.length; i++) {
            System.out.print("Ingrese el ID del empleado: ");
            int id = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer
            System.out.print("Ingrese el nombre del empleado: ");
            String nombre = scanner.nextLine();
            System.out.print("Ingrese el salario del empleado: ");
            double salario = scanner.nextDouble();

            // Crear una instancia de Empleado y agregarla al arreglo
            empleados[i] = new Empleado(id, nombre, salario);
        }

        // Mostrar detalles de todos los empleados (Ejercicio 2)
        System.out.println("\nDetalles de los empleados:");
        for (Empleado emp : empleados) {
            emp.mostrarDetalles();
            System.out.println();
        }

        // Calcular el salario total de todos los empleados (Ejercicio 3)
        double salarioTotal = 0.0;
        for (Empleado emp : empleados) {
            salarioTotal += emp.getSalario();
        }
        System.out.println("El salario total de todos los empleados es: " + salarioTotal);

        // Encontrar al empleado con el salario más alto (Ejercicio 4)
        Empleado empleadoMayorSalario = empleados[0];
        for (Empleado emp : empleados) {
            if (emp.getSalario() > empleadoMayorSalario.getSalario()) {
                empleadoMayorSalario = emp;
            }
        }
        System.out.println("\nEmpleado con el salario más alto:");
        empleadoMayorSalario.mostrarDetalles();

        // Actualizar el salario de un empleado basado en su ID (Ejercicio 5)
        System.out.print("\nIngrese el ID del empleado cuyo salario desea actualizar: ");
        int idBuscado = scanner.nextInt();
        System.out.print("Ingrese el nuevo salario: ");
        double nuevoSalario = scanner.nextDouble();

        boolean encontrado = false;
        for (Empleado emp : empleados) {
            if (emp.getIdEmpleado() == idBuscado) {
                emp.setSalario(nuevoSalario);
                encontrado = true;
                System.out.println("Salario actualizado correctamente.");
                emp.mostrarDetalles();
                break;
            }
        }

        if (!encontrado) {
            System.out.println("No se encontró un empleado con ese ID.");
        }
    }
}
