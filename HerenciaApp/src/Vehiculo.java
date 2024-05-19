public class Vehiculo {
    private String matricula;
    private String marca;private String modelo;
    private String color;
    private double tarifa = 0.0;
    private boolean disponible;
    // se omiten los métodos ‘get’ y ‘set’ de la superclase Vehiculo,
    // excepto el método getAtributos()
    public Vehiculo(String matricula,
    String marca,
    String modelo,
    String color,
    double tarifa) {
    this.matricula = matricula;
    this.marca = marca;
    this.modelo = modelo;
    this.color = color;
    this.tarifa = tarifa;
    this.disponible = false;
    }
    public String getAtributos() {
    return "Matrícula: " + this.matricula +
    " Modelo: " + this.marca + " " + this.modelo +
    " Color: " + this.color +
    " Tarifa: " + this.tarifa +
    " Disponible: " + this.disponible;
    }
}

