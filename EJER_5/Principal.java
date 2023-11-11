package EJER_5;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        // Creamos un objeto de tipo Cadena
        Cadena miCadena = new Cadena("Hola, Mundo!");

        System.out.println("Cadena:");
        miCadena.visualizar(); // Miramos esa cadena

        // Solicitamos al usuario que ingrese la posición
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la posición para obtener el carácter: ");
        int posicion = scanner.nextInt();

        // Y obtenemos el caracter en la posición ingresada
        char caracterEnPosicion = miCadena.caracter(posicion);
        
        if (caracterEnPosicion != '\0') { // si no es nulo...
            System.out.printf("Caracter en la posición %d: %c%n", posicion, caracterEnPosicion);
        } else { // si es nulo...
            System.out.println("Posición inválida. No se encontró ningún caracter.");
        }
    }
}
