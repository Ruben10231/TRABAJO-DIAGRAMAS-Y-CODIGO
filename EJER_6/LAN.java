package EJER_6;

import java.util.ArrayList;
import java.util.List;

// Clase base o raíz
class LAN {

    List<Node> nodos;
    private String topologia;
    private int tamanoPaquete;

    public LAN() {
        nodos = new ArrayList<>();
        topologia = "Por defecto";
        tamanoPaquete = 512; // Tamaño por defecto del paquete
    }

    public void agregarNodo(Node nodo) {
        nodos.add(nodo);
    }

    public void eliminarNodo(Node nodo) {
        nodos.remove(nodo);
    }

    public void listarNodos() {
        System.out.println("Nodos en la LAN:");
        for (Node nodo : nodos) {
            System.out.println("- " + nodo);
        }
    }

    public void configurarTopologia(String topologia) {
        this.topologia = topologia;
        System.out.println("Configurando topología: " + topologia);
    }

    public void establecerTamanoPaquete(int tamano) {
        this.tamanoPaquete = tamano;
        System.out.println("\nEstableciendo tamaño de paquete a: " + tamano + " bytes");
    }

    public void enviarPaquete(Node origen, Node destino, String mensaje) {
        System.out.println("\nEnviando paquete desde " + origen + " hacia " + destino + ": " + mensaje);
        // Simulación de la transmisión del paquete
        System.out.println("Paquete enviado con éxito.");
    }

    public void difundirPaquete(Node origen, String mensaje) {
        System.out.println("\nDifundiendo paquete desde " + origen + ": " + mensaje);
        // Simulación de la difusión del paquete a todos los nodos
        for (Node nodo : nodos) {
            if (!nodo.equals(origen)) {
                System.out.println("Paquete recibido en " + nodo);
            }
        }
    }

    public void calcularTiempoPromedio() {
        System.out.println("\nCalculando tiempo promedio de paquete");
        // Simulación del cálculo del tiempo promedio
        System.out.println("Tiempo promedio calculado: 5 ms");
    }
}
