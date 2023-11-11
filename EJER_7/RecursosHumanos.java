package EJER_7;

class RecursosHumanos extends Empleado {

    public RecursosHumanos(String nombre, String puesto, double salarioBase) {
        super(nombre, puesto, salarioBase);
    }

    public void jubilar(Empleado empleado) {
        System.out.println(nombre + " ha jubilado a " + empleado.nombre);
    }
}

class Sunat extends Empleado {

    public Sunat(String nombre, String puesto, double salarioBase) {
        super(nombre, puesto, salarioBase);
    }

    public void auditar(Empleado empleado) {
        System.out.println(nombre + " está auditando a " + empleado.nombre);
    }
}
