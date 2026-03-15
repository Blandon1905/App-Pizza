// Pila.java
/**
 * Clase Pila
 * Implementa una pila manual utilizando una lista ligada.
 *
 * La pila funciona con la lógica LIFO:
 * Last In - First Out
 * (El último en entrar es el primero en salir)
 */
public class Pila {

    private Nodo tope; // Referencia al nodo que está en el tope de la pila

    /**
     * Constructor de la pila
     */
    public Pila() {
        tope = null;
    }

    /**
     * push()
     * Inserta un nuevo elemento en el tope de la pila.
     *
     * Lógica:
     * 1. Se crea un nuevo nodo con la pizza.
     * 2. El puntero "siguiente" del nuevo nodo apunta al nodo
     *    que antes era el tope.
     * 3. El nuevo nodo se convierte en el nuevo tope.
     */
    public void push(Pizza pizza) {

        Nodo nuevo = new Nodo(pizza);

        // El nuevo nodo apunta al nodo que antes era el tope
        nuevo.siguiente = tope;

        // Ahora el nuevo nodo se convierte en el nuevo tope
        tope = nuevo;
    }

    /**
     * pop()
     * Elimina el elemento que está en el tope de la pila
     * y retorna su contenido.
     *
     * Lógica:
     * 1. Se guarda el dato del nodo que está en el tope.
     * 2. El puntero "tope" se mueve al siguiente nodo.
     * 3. El nodo anterior queda fuera de la pila.
     */
    public Pizza pop() {

        if (isEmpty()) {
            return null;
        }

        // Guardamos el dato del nodo superior
        Pizza dato = tope.dato;

        // El puntero tope se mueve al siguiente nodo
        tope = tope.siguiente;

        return dato;
    }

    /**
     * peek()
     * Permite ver el elemento del tope sin eliminarlo.
     */
    public Pizza peek() {

        if (isEmpty()) {
            return null;
        }

        return tope.dato;
    }

    /**
     * isEmpty()
     * Verifica si la pila está vacía.
     */
    public boolean isEmpty() {
        return tope == null;
    }
}