import javax.swing.JOptionPane;

public class App{
    public static void main(String[] args) {
        double peso = 79.20;
        double altura = 1.78;

        MasaCorporal persona = new MasaCorporal(peso, altura);
        double imc = persona.calcularIMC();
        String clasificacion = persona.clasificarIMC(imc);

        JOptionPane.showMessageDialog(null, "El índice de masa corporal es: " + imc + "\nClasificación: " + clasificacion);
    }
}