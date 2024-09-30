public class Main
{   
    public static void main(String[] args) {
        int[] numeros = new int[20];
        Vector vector = new Vector(numeros);
        vector.randomizeVector();
        System.out.println("Vector resultante: " + vector);
        //vector.busquedaSecuencial(10);
        System.out.println("Encontro el 100? " + vector.busquedaSecuencial(100));
        vector.paresImpares();
        vector.ordenamientoSeleccion();
        System.out.println("Vector ordenado: " + vector);
        vector.buscarDosMenores();
        vector.buscarDiferenciaEntreMayorYMenor();
    }
}