import java.util.Scanner;

/**
 * Write a description of class ScannerTest here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ScannerTest
{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Medir el tiempo de la parte lógica
        long startTime = System.currentTimeMillis(); // Capturar el tiempo de inicio

        // Problema 1
        System.out.println("Problema 1: Operaciones Básicas con Tres Enteros");
        System.out.print("Ingrese el primer número entero: ");
        int num1 = scanner.nextInt();
        System.out.print("Ingrese el segundo número entero: ");
        int num2 = scanner.nextInt();
        System.out.print("Ingrese el tercer número entero: ");
        int num3 = scanner.nextInt();

        
        long endTime = System.currentTimeMillis(); // Capturar el tiempo de finalización
        long duration = endTime - startTime; // Calcular la duración

        // Mostrar el tiempo de ejecución de la parte lógica
        System.out.println("Tiempo de ejecución de la parte lógica: " + duration + " milisegundos");

        scanner.close();
    }
}

