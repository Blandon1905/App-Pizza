/**
 * Clase Pizza
 * Representa el modelo de datos del pedido.
 * Cada pizza tiene un nombre y un arreglo fijo de 3 ingredientes.
 */
public class Pizza {

    private String nombre;
    private String[] ingredientes;

    /**
     * Constructor que recibe el nombre de la pizza
     * y el arreglo de ingredientes.
     */
    public Pizza(String nombre, String[] ingredientes) {
        this.nombre = nombre;
        this.ingredientes = ingredientes;
    }

    /**
     * Método que muestra la información de la pizza
     */
    public void mostrar() {

        System.out.println("\nPizza: " + nombre);
        System.out.println("Ingredientes:");

        for (int i = 0; i < ingredientes.length; i++) {
            System.out.println("- " + ingredientes[i]);
        }
    }
}