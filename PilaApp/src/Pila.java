public class Pila {
    class Nodo {
        int info;
        Nodo sig;
    }

    private Nodo Raiz;

    public Pila() {
        Raiz = null;
    }

    public boolean Vacia() {
        if (Raiz == null) {
            return true;
        } else {
            return false;
        }
    }

    public void Insertar(int Infoa) {
        Nodo Nuevo = new Nodo();
        Nuevo.info = Infoa;
        if (Vacia()) {
            Raiz = Nuevo;
            Nuevo.sig = null;
        } else {
            Nuevo.sig = Raiz;
            Raiz = Nuevo;
        }
    }


    public void Imprimir() {
        Nodo Reco = Raiz; // le asigno la direccion de raiz
        while (Reco != null) {
            System.out.println(Reco.info + "\n");
            Reco = Reco.sig;
        }
    }
    
    public int Extraer() {
        if (Vacia()) {
            return -32000;
        } else {
            Nodo Bor; // es un Nodo Auxiliar Bor==Borrar //
            // no va el new porqï solo es un puntero
            Bor = Raiz;
            Raiz = Raiz.sig;
            int Aux = Bor.info;
            return Aux;
        }
    }

    public int Mayor() {
        Nodo Reco = Raiz;
        if (Vacia()) {
            return Integer.MIN_VALUE;
        } else {
            int Mayor = Reco.info;
            while (Reco != null) {
                if (Reco.info > Mayor) {
                    Mayor = Reco.info;
                }
                Reco = Reco.sig;
            }
            return Mayor;
        }
    }

    public int Menor() {
        Nodo Reco = Raiz;
        if (Vacia()) {
            return -32000;
        } else {
            int Menor = Reco.info;
            while (Reco != null) {
                if (Reco.info < Menor) {
                    Menor = Reco.info;
                }
                Reco = Reco.sig;
            }
            return Menor;
        }
    }

    public int Suma() {
        Nodo Reco = Raiz;
        int Suma = 0;
        if (Vacia()) {
            return Suma;
        } else {
            while (Reco != null) {
                Suma += Reco.info;
                Reco = Reco.sig;
            }
            return Suma;
        }
    }

    public void Ordenar() {
        if (CantiNodos() > 1) {
            Nodo Men, May;
            Men = Raiz;
            May = Raiz.sig;
            int Canti = CantiNodos();
            for (int f = 0; f < Canti - 2; f++) {
                for (int x = 1; x < Canti - f; x++) {
                    if (Men.info > May.info) {
                        int Aux = Men.info;
                        Men.info = May.info;
                        May.info = Aux;
                    }
                    Men = May;
                    May = May.sig;
                }
                Men = Raiz;
                May = Raiz.sig;
            }
        }
    }

    public int PosMayor() {
        Nodo Reco = Raiz;
        if (Reco == null) {
            return Integer.MIN_VALUE;
        } else {
            int Contador = 1;
            int PosdelMayor = 1;
            int Mayor = Reco.info;
            while (Reco != null) {
                if (Reco.info > Mayor) {
                    Mayor = Reco.info;
                    PosdelMayor = Contador;
                }
                Reco = Reco.sig;
                Contador++;
            }
            return PosdelMayor;
        }
    }

    public int PosMenor() {
        Nodo Reco = Raiz;
        if (Reco == null) {
            return Integer.MIN_VALUE;
        } else {
            int Contador = 1;
            int PosdelMenor = 1;
            int Menor = Reco.info;
            while (Reco != null) {
                if (Reco.info < Menor) {
                    Menor = Reco.info;
                    PosdelMenor = Contador;
                }
                Reco = Reco.sig;
                Contador++;
            }
            return PosdelMenor;
        }
    }

    public boolean isExiste(int Valor) {
        Nodo Reco = Raiz;
        while (Reco != null) {
            if (Valor == Reco.info) {
                return true;
            } else {
                Reco = Reco.sig;
            }
        }
        return false;
    }

    public void Ordenar2() {
        if (CantiNodos() > 1) {
            Nodo Men, May;
            May = Raiz;
            Men = Raiz.sig;
            int Canti = CantiNodos();
            for (int f = 0; f < Canti - 2; f++) {
                for (int x = 1; x < Canti - f; x++) {
                    if (May.info < Men.info) {
                        int Aux = May.info;
                        May.info = Men.info;
                        Men.info = Aux;
                    }
                    May = Men;
                    Men = May.sig;
                }
                May = Raiz;
                Men = Raiz.sig;
            }
        }
    }

    public int CantiNodos() {
        Nodo Reco = Raiz;
        int Canti = 0;
        if (Vacia()) {
            return Canti;
        } else {
            while (Reco != null) {
                Canti = Canti + 1;
                Reco = Reco.sig;
            }
            return Canti;
        }
    }

    public int Repite(int Infoa) {
        int Cant = 0;
        Nodo Reco = Raiz;
        while (Reco != null) {
            if (Infoa == Reco.info) {
                Cant++;
            }
            Reco = Reco.sig;
        }
        return Cant;
    }

    public int CantidadPares(){
        int Cantidad = 0;
        Nodo Reco = Raiz;
        
        while(Reco != null){
            if (Reco.info % 2 == 0){
                Cantidad ++;
            }
            Reco = Reco.sig;
        }
        return Cantidad;
    }
    
    public double Promedio() {
        int suma = Suma();
        int cantidadNodos = CantiNodos();
        
        if (cantidadNodos == 0) {
            return 0; // Para evitar dividir por cero si la pila está vacía
        }
        
        return (double) suma / cantidadNodos;
    }

    public void ImprimirPares() {
        Nodo Reco = Raiz;
        while (Reco != null) {
            if (Reco.info % 2 == 0) {
                System.out.println(Reco.info);
            }
            Reco = Reco.sig;
        }
    }

    public void ImprimirImpares() {
        Nodo Reco = Raiz;
        while (Reco != null) {
            if (Reco.info % 2 != 0) {
                System.out.println(Reco.info);
            }
            Reco = Reco.sig;
        }
    }

    public void ImprimirParesPositivos() {
        Nodo reco = Raiz;
        while (reco != null) {
            if (reco.info > 0 && reco.info % 2 == 0) {
                System.out.println(reco.info);
            }
            reco = reco.sig;
        }
    }

    public void ImprimirImparesPositivos() {
        Nodo reco = Raiz;
        System.out.println("Valores impares positivos:");
        while (reco != null) {
            if (reco.info > 0 && reco.info % 2 != 0) {
                System.out.println(reco.info);
            }
            reco = reco.sig;
        }
    }

    public void ImprimirParesNegativos() {
        Nodo reco = Raiz;
        System.out.println("Valores pares negativos:");
        while (reco != null) {
            if (reco.info < 0 && reco.info % 2 == 0) {
                System.out.println(reco.info);
            }
            reco = reco.sig;
        }
    }

    public void ImprimirImparesNegativos() {
        Nodo reco = Raiz;
        while (reco != null) {
            if (reco.info < 0 && reco.info % 2 != 0) {
                System.out.println(reco.info);
            }
            reco = reco.sig;
        }
    }

    public int ContarPares() {
        Nodo Reco = Raiz;
        int cantidadPares = 0;
        while (Reco != null) {
            if (Reco.info % 2 == 0) {
                cantidadPares++;
            }
            Reco = Reco.sig;
        }
        return cantidadPares;
    }

    public int ContarImpares() {
        Nodo Reco = Raiz;
        int cantidadImpares = 0;
        while (Reco != null) {
            if (Reco.info % 2 != 0) {
                cantidadImpares++;
            }
            Reco = Reco.sig;
        }
        return cantidadImpares;
    }

    
    
    //Argregar Cantidad de impares , Promedio, Cantidad PAres Negativos , Cant Impares negativos, 

    
}
