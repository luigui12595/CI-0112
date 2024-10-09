import java.util.Random;

public class Vector
{
    int[] vector;
    
    public Vector(int[] vector) {
        this.vector = vector;
    }
    
    public void setVector(int[] vector) {
        this.vector = vector;
    }
    
    public void ordenamientoSeleccion() {
        for (int i = 0; i < vector.length - 1; ++i) {
            int menor = vector[i];
            int posicionMenor = i;
            
            // Busco el menor
            for (int j = i + 1; j < vector.length; ++j) {
                if (vector[j] < menor) {
                    menor = vector[j];
                    posicionMenor = j;      
                }
            }
            
            // Intercambiar el numero menor al principio del resto del vector
            if (posicionMenor != i) {
                int temp = vector[i];
                vector[i] = vector[posicionMenor];
                vector[posicionMenor] = temp;
            }
        }
    }
    
    public int busquedaSecuencial(int valorAEncontrar) {
        int indice = -1;
        
        for (int i = 0; i < vector.length; ++i) {
           if (vector[i] == valorAEncontrar) {
               indice = i;
               i = vector.length;
            } 
        }
        
        // Otra opcion
        /*
        int j = 0;
        while(indice == -1 && j < vector.length) {
            if (vector[j] == valorAEncontrar) {
               indice = j;
            }
            ++j;
           System.out.println("Indice = " + indice); 
        }
        */
        return indice;
    }

    public boolean busquedaBinaria(int valorAEncontrar) {
        return busquedaBinaria(valorAEncontrar, vector);
    }
    
    public boolean busquedaBinaria(int valorAEncontrar, int[] numeros) {
        int mitad = numeros.length/2;
                
        if (numeros[mitad] == valorAEncontrar) {
            // encontre el valor
            return true;
        } else if(numeros.length == 1) { // mitad es cero
            return false;
        } else if (numeros[mitad] > valorAEncontrar) {
            // mi numero esta antes de la mitad del vector
            int[] nuevoVector = new int[mitad];
            for (int i = 0; i < nuevoVector.length; ++i ) {
                nuevoVector[i] = numeros[i];
            }
            System.out.println(getVectorString(nuevoVector));
            return busquedaBinaria(valorAEncontrar, nuevoVector);
        } else {
            // mi numero esta despues de la mitad
            int tamanoVector = numeros.length % 2 == 0 ? (numeros.length - mitad) : (numeros.length - mitad - 1);
            int[] nuevoVector = new int[tamanoVector];
            int sumar = numeros.length % 2 == 0 ? 0 : 1;
            for (int i = 0; i < nuevoVector.length; ++i ) {
                nuevoVector[i] = numeros[mitad + sumar + i];
            }
            System.out.println(getVectorString(nuevoVector));
            return busquedaBinaria(valorAEncontrar, nuevoVector);
        }
    }
    
    private String getVectorString(int[] v) {
        String resp = "[";
        for (int j = 0; j < v.length; ++j) {
            resp += v[j];
            if(j != v.length - 1){
                resp += ", ";
            }
        }
        resp += "]";
        return resp;
    }
    
    public String toString() {
        return getVectorString(vector);
    }
    
    public void randomizeVector(){
        Random rand = new Random();
        for (int i = 0; i < this.vector.length - 1; ++i) {
            // Generate random integers in range 0 to 999
            this.vector[i] = rand.nextInt(101);
        }
    }

    public void paresImpares() {
        int impares = 0, pares = 0;
        
        
        for (int i = 0; i < this.vector.length; ++i) {
           if (this.vector[i] % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }
        
        System.out.println("Cantidad de pares: " + pares);
        System.out.println("Cantidad de impares: " + impares);
    }
    
    public int buscarDiferenciaEntreMayorYMenor() {
        int mayor = this.vector[0];
        int menor = this.vector[0];
    
        for (int i = 1; i < this.vector.length; ++i) {
            if (this.vector[i] > mayor) {
                mayor = this.vector[i];
            }
    
            if (this.vector[i] < menor) {
                menor = this.vector[i];
            }
        }
    
        int diferencia = mayor - menor;
        System.out.println("La diferencia entre el número más grande y el más pequeño es: " + diferencia);
        return diferencia;
    }

    public void buscarDosMenores() {
        int menor = this.vector[0];
        int segundoMenor = Integer.MAX_VALUE;
    
        for (int i = 1; i < this.vector.length; ++i) {
            if (this.vector[i] < menor) {
                segundoMenor = menor;
                menor = this.vector[i];
            } else if (this.vector[i] < segundoMenor && this.vector[i] != menor) {
                segundoMenor = this.vector[i];
            }
        }
    
        System.out.println("El número más pequeño es: " + menor);
        System.out.println("El segundo número más pequeño es: " + segundoMenor);
    }
}