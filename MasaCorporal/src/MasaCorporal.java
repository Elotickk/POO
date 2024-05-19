

public class MasaCorporal {
    private double peso;
    private double altura;

    public MasaCorporal(double peso, double altura) {
        this.peso = peso;
        this.altura = altura;
    }

    public double calcularIMC() {
        return peso / (altura * altura);
    }

    public String clasificarIMC(double imc) {
        String[] clasificaciones = {"Bajo peso", "Peso normal", "Sobrepeso", "Obesidad Grado I", "Obesidad Grado II", "Obesidad Grado III"};
        if (imc < 18) {
            return clasificaciones[0];
        } else if (imc < 25) {
            return clasificaciones[1];
        } else if (imc < 27) {
            return clasificaciones[2];
        } else if (imc < 30) {
            return clasificaciones[3];
        } else if (imc < 39.9) {
            return clasificaciones[4];
        } else {
            return clasificaciones[5];
        }
    }
}
