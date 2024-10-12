import java.io.*;
import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        // 1. Manejo de archivos
        System.out.println("=== Manejo de Archivos ===");
        String fileName = "ejemplo.txt";
        try {
            // Escritura de archivo usando FileWriter (flujo de caracteres)
            FileWriter writer = new FileWriter(fileName);
            writer.write("Esto es una línea escrita en el archivo.\n");
            writer.close();

            // Lectura de archivo usando FileReader (flujo de caracteres)
            FileReader reader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(reader);
            String line;
            System.out.println("Contenido del archivo:");
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();

            // Escritura y lectura con flujo de bytes
            FileOutputStream fos = new FileOutputStream("ejemplo_bytes.txt");
            fos.write("Texto en bytes".getBytes());
            fos.close();
            
            FileInputStream fis = new FileInputStream("ejemplo_bytes.txt");
            System.out.println("Lectura del archivo en bytes:");
            int content;
            while ((content = fis.read()) != -1) {
                System.out.print((char) content);
            }
            System.out.println();
            fis.close();

        } catch (IOException e) {
            System.out.println("Ocurrió un error al manejar archivos.");
            e.printStackTrace();
        }

        // 2. Uso de Scanner y Formatter
        System.out.println("\n=== Uso de Scanner y Formatter ===");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();
        Formatter formatter = new Formatter();
        formatter.format("Hola, %s! Bienvenido.\n", nombre);
        System.out.print(formatter);
        formatter.close();

        // 3. Clase String y StringBuilder
        System.out.println("\n=== String y StringBuilder ===");
        String cadena1 = "Hola";
        String cadena2 = "Mundo";
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(cadena1).append(" ").append(cadena2);
        System.out.println("Usando StringBuilder: " + stringBuilder.toString());

        // Comparación de Strings
        System.out.println("Comparación de Strings (cadena1 vs cadena2): " + cadena1.equals(cadena2));

        // 4. Clase Character
        System.out.println("\n=== Clase Character ===");
        char c1 = 'A';
        char c2 = 'a';
        System.out.println("Comparando caracteres (c1 vs c2): " + Character.compare(c1, c2));
        System.out.println("Es c1 una letra?: " + Character.isLetter(c1));

        // 5. Colecciones: Arrays y ArrayList
        System.out.println("\n=== Colecciones: Arrays y ArrayList ===");
        // Arrays
        int[] arrayNumeros = {5, 3, 8, 1, 2};
        Arrays.sort(arrayNumeros);  // Ordenamiento
        System.out.println("Array ordenado: " + Arrays.toString(arrayNumeros));

        // ArrayList
        ArrayList<String> listaNombres = new ArrayList<>();
        listaNombres.add("Ana");
        listaNombres.add("Pedro");
        listaNombres.add("Juan");
        System.out.println("ArrayList original: " + listaNombres);

        // Ordenar y comparar ArrayList
        Collections.sort(listaNombres);
        System.out.println("ArrayList ordenado: " + listaNombres);
        System.out.println("Comparación (Ana vs Juan): " + listaNombres.get(0).compareTo(listaNombres.get(1)));

        scanner.close();
    }
}
