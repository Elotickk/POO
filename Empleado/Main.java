package Empleado;

public class Main {
    public static void main(String[] args) {
        // Arreglo con registros de empleados
        Empleado[] empleados = new Empleado[3];
        empleados[0] = new Empleado("Juan", 30, 2500);
        empleados[1] = new Empleado("María", 35, 3000);
        empleados[2] = new Empleado("Pedro", 28, 2000);

        //// Mostrar la información de cada empleado
        for (Empleado empleado : empleados) {
            System.out.println(empleado);
        }
    }
}