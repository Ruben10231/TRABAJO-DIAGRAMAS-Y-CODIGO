package EJER_5;

class Cadena {

    private int longitud;
    private String cadena;

    // Constructor por defecto
    public Cadena() {
    }

    // Constructor que inicializa la cadena con un valor dado
    public Cadena(String cadena) {
        this.longitud = cadena.length(); // Obtenemos la longitud de la cadena
        this.cadena = cadena; // Obtenemos la cadena
    }

    // Método de acceso para la longitud
    public int getLongitud() {
        return longitud;
    }

    // Método para obtener el carácter en la posición i
    public char caracter(int i) {
        // Devuelve el carácter en la posición i si el índice es válido, de lo contrario, '\0'
        return (i >= 0 && i < longitud) ? cadena.charAt(i) : '\0';
    }

    // Método para visualizar la cadena
    public void visualizar() {
        System.out.println(cadena);
    }
}
