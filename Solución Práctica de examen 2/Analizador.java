// Class Analizador
public class Analizador {
    private int filaSecuencia;
    private int columnaSecuencia;
    private int largoSecuencia;

    public void identificarHileraMasLarga(int[][] matriz) {
        filaSecuencia = -1;
        columnaSecuencia = -1;
        largoSecuencia = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                buscarSecuencia(matriz, i, j, matriz[i][j] - 1, 0, i, j);
            }
        }

        System.out.println("Secuencia más larga inicia en fila: " + filaSecuencia + 
                           ", columna: " + columnaSecuencia + 
                           ", longitud: " + largoSecuencia);
    }

    private void buscarSecuencia(int[][] matriz, int fila, int columna, int anterior, int longitud, int filaInicial, int columnaInicial) {
        if (fila < 0 || columna < 0 || fila >= matriz.length || columna >= matriz[0].length ||
            matriz[fila][columna] != anterior + 1) {
            if (longitud > largoSecuencia) {
                largoSecuencia = longitud;
                filaSecuencia = filaInicial;
                columnaSecuencia = columnaInicial;
            }
            return;
        }
        int valorActual = matriz[fila][columna];
        matriz[fila][columna] = Integer.MIN_VALUE; // Mark as visited
        buscarSecuencia(matriz, fila + 1, columna, valorActual, longitud + 1, filaInicial, columnaInicial);
        buscarSecuencia(matriz, fila - 1, columna, valorActual, longitud + 1, filaInicial, columnaInicial);
        buscarSecuencia(matriz, fila, columna + 1, valorActual, longitud + 1, filaInicial, columnaInicial);
        buscarSecuencia(matriz, fila, columna - 1, valorActual, longitud + 1, filaInicial, columnaInicial);
        //Diagonals
        buscarSecuencia(matriz, fila + 1, columna + 1, valorActual, longitud + 1, filaInicial, columnaInicial);
        buscarSecuencia(matriz, fila - 1, columna - 1, valorActual, longitud + 1, filaInicial, columnaInicial);
        buscarSecuencia(matriz, fila - 1 , columna + 1, valorActual, longitud + 1, filaInicial, columnaInicial);
        buscarSecuencia(matriz, fila + 1, columna - 1, valorActual, longitud + 1, filaInicial, columnaInicial);
        matriz[fila][columna] = valorActual; // Restore original value
    }
}

