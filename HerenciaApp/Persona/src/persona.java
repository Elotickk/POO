public class persona {
    private String Apellido;
    private String Nombre;
    private String Domicilio;
    // se omiten los métodos ‘get’ y ‘set’ de la superclase Vehiculo,
    // excepto el método getAtributos()
    public persona(String Apellido,String Nombre,String Domicilio) {
        this.Apellido = Apellido;
        this.Nombre = Nombre;
        this.Domicilio = Domicilio;
    }
    public String getAtributos() {
    return "Apellido: " + this.Apellido +
    " Nombre: " + this.Nombre + " Domicilio: " + this.Domicilio;
    }
}
