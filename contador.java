public class contador{
    private int cont;

    public contador(){


    }
    public contador (int cont){
        if(cont > 0)
            this.cont = 0;
        else 
            this.cont = cont;
        
        
    }


    public int getCont(){
        return cont;
    }

    public void setCont(int cont){
        this.cont = cont;
    }

    public void incrementar (){
        cont++;
    }

    public void incrementar2 (){
        cont = cont + 2;
        // incrementar ();
        // incrementar ();
    }

    public void decrementar(){
        cont--;
    }

    public void decrementar2(){
        cont = cont - 2;
        if (cont < 0)
            cont = 0;
    }

    public void duplicar(){
        cont = cont * cont;
    }

    public void triplicar(){
        cont = cont * cont * cont;
    }



    contador conta1 = new contador();
    contador conta2 = new contador();




}