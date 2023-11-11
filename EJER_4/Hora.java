package EJER_4;

class Hora {

    private int horas, minutos, segundos;

    // Constructor por defecto
    public Hora() {
    }

    // Constructor que inicializa la hora con valores dados por el usuario
    public Hora(int horas, int minutos, int segundos) {
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;
    }

    // Método para avanzar la hora actual
    public void avanzar(int segundosAvance) {
        // Sumar la cantidad de segundos de avance
        segundos += segundosAvance;

        // Ajustamos las horas y minutos
        minutos += segundos / 60;
        segundos %= 60;
        horas += minutos / 60;
        minutos %= 60;
        horas %= 24;
    }

    // Método para poner a cero la hora actual
    public void ponerACero() {
        horas = minutos = segundos = 0;
    }

    // Método para visualizar la hora en formato HH:MM:SS
    public void visualizar() {
        System.out.printf("%02d:%02d:%02d%n", horas, minutos, segundos);
    }
}
