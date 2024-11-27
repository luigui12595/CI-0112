
// Solution for PracticaExamenII
// Main class to interact with the user

public class Main {
    public static void main(String[] args) {
        /*
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese valores para el primer conjunto separados por espacio:");
        Conjunto c1 = new Conjunto();
        for (String s : sc.nextLine().split(" ")) {
            c1.insertar(Integer.parseInt(s));
        }

        System.out.println("Ingrese valores para el segundo conjunto separados por espacio:");
        Conjunto c2 = new Conjunto();
        for (String s : sc.nextLine().split(" ")) {
            c2.insertar(Integer.parseInt(s));
        }

        System.out.print("Conjunto 1: ");
        c1.imprimir();
        System.out.print("Conjunto 2: ");
        c2.imprimir();

        Conjunto union = c1.union(c2);
        System.out.print("Unión: ");
        union.imprimir();

        Conjunto interseccion = c1.interseccion(c2);
        System.out.print("Intersección: ");
        interseccion.imprimir();

        Conjunto diferencia = c1.diferencia(c2);
        System.out.print("Diferencia Simétrica: ");
        diferencia.imprimir();

        sc.close();
        */

        Analizador analizador = new Analizador();
        int matriz[][] = {
            {1, 2, 9},
            {5, 3, 8},
            {6, 7, 0}
        };


        analizador.identificarHileraMasLarga(matriz);


    }
}