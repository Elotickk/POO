import java.util.Random;

public class Aleatorio {

    private int limite;
    Random rnd = new Random();

    public Aleatorio(int limite) {
        this.limite = limite;
    }

    public int getLimite() {
        return limite;
    }

    public void setLimite(int limite) {
        this.limite = limite;
    }

    public int getPositivo() {
        int numeroAleatorio = (int) (Math.random() * limite + 1);
        return numeroAleatorio;
    }
    
    public int getNegativos() {
        return  (int) (Math.random() * limite + 1) * -1;        
    }
    
    public int getPositivoNegativos() {
         int numeroAleatorio =   (int) (Math.random() * limite + 1) ;        
         int val = (int) (Math.random() * 2+ 1) ;
        if (val == 1)
            return numeroAleatorio * -1;
        else
            return numeroAleatorio;
    }    
}