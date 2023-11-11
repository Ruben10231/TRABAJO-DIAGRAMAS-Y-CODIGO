package EJER_1;

import java.util.Scanner;

class Hora {

    private int horas, minutos, segundos;

    // Constructor que inicializa los datos a 0
    public Hora() {
        this.horas = 0;
        this.minutos = 0;
        this.segundos = 0;
    }

    // Constructor que inicializa los datos a valores dados por el usuario
    public Hora(int horas, int minutos, int segundos) {
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;
    }

    // Método para visualizar la hora en formato HH:MM:SS
    public void mostrarHora() {
        System.out.printf("%02d:%02d:%02d%n", horas, minutos, segundos);
    }

    // Método para sumar dos objetos de tipo Hora
    public void sumarHoras(Hora otraHora) {
        this.segundos += otraHora.segundos;
        this.minutos += otraHora.minutos;
        this.horas += otraHora.horas;

        // Ajustamos los valores para mantener el formato correcto
        this.minutos += this.segundos / 60;
        this.segundos %= 60;

        this.horas += this.minutos / 60;
        this.minutos %= 60;
    }
}
