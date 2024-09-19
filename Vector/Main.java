public class Main
{   
    public static void main(String[] args) {
        int[] numeros = new int[20];
        Vector vector = new Vector(numeros);
        vector.randomizeVector();
        System.out.println("Vector resultante: " + vector);
        // Ordenamiento por seleccion
        vector.ordenamientoSeleccion();
        System.out.println("Vector resultante ordenado: " + vector);
        
        vector.busquedaSecuencial(10);
        
        boolean encontro = vector.busquedaBinaria(100);
        System.out.println("Encontro el 100? " + encontro);
    }
}