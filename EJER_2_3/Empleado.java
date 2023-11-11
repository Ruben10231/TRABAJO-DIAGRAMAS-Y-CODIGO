package EJER_2_3;

import java.util.Scanner;

class Empleado {

    private String nombre;
    private int numeroEmpleado;

    // Método para leer los datos del teclado
    public void leerDatos() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nombres del empleado: ");
        this.nombre = scanner.nextLine();

        System.out.print("Número del empleado: ");
        this.numeroEmpleado = scanner.nextInt();
    }

    // Método para visualizar los datos en pantalla
    public void verDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Número de empleado: " + numeroEmpleado);
    }
}
