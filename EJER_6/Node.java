package EJER_6;

// Clase que representa un nodo en la red LAN
class Node {

    private String tipo;
    private String nombre;

    public Node(String tipo, String nombre) {
        this.tipo = tipo;
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return tipo + " Nodo: " + nombre;
    }
}
