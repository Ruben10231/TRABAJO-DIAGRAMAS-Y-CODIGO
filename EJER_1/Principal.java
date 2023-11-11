package EJER_1;

public class Principal {

    public static void main(String[] args) {
        // Creamos dos objetos inicializados
        Hora hora1 = new Hora(5, 30, 45);
        Hora hora2 = new Hora(2, 15, 20);

        // Creamos un objeto no inicializado
        Hora resultado = new Hora();

        // Mostramos las horas iniciales
        System.out.println("Hora 1: ");
        hora1.mostrarHora();
        System.out.println("Hora 2: ");
        hora2.mostrarHora();

        // Sumamo las horas iniciales y dejamos el resultado en el objeto no inicializado
        resultado.sumarHoras(hora1);
        resultado.sumarHoras(hora2);

        // Mostramos el resultado final
        System.out.println("Resultado de la suma: ");
        resultado.mostrarHora();
    }
}
