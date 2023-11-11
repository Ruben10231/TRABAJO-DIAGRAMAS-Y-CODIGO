package EJER_7;

class Supervisor extends Empleado {

    private String areaSupervisada;

    public Supervisor(String nombre, String puesto, double salarioBase, String areaSupervisada) {
        super(nombre, puesto, salarioBase);
        this.areaSupervisada = areaSupervisada;
    }

    @Override
    public void calcularSalario() {
        double salarioTotal = salarioBase + (salarioBase * 0.1); // Bono para supervisores
        System.out.println("El salario de " + nombre + " es: " + salarioTotal);
    }

    public void promoverSubordinado(Empleado subordinado) {
        System.out.println(nombre + " ha promovido a " + subordinado.nombre);
    }
}
