package EJER_4;

public class Principal {

    public static void main(String[] args) {
        Hora hora = new Hora(10, 30, 45);

        System.out.println("Hora inicial:");
        hora.visualizar(); // Visualizamos la hora

        hora.avanzar(65); // Avanzamos la hora 65 segundos
        System.out.println("Después de avanzar:");
        hora.visualizar();

        hora.ponerACero(); // Ponemos a 0 la hora
        System.out.println("Después de poner a cero:");
        hora.visualizar();
    }
}
