public class Empleado {
    // Atributos de la clase
    private int idEmpleado;
    private String nombre;
    private double salario;

    // Constructor de la clase
    public Empleado(int idEmpleado, String nombre, double salario) {
        this.idEmpleado = idEmpleado;
        this.nombre = nombre;
        this.salario = salario;
    }

    // Método para mostrar detalles del empleado
    public void mostrarDetalles() {
        System.out.println("ID Empleado: " + idEmpleado);
        System.out.println("Nombre: " + nombre);
        System.out.println("Salario: " + salario);
    }

    // Método para obtener el salario
    public double getSalario() {
        return salario;
    }

    // Método para obtener el ID del empleado
    public int getIdEmpleado() {
        return idEmpleado;
    }

    // Método para actualizar el salario del empleado
    public void setSalario(double salario) {
        this.salario = salario;
    }
}
