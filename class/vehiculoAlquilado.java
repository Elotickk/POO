package class;

public class vehiculoAlquilado<vehiculo, cliente> {
    private vehiculo vehiculo;
    private cliente cliente;
    private int dia;
    private int mes;
    private int anio;
    private int cantidad;

    public vehiculoAlquilado(vehiculo vehiculo, cliente cliente, int dia, int mes, int anio, int cantidad) {
        this.vehiculo = vehiculo;
        this.cliente = cliente;
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
        this.cantidad = cantidad;
    }

    // Métodos getter
    public vehiculo getVehiculo() {
        return vehiculo;
    }

    public cliente getCliente() {
        return cliente;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAnio() {
        return anio;
    }

    public int getCantidad() {
        return cantidad;
    }
}
