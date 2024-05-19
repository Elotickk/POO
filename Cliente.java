public class Cliente {
    // Campos del registro
    private String nombre;
    private String telefono;
    private double[] saldos;

    // Constructor
    public Cliente(String nombre, String telefono, double[] saldos) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.saldos = saldos;
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public double[] getSaldos() {
        return saldos;
    }

    public void setSaldos(double[] saldos) {
        this.saldos = saldos;
    }

    public static void main(String[] args) {
        // Datos de ejemplo para un cliente
        String nombre = "Juan";
        String telefono = "123456789";
        double[] saldos = {1000.0, 1500.0, 1200.0, 1300.0, 1100.0, 900.0, 800.0, 1000.0, 1500.0, 1200.0, 1300.0, 1100.0};

        // Crear un cliente
        Cliente cliente = new Cliente(nombre, telefono, saldos);

        // Mostrar la información del cliente
        System.out.println("Nombre: " + cliente.getNombre());
        System.out.println("Teléfono: " + cliente.getTelefono());
        System.out.println("Saldos mensuales del último año:");
        for (int i = 0; i < cliente.getSaldos().length; i++) {
            System.out.println("Mes " + (i + 1) + ": " + cliente.getSaldos()[i]);
        }
    }
}