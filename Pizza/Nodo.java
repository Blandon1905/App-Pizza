/**
 * Clase Nodo
 * Representa un nodo dentro de la lista ligada.
 * Cada nodo contiene:
 * - Un objeto Pizza (dato)
 * - Un puntero al siguiente nodo
 */
public class Nodo {

    Pizza dato;      // Pizza almacenada en el nodo
    Nodo siguiente;  // Referencia al siguiente nodo en la lista

    /**
     * Constructor del nodo
     */
    public Nodo(Pizza dato) {
        this.dato = dato;
        this.siguiente = null;
    }
}