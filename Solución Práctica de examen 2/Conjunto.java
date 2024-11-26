// Class Conjunto implemented as Binary Search Tree
class Conjunto {
    private class Nodo {
        int valor;
        Nodo izquierdo, derecho;

        Nodo(int valor) {
            this.valor = valor;
        }
    }

    private Nodo raiz;

    public void insertar(int valor) {
        raiz = insertarRec(raiz, valor);
    }

    private Nodo insertarRec(Nodo nodo, int valor) {
        if (nodo == null) return new Nodo(valor);
        if (valor < nodo.valor) nodo.izquierdo = insertarRec(nodo.izquierdo, valor);
        else if (valor > nodo.valor) nodo.derecho = insertarRec(nodo.derecho, valor);
        return nodo;
    }

    public boolean existe(int valor) {
        return buscar(raiz, valor);
    }

    private boolean buscar(Nodo nodo, int valor) {
        if (nodo == null) return false;
        if (valor == nodo.valor) return true;
        return valor < nodo.valor ? buscar(nodo.izquierdo, valor) : buscar(nodo.derecho, valor);
    }

    public boolean estaVacio() {
        return raiz == null;
    }

    public void imprimir() {
        System.out.print("{ ");
        imprimirRec(raiz);
        System.out.println("}");
    }

    private void imprimirRec(Nodo nodo) {
        if (nodo != null) {
            imprimirRec(nodo.izquierdo);
            System.out.print(nodo.valor + " ");
            imprimirRec(nodo.derecho);
        }
    }

    public Conjunto union(Conjunto otro) {
        Conjunto resultado = new Conjunto();
        agregarTodos(this.raiz, resultado);
        agregarTodos(otro.raiz, resultado);
        return resultado;
    }

    public Conjunto interseccion(Conjunto otro) {
        Conjunto resultado = new Conjunto();
        agregarSiExiste(this.raiz, otro, resultado);
        return resultado;
    }

    public Conjunto diferencia(Conjunto otro) {
        Conjunto resultado = new Conjunto();
        agregarSiNoExiste(this.raiz, otro, resultado);
        agregarSiNoExiste(otro.raiz, this, resultado);
        return resultado;
    }

    private void agregarTodos(Nodo nodo, Conjunto conjunto) {
        if (nodo != null) {
            conjunto.insertar(nodo.valor);
            agregarTodos(nodo.izquierdo, conjunto);
            agregarTodos(nodo.derecho, conjunto);
        }
    }

    private void agregarSiExiste(Nodo nodo, Conjunto otro, Conjunto resultado) {
        if (nodo != null) {
            if (otro.existe(nodo.valor)) resultado.insertar(nodo.valor);
            agregarSiExiste(nodo.izquierdo, otro, resultado);
            agregarSiExiste(nodo.derecho, otro, resultado);
        }
    }

    private void agregarSiNoExiste(Nodo nodo, Conjunto otro, Conjunto resultado) {
        if (nodo != null) {
            if (!otro.existe(nodo.valor)) resultado.insertar(nodo.valor);
            agregarSiNoExiste(nodo.izquierdo, otro, resultado);
            agregarSiNoExiste(nodo.derecho, otro, resultado);
        }
    }
}
