import java.util.Scanner;

public class Empleado {
    String nombre;
    String cargo;
    double salario;
    String fechaIngreso;

    public Empleado(String nombre, String cargo, double salario, String fechaIngreso) {
        this.nombre = nombre;
        this.cargo = cargo;
        this.salario = salario;
        this.fechaIngreso = fechaIngreso;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Cargo: " + this.cargo);
        System.out.println("Salario: $" + this.salario);
        System.out.println("Fecha de Ingreso: " + this.fechaIngreso);
        System.out.println("----------------------------");
    }

    public static Empleado registrarEmpleado() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el nombre del empleado:");
        String nombre = sc.nextLine();

        System.out.println("Introduce el cargo del empleado:");
        String cargo = sc.nextLine();

        System.out.println("Introduce el salario del empleado:");
        double salario = sc.nextDouble();
        sc.nextLine();

        System.out.println("Introduce la fecha de ingreso del empleado (dd/mm/aaaa):");
        String fechaIngreso = sc.nextLine();
        return new Empleado(nombre, cargo, salario, fechaIngreso);
    }
}
