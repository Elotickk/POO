public class Deportivo extends Vehiculo {
    private int cilindrada;
    public Deportivo(String matricula,
    String marca,
    String modelo,
    String color,
    double tarifa,
    int cilindrada) {
    super(matricula, marca, modelo, color, tarifa);
    this.cilindrada = cilindrada;
    }
    // métodos ‘get’ de la subclase Deportivo
    public int getCilindrada() {
    return this. cilindrada;
    }
    public String getAtributos() {
    return super.getAtributos() +
    " Cilindrada (cm3): " + this.cilindrada;
    }
}