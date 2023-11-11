package EJER_7;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Empleado empleado = null;
        
        System.out.println("Seleccione el tipo de empleado:");
        System.out.println("1. Empleado Regular");
        System.out.println("2. Supervisor");
        System.out.println("3. Recursos Humanos");
        System.out.println("4. SUNAT");

        System.out.print("Ingrese su elección: ");
        int tipoEmpleado = scanner.nextInt();

        switch (tipoEmpleado) {
            case 1:
                empleado = new Empleado("Juan", "Operario", 1000.0);
                break;
            case 2:
                empleado = new Supervisor("Ana", "Supervisor", 1500.0, "Producción");
                break;
            case 3:
                empleado = new RecursosHumanos("Carlos", "Recursos Humanos", 2000.0);
                break;
            case 4:
                empleado = new Sunat("Luisa", "Auditor", 2500.0);
                break;
            default:
                System.out.println("Tipo de empleado no válido.");
                System.exit(1);
        }

        while (true) {
            System.out.println("\nMenú de empresa:");
            System.out.println("1. Calcular salario de empleado");
            System.out.println("2. Dar de alta a empleado");
            System.out.println("3. Despedir a empleado");
            System.out.println("4. Calcular aumento de salario de empleado");
            System.out.println("5. Promover subordinado (solo para supervisores)");
            System.out.println("6. Jubilar a empleado (solo para recursos humanos)");
            System.out.println("7. Auditar a empleado (solo para SUNAT)");
            System.out.println("8. Salir");

            System.out.print("Ingrese su elección: ");
            int opcion = scanner.nextInt();

            System.out.print("\n");

            switch (opcion) {
                case 1:
                    empleado.calcularSalario();
                    break;
                case 2:
                    empleado.darDeAlta();
                    break;
                case 3:
                    empleado.despedir();
                    break;
                case 4:
                    System.out.print("Ingrese el porcentaje de aumento: ");
                    double porcentajeAumento = scanner.nextDouble();
                    empleado.calcularAumentoSalario(porcentajeAumento);
                    break;
                case 5:
                    if (empleado instanceof Supervisor) {
                        Supervisor supervisorTemp = (Supervisor) empleado;
                        System.out.print("Ingrese el nombre del subordinado a promover: ");
                        String nombreSubordinado = scanner.next();
                        Empleado subordinado = new Empleado(nombreSubordinado, "Subordinado", 800.0);
                        supervisorTemp.promoverSubordinado(subordinado);
                    } else {
                        System.out.println("Esta opción solo está disponible para Supervisores.");
                    }
                    break;
                case 6:
                    if (empleado instanceof RecursosHumanos) {
                        RecursosHumanos rrhhTemp = (RecursosHumanos) empleado;
                        System.out.print("Ingrese el nombre del empleado a jubilar: ");
                        String nombreEmpleadoJubilado = scanner.next();
                        Empleado empleadoJubilado = new Empleado(nombreEmpleadoJubilado, "Jubilado", 500.0);
                        rrhhTemp.jubilar(empleadoJubilado);
                    } else {
                        System.out.println("Esta opción solo está disponible para Recursos Humanos.");
                    }
                    break;
                case 7:
                    if (empleado instanceof Sunat) {
                        Sunat sunatTemp = (Sunat) empleado;
                        System.out.print("Ingrese el nombre del empleado a auditar: ");
                        String nombreEmpleadoAuditar = scanner.next();
                        Empleado empleadoAuditar = new Empleado(nombreEmpleadoAuditar, "Auditable", 700.0);
                        sunatTemp.auditar(empleadoAuditar);
                    } else {
                        System.out.println("Esta opción solo está disponible para SUNAT.");
                    }
                    break;
                case 8:
                    System.out.println("Saliendo del Menú. ¡Hasta luego!");
                    System.exit(0);
                default:
                    System.out.println("Opción no válida. Ingrese un número entre 1 y 8.");
            }
        }
    }
}
