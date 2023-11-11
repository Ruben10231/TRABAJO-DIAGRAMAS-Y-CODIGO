package EJER_6;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        LAN lan = new LAN();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenú de red LAN:");
            System.out.println("1. Listar Nodos");
            System.out.println("2. Agregar Nodo");
            System.out.println("3. Eliminar Nodo");
            System.out.println("4. Configurar Topología");
            System.out.println("5. Establecer Tamaño de Paquete");
            System.out.println("6. Enviar Paquete");
            System.out.println("7. Difundir Paquete");
            System.out.println("8. Calcular Tiempo Promedio");
            System.out.println("9. Salir");

            System.out.print("Ingresa una opción: ");
            int eleccion = scanner.nextInt();

            System.out.print("\n");

            switch (eleccion) {
                case 1:
                    lan.listarNodos();
                    break;
                case 2:
                    scanner.nextLine(); // Limpiar el buffer
                    System.out.print("Ingresa el tipo de nodo: ");
                    String tipo = scanner.nextLine();
                    System.out.print("Ingresa el nombre del nodo: ");
                    String nombre = scanner.nextLine();
                    lan.agregarNodo(new Node(tipo, nombre));
                    break;

                case 3:
                    scanner.nextLine(); // Limpiar el buffer
                    System.out.print("Ingresa el nombre del nodo a eliminar: ");
                    String nombreNodo = scanner.nextLine();
                    Node nodoEliminar = lan.nodos.stream()
                            .filter(nodo -> nodo.toString().contains(nombreNodo))
                            .findFirst()
                            .orElse(null);
                    if (nodoEliminar != null) {
                        lan.eliminarNodo(nodoEliminar);
                        System.out.println("Nodo eliminado exitosamente.");
                    } else {
                        System.out.println("Nodo no encontrado.");
                    }
                    break;

                case 4:
                    scanner.nextLine(); // Limpiar el buffer
                    System.out.print("Ingresa la topología (Estrella/Bus): ");
                    String topologia = scanner.nextLine();
                    lan.configurarTopologia(topologia);
                    break;
                case 5:
                    System.out.print("Ingresa el tamaño del paquete (en bytes): ");
                    int tamanoPaquete = scanner.nextInt();
                    lan.establecerTamanoPaquete(tamanoPaquete);
                    break;
                case 6:
                    scanner.nextLine(); // Limpiar el buffer
                    System.out.print("Ingrese el nombre del nodo de origen: ");
                    String nombreOrigen = scanner.nextLine();
                    System.out.print("Ingrese el nombre del nodo de destino: ");
                    String nombreDestino = scanner.nextLine();
                    System.out.print("Ingrese el mensaje a enviar: ");
                    String mensajeEnvio = scanner.nextLine();

                    Node nodoOrigen = lan.nodos.stream()
                            .filter(nodo -> nodo.toString().contains(nombreOrigen))
                            .findFirst()
                            .orElse(null);

                    Node nodoDestino = lan.nodos.stream()
                            .filter(nodo -> nodo.toString().contains(nombreDestino))
                            .findFirst()
                            .orElse(null);

                    if (nodoOrigen != null && nodoDestino != null) {
                        lan.enviarPaquete(nodoOrigen, nodoDestino, mensajeEnvio);
                    } else {
                        System.out.println("Nodo de origen o destino no encontrado.");
                    }
                    break;

                case 7:
                    scanner.nextLine(); // Limpiar el buffer
                    System.out.print("Ingrese el nombre del nodo de origen: ");
                    String nombreOrigenBroadcast = scanner.nextLine();
                    System.out.print("Ingrese el mensaje a difundir: ");
                    String mensajeDifusion = scanner.nextLine();

                    Node nodoOrigenBroadcast = lan.nodos.stream()
                            .filter(nodo -> nodo.toString().contains(nombreOrigenBroadcast))
                            .findFirst()
                            .orElse(null);

                    if (nodoOrigenBroadcast != null) {
                        lan.difundirPaquete(nodoOrigenBroadcast, mensajeDifusion);
                    } else {
                        System.out.println("Nodo de origen no encontrado.");
                    }
                    break;

                case 8:
                    lan.calcularTiempoPromedio();
                    break;
                case 9:
                    System.out.println("Saliendo de la Simulación LAN. ¡Hasta luego!");
                    System.exit(0);
                default:
                    System.out.println("Selección no válida. Por favor, ingresa un número entre 1 y 9.");
            }
        }
    }
}
