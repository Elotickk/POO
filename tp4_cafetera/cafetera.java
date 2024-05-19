package tp4_cafetera;

public class cafetera {
    public int CapacidadMaxima;
    public int CantidadActual;
    public int Saborizado;
    public int Tipo;
    public String Marca;

    //1
    public cafetera (){
        //contructor por defecto
        this.CapacidadMaxima = 1000;
        this.CantidadActual = 0;
    }
    //2
    public cafetera(int CapacidadMaxima){

        CantidadActual = CapacidadMaxima;
    }
    //3
    public cafetera(int CapacidadMaxima , int CantidadActual){
        if(CantidadActual > CapacidadMaxima){
            this.CapacidadMaxima = CapacidadMaxima;
            this.CantidadActual = CapacidadMaxima;
        }
    }
    //4
    public void llenarCafetera(int CantidadActual, int CapacidadMaxima, int Saborizado){
        this.CantidadActual = this.CapacidadMaxima;
        this.Saborizado = 0;
    }
    //5
    public boolean servirTaza (int capacidadTaza , int CantidadActual){
        

        if(CantidadActual < capacidadTaza){
            capacidadTaza = capacidadTaza - CantidadActual;
        }
        if (capacidadTaza == 0){
            return false;
        }
        else{
            return true;
        }
    }
    //6
    public void vaciarCafetera(){
        this.CantidadActual = 0;
        this.Saborizado = 0;
        
    }
    //7
    public void agregarCafe(int CantCafeAgregar){
        this.CantidadActual = CantidadActual + CantCafeAgregar;
    }
    //8
    public void sabrorizar(int sabor){
        if(sabor != 0){
            this.Saborizado = sabor;
        }
    }
    //9


}
