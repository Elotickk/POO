package class;

import cliente;
import vehiculo;
import vehiculoAlquilado;


public class mainVehiculo {
    public static void main(String[] args) {
        // Crear un objeto Cliente
        cliente cli1 = new cliente("12345678A", "Juan", "Pérez");

        // Crear un objeto Vehiculo
        vehiculo veh1 = new vehiculo("Toyota", "Corolla", "123ABC", "Azul", 50.0, true);

        // Crear un objeto VehiculoAlquilado
        vehiculoAlquilado alq1 = new vehiculoAlquilado(veh1, cli1, 25, 4, 2024, 10);

        // Mostrar información del vehículo alquilado
        System.out.println("Información del vehículo alquilado:");
        System.out.println("Vehículo: " + alq1.getVehiculo().getMarca() + " " + alq1.getVehiculo().getModelo());
        System.out.println("Cliente: " + alq1.getCliente().getNombre() + " " + alq1.getCliente().getApellido());
        System.out.println("Fecha de alquiler: " + alq1.getDia() + "/" + alq1.getMes() + "/" + alq1.getAnio());
        System.out.println("Cantidad: " + alq1.getCantidad());
    }
}
