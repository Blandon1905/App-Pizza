import java.util.Scanner;

/**
 * Clase principal del sistema Pizza App
 * Contiene el menú interactivo en consola.
 */
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        GestionPedidos gestion = new GestionPedidos();

        int opcion;

        do {

            System.out.println("\n==============================");
            System.out.println("        SISTEMA PIZZA APP");
            System.out.println("==============================");
            System.out.println("1. Registrar Pizza");
            System.out.println("2. Deshacer (Undo)");
            System.out.println("3. Rehacer (Redo)");
            System.out.println("4. Mostrar Pedido Actual");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = scanner.nextInt();
            scanner.nextLine(); // limpiar buffer

            switch (opcion) {

                case 1:

                    System.out.print("\nNombre de la pizza: ");
                    String nombre = scanner.nextLine();

                    // Arreglo fijo de 3 ingredientes
                    String[] ingredientes = new String[3];

                    for (int i = 0; i < 3; i++) {

                        System.out.print("Ingrediente " + (i + 1) + ": ");
                        ingredientes[i] = scanner.nextLine();
                    }

                    Pizza pizza = new Pizza(nombre, ingredientes);

                    gestion.registrarPizza(pizza);

                    break;

                case 2:

                    gestion.deshacer();

                    break;

                case 3:

                    gestion.rehacer();

                    break;

                case 4:

                    gestion.mostrarPedidoActual();

                    break;

                case 0:

                    System.out.println("\nSaliendo del sistema...");

                    break;

                default:

                    System.out.println("\nOpción inválida.");

            }

        } while (opcion != 0);

        scanner.close();
    }
}