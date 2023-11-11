package EJER_7;

class Empleado {

    protected String nombre;
    protected String puesto;
    protected double salarioBase;

    public Empleado(String nombre, String puesto, double salarioBase) {
        this.nombre = nombre;
        this.puesto = puesto;
        this.salarioBase = salarioBase;
    }

    public void calcularSalario() {
        System.out.println("El salario de " + nombre + " es: " + salarioBase);
    }

    public void darDeAlta() {
        System.out.println(nombre + " ha sido dado de alta.");
    }

    public void despedir() {
        System.out.println(nombre + " ha sido despedido.");
    }

    public void calcularAumentoSalario(double porcentaje) {
        double aumento = salarioBase * (porcentaje / 100);
        salarioBase += aumento;
        System.out.println("Aumento de salario aplicado. Nuevo salario de " + nombre + ": " + salarioBase);
    }
}
