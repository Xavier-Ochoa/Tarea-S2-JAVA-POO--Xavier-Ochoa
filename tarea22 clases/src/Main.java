public class Main {
    public static void main(String[] args) {
        // Registrar tres empleados usando Scanner
        System.out.println("Registrar empleado 1:");
        Empleado empleado1 = Empleado.registrarEmpleado();

        System.out.println("Registrar empleado 2:");
        Empleado empleado2 = Empleado.registrarEmpleado();

        System.out.println("Registrar empleado 3:");
        Empleado empleado3 = Empleado.registrarEmpleado();

        // Mostrar la información de los empleados
        System.out.println("\nInformación de los empleados:");
        empleado1.mostrarInformacion();
        empleado2.mostrarInformacion();
        empleado3.mostrarInformacion();
    }
}
