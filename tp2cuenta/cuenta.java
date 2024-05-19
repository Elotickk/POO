package tp2cuenta;
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

    // Método para realizar una transferencia a otra cuenta
    public boolean transferencia(cuenta cuentaDestino, double importe) {
        if (this.debitar(importe)) {
            cuentaDestino.acreditar(importe);
            return true;
        } else {
            return false;
        }
    }

    // Método toString
    @Override
    public String toString() {
        return "Cuenta{" +
                "nombreCliente='" + cliente + '\'' +
                ", numeroCuenta='" + nroCuenta + '\'' +
                ", tipoInteres=" + tipo +
                ", saldo=" + saldo +
                ", transacciones=" + transacciones +
                '}';
    }

    // Prueba del funcionamiento de la clase Cuenta
    public static void main(String[] args) {
        // Crear cuentas de prueba
        cuenta cuenta1 = new cuenta("Cliente1", "1234567890", 0.05, 1000, 0);
        cuenta cuenta2 = new cuenta("Cliente2", "0987654321", 0.05, 500, 0);

        // Realizar operaciones
        cuenta1.acreditar(200);
        cuenta2.debitar(100);

        // Mostrar información de las cuentas
        System.out.println("Información de cuenta1:");
        System.out.println(cuenta1);
        System.out.println("Información de cuenta2:");
        System.out.println(cuenta2);

        // Realizar transferencia entre cuentas
        double importeTransferencia = 300;
        boolean transferenciaExitosa = cuenta1.transferencia(cuenta2, importeTransferencia);
        if (transferenciaExitosa) {
            System.out.println("Transferencia de " + importeTransferencia + " realizada con éxito.");
        } else {
            System.out.println("No se pudo realizar la transferencia. Fondos insuficientes.");
        }

        // Mostrar información de las cuentas después de la transferencia
        System.out.println("Información de cuenta1 después de la transferencia:");
        System.out.println(cuenta1);
        System.out.println("Información de cuenta2 después de la transferencia:");
        System.out.println(cuenta2);
    }
}
