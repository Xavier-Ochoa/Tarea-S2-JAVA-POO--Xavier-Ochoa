public class Main {
    public static void main(String[] args) {
        Jugador jugador1 = new Jugador("David", "Delantero", 36, 10);
        Jugador jugador2 = new Jugador("Cristiano", "Delantero", 39, 7);
        Jugador jugador3 = Jugador.registrarJugador();
        jugador1.mostrarInformacion();
        jugador2.mostrarInformacion();
        jugador3.mostrarInformacion();
    }
}
