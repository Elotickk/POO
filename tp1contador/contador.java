package tp1contador;
public class contador {
    private int cont;

    public contador() {

    }

    public contador(int cont) {
    if (cont >= 0)
        this.cont = cont;
    else
        this.cont = 0;
}
    public int getCont() {
        return cont;
    }

    public void setCont(int cont) {
        this.cont = cont;
    }

    public void incrementar() {
        this.cont++;
    }

    public void incrementar2() {
        this.cont = cont + 2;
        // incrementar ();
        // incrementar ();
    }

    public void decrementar() {
        this.cont--;
    }

    public void decrementar2() {
        this.cont = cont - 2;
        if (cont < 0)
            this.cont = 0;
    }

    public void duplicar() {
        this.cont *= 2;
    }

    public void triplicar() {
        this.cont *= 3;
    }

    public boolean isMayor(int valor) {
        return this.cont > valor;
    }

    public boolean isMenor(int valor) {
        return this.cont < valor;
    }

    // Métodos de par e impar
    public boolean isPar() {
        return this.cont % 2 == 0;
    }

    public boolean isImpar() {
        return this.cont % 2 != 0;
    }

    public boolean esBisiesto(int anio) {
        // Un año es bisiesto si es divisible entre 4
        // Pero no es bisiesto si es divisible entre 100, a menos que también sea
        // divisible entre 400
        return (anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0);
    }

    public static void main(String[] args) {

        contador contador = new contador(20);
        System.out.println("Valor inicial del contador: " + contador.getCont());

        contador.incrementar();
        System.out.println("Después de incrementar: " + contador.getCont());

        contador.incrementar2();
        System.out.println("Después de incrementar 2 veces: " + contador.getCont());

        contador.decrementar();
        System.out.println("Después de decrementar: " + contador.getCont());

        contador.decrementar2();
        System.out.println("Después de decrementar 2 veces: " + contador.getCont());

        contador.duplicar();
        System.out.println("Después de duplicar: " + contador.getCont());

        contador.triplicar();
        System.out.println("Después de triplicar: " + contador.getCont());

        System.out.println("¿El contador es mayor que 10? " + contador.isMayor(10));
        System.out.println("¿El contador es menor que 10? " + contador.isMenor(10));
        System.out.println("¿El contador es par? " + contador.isPar());
        System.out.println("¿El contador es impar? " + contador.isImpar());

        // Prueba del método es Bisiesto
        int anio = 2024;
        System.out.println(anio + " ¿es bisiesto? " + contador.esBisiesto(anio));
    }
}
