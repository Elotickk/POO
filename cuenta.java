import javax.swing.DebugGraphics;

public class cuenta {
    private String cliente;
    private String nroCuenta;
    private double tipo;
    private double saldo;
    int transacciones;

    public cuenta (){
        //contructor por defecto 
    }

    public cuenta (String cliente , String nroCuenta,double tipo, double saldo, int transacciones) {
        this.cliente = cliente;
        this.nroCuenta = nroCuenta;
        this.tipo = tipo;
        this.saldo = saldo;
        this.transacciones = transacciones;
    }
    //CLIENTE
    public String getCliente(){
        return cliente;
    }

    public void setCliente (String Cliente){
        this.cliente = Cliente;
    }
    //NROCUENTA
    public String getnroCuenta(){
        return nroCuenta;
    }

    public void setnroCuenta(String nroCuenta){
        this.nroCuenta = nroCuenta;
    }
    // TIPO
    public double getTipo(){
        return tipo;
    }

    public void setTipo(double tipo){
        this.tipo = tipo;
    }
    // SALDO
    public double getSaldo(){
        return saldo;
    }

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    // TRANSACCIONES
    public int getTransacciones(){
        return transacciones;
    }

    public void setTransacciones(int transacciones){
        this.transacciones = transacciones;
    }

    public boolean acreditar (double cantImporte){
        if(cantImporte > 0){
            saldo = saldo + cantImporte;
            transacciones ++;
            return true;
        }
        return false;
    }

    public boolean debitar (double cantImporte){
        if((cantImporte <= saldo) && (cantImporte > 0)){
            saldo = saldo - cantImporte;
            transacciones++;
            return true;
        }
        return false;
    }



    public void transferencias (){
        
    }

    public String toString(){
        
    }
    
        System.out.println("Cliente:" + cliente + "/" + "NroCuenta:" + nroCuenta+"/" + "Tipo:" + tipo + "/" + "Saldo:" + saldo + "/"+"transacciones:" + transacciones + "/");
        
}
