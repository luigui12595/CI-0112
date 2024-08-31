import java.util.Scanner;

public class Simulacion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nombre_aux;
        double balance_aux;
        
        // Creación de 5 cuentas bancarias como variables individuales
        System.out.print("Ingrese el nombre del titular para la cuenta 1: ");
        nombre_aux = scanner.nextLine();
        System.out.print("Ingrese el balance inicial: ");
        balance_aux = scanner.nextDouble();
        scanner.nextLine();
        CuentaBancaria cuenta1 = new CuentaBancaria(nombre_aux, balance_aux);

        System.out.print("Ingrese el nombre del titular para la cuenta 2: ");
        nombre_aux = scanner.nextLine();
        System.out.print("Ingrese el balance inicial: ");
        balance_aux = scanner.nextDouble();
        scanner.nextLine();
        CuentaBancaria cuenta2 = new CuentaBancaria(nombre_aux, balance_aux);

        System.out.print("Ingrese el nombre del titular para la cuenta 3: ");
        nombre_aux = scanner.nextLine();
        System.out.print("Ingrese el balance inicial: ");
        balance_aux = scanner.nextDouble();
        scanner.nextLine();
        CuentaBancaria cuenta3 = new CuentaBancaria(nombre_aux, balance_aux);

        System.out.print("Ingrese el nombre del titular para la cuenta 4: ");
        nombre_aux = scanner.nextLine();
        System.out.print("Ingrese el balance inicial: ");
        balance_aux = scanner.nextDouble();
        scanner.nextLine();
        CuentaBancaria cuenta4 = new CuentaBancaria(nombre_aux, balance_aux);

        System.out.print("Ingrese el nombre del titular para la cuenta 5: ");
        nombre_aux = scanner.nextLine();
        System.out.print("Ingrese el balance inicial: ");
        balance_aux = scanner.nextDouble();
        scanner.nextLine();
        CuentaBancaria cuenta5 = new CuentaBancaria(nombre_aux, balance_aux);

        // Menú interactivo
        int opcion;
        do {
            System.out.println("\n----- Menú de Operaciones -----");
            System.out.println("1. Mostrar información de una cuenta");
            System.out.println("2. Realizar un retiro");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    mostrarInformacionCuenta(seleccionarCuenta(scanner, cuenta1, cuenta2, cuenta3, cuenta4, cuenta5));
                    break;
                case 2:
                    realizarRetiroCuenta(scanner, seleccionarCuenta(scanner, cuenta1, cuenta2, cuenta3, cuenta4, cuenta5));
                    break;
                case 3:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
            }
        } while (opcion != 3);

        scanner.close();
    }

    private static CuentaBancaria seleccionarCuenta(Scanner scanner, CuentaBancaria cuenta1, CuentaBancaria cuenta2, CuentaBancaria cuenta3, CuentaBancaria cuenta4, CuentaBancaria cuenta5) {
        System.out.print("Ingrese el número de cuenta (1-5): ");
        int numCuenta = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer
        switch (numCuenta) {
            case 1:
                return cuenta1;
            case 2:
                return cuenta2;
            case 3:
                return cuenta3;
            case 4:
                return cuenta4;
            case 5:
                return cuenta5;
            default:
                System.out.println("Número de cuenta inválido.");
                return null;
        }
    }

    private static void mostrarInformacionCuenta(CuentaBancaria cuenta) {
        if (cuenta != null) {
            cuenta.mostrarInformacion();
        }
    }

    private static void realizarRetiroCuenta(Scanner scanner, CuentaBancaria cuenta) {
        if (cuenta != null) {
            System.out.print("Ingrese el monto a retirar: ");
            double montoRetiro = scanner.nextDouble();
            cuenta.retiro(montoRetiro);
        }
    }
}