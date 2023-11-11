package EJER_2_3;

public class Principal {

    public static void main(String[] args) {
        // Creamos un arreglo de tipo Empleado con 50 elementos
        Empleado[] empleados = new Empleado[50];

        // Luego llenamos el arreglo con datos correspondientes a 50 empleados
        for (int i = 0; i < 50; i++) {
            empleados[i] = new Empleado();
            System.out.println("\nEmpleado " + (i + 1) + ":");
            empleados[i].leerDatos();
        }

        // E imprimimos los datos de todos los empleados
        System.out.println("\nDatos de todos los empleados:\n");
        for (Empleado empleado : empleados) {
            empleado.verDatos();
            System.out.println();
        }
    }
}
