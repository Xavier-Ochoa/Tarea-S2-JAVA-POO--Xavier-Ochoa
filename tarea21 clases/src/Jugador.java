import java.util.Scanner;
public class Jugador {

    String nombre;
    String posicion;
    int edad;
    int numeroCamiseta;

    public Jugador(String nombre, String posicion, int edad, int numeroCamiseta) {
        this.nombre = nombre;
        this.posicion = posicion;
        this.edad = edad;
        this.numeroCamiseta = numeroCamiseta;
    }
    public void mostrarInformacion() {
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Posición: " + this.posicion);
        System.out.println("Edad: " + this.edad);
        System.out.println("Número de camiseta: " + this.numeroCamiseta);
        System.out.println("----------------------------");
    }
    public static Jugador registrarJugador() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el nombre del jugador:");
        String nombre = sc.nextLine();
        System.out.println("Introduce la posición del jugador:");
        String posicion = sc.nextLine();
        System.out.println("Introduce la edad del jugador:");
        int edad = sc.nextInt();
        System.out.println("Introduce el número de camiseta del jugador:");
        int numeroCamiseta = sc.nextInt();
        return new Jugador(nombre, posicion, edad, numeroCamiseta);
    }
}
