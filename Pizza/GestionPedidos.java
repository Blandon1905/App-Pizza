/**
 * Clase GestionPedidos
 *
 * Se encarga de administrar las operaciones del sistema
 * utilizando dos pilas:
 *
 * pilaPrincipal -> almacena pedidos activos
 * pilaSecundaria -> almacena pedidos deshechos (para rehacer)
 */
public class GestionPedidos {

    private Pila pilaPrincipal;
    private Pila pilaSecundaria;

    public GestionPedidos() {

        pilaPrincipal = new Pila();
        pilaSecundaria = new Pila();
    }

    /**
     * Registrar una nueva pizza en el sistema
     */
    public void registrarPizza(Pizza pizza) {

        // Se agrega la pizza al tope de la pila principal
        pilaPrincipal.push(pizza);

        // Cuando se registra un nuevo pedido,
        // se limpia la pila de rehacer
        pilaSecundaria = new Pila();

        System.out.println("\nPedido registrado correctamente.");
    }

    /**
     * Deshacer el último pedido
     */
    public void deshacer() {

        if (pilaPrincipal.isEmpty()) {

            System.out.println("\nNo hay pedidos para deshacer.");
            return;
        }

        // Se elimina el pedido del tope de la pila principal
        Pizza pizza = pilaPrincipal.pop();

        // Se guarda en la pila secundaria
        pilaSecundaria.push(pizza);

        System.out.println("\nSe deshizo el último pedido.");
    }

    /**
     * Rehacer el último pedido deshecho
     */
    public void rehacer() {

        if (pilaSecundaria.isEmpty()) {

            System.out.println("\nNo hay pedidos para rehacer.");
            return;
        }

        // Se retira de la pila secundaria
        Pizza pizza = pilaSecundaria.pop();

        // Se devuelve a la pila principal
        pilaPrincipal.push(pizza);

        System.out.println("\nPedido restaurado correctamente.");
    }

    /**
     * Mostrar el pedido que está en el tope de la pila
     */
    public void mostrarPedidoActual() {

        Pizza pizza = pilaPrincipal.peek();

        if (pizza == null) {

            System.out.println("\nNo hay pedidos registrados.");

        } else {

            System.out.println("\nPedido actual listo para preparación:");
            pizza.mostrar();
        }
    }
}