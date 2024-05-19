public class App {
    public static void main(String[] args) throws Exception {
        ///////////////////////////  1   /////////////////////////////
        // 1) Crear una Pila e insertar 10 Nodos con valores aleatorios comprendidos
        // entre 1 y 50, luego se pide:
        // Pila P1 = new Pila();

        // Aleatorio aleatorio = new Aleatorio(50); // Suponiendo un límite de 50 para
        // los números aleatorios

        // //// Insertar en la pila 10 nodos Aleatoroios ////
        // for (int i = 0; i < 10; i++) {
        // int numAleatorio = aleatorio.getPositivo();
        // P1.Insertar(numAleatorio);
        // System.out.println("Valor aleatorio insertado en la pila: " + numAleatorio);
        // }

        // a. Imprimir la Pila.
        // P1.Imprimir();

        // b. Informar cuantos nodos tiene la Pila.
        // System.out.println("Cantidad:"+ P1.CantiNodos());

        // c. Cuales son el menor y mayor valor que se encuentran en la pila.
        // System.out.println("Menor: "+P1.Menor() + " Mayor: "+ P1.Mayor());

        // d. Cuantas veces se repite el menor y mayor valor dentro de la pila.
        // System.out.println("Se repite el menor: "+ P1.Repite(P1.Menor()) + " | Se
        // repite el mayor: " + P1.Repite(P1.Mayor()));

        // e. En qué posición se encuentra el mayor y menor valor de la pila.
        // System.out.println("El mayor se encuentra en la posicion: " + P1.PosMayor()+
        // " | El menor se encuentra en la posicion: " + P1.PosMenor());

        // f. Indicar si existe el valor 50.
        // if (P1.isExiste(50)){
        // System.out.println("Existe ");
        // }else
        // System.out.println("No Existe ");
        // }

        // g. Cuanto es la Suma de los valores de los nodos de la Pila.
        // System.out.println("La pila " + P1 + " suma: " + P1.Suma());


        /////////////////////////  2   ////////////////////////////////
        // 2) Crear dos Pilas e insertar en ambas, 10 Nodos con valores aleatorios
        // comprendidos entre 1 y 100, luego se pide:
        // Pila P1 = new Pila();
        // Pila P2 = new Pila();

        // Aleatorio aleatorio = new Aleatorio(100);
        
        //// Insertar en la pila 10 nodos Aleatoroios ////
        // for (int i = 0; i < 10; i++) {
        // int numAleatorio = aleatorio.getPositivo();
        // int numAleatorio2 = aleatorio.getPositivo();
        // P1.Insertar(numAleatorio);
        // P2.Insertar(numAleatorio2);
        // System.out.println("Valor aleatorio insertado en la pila 1 : " +
        //// numAleatorio);
        // System.out.println("Valor aleatorio insertado en la pila 2 : " +
        //// numAleatorio2);
        // }

        // a. Imprimir las Pilas.
        // P1.Imprimir();
        // P2.Imprimir();

        // b. Mostrar la Suma de ambas pilas e indicar cual pila tiene la Mayor Suma.

        // int sumaPila1 = P1.Suma();
        // int sumaPila2 = P2.Suma();

        // System.out.println("Suma de la Pila 1: " + sumaPila1);
        // System.out.println("Suma de la Pila 2: " + sumaPila2);

        // if (sumaPila1 > sumaPila2) {
        // System.out.println("La Pila 1 tiene la mayor suma.");
        // } else if (sumaPila1 < sumaPila2) {
        // System.out.println("La Pila 2 tiene la mayor suma.");
        // } else {
        // System.out.println("Ambas pilas tienen la misma suma.");
        // }

        // // c. Mostrar sus Promedios.
        // double promedioPila1 = P1.Promedio();
        // double promedioPila2 = P2.Promedio();

        // System.out.println("Promedio de la Pila 1: " + promedioPila1);
        // System.out.println("Promedio de la Pila 2: " + promedioPila2);

        // // d. Mostrar el Menor valor de ambas pilas y las posiciones donde se
        // encuentran.
        // int menorPila1 = P1.Menor();
        // int posMenorPila1 = P1.PosMenor();
        // int menorPila2 = P2.Menor();
        // int posMenorPila2 = P2.PosMenor();

        // System.out.println("Menor valor de la Pila 1: " + menorPila1 + " en la
        // posición: " + posMenorPila1);
        // System.out.println("Menor valor de la Pila 2: " + menorPila2 + " en la
        // posición: " + posMenorPila2);

        // // e. Mostrar el Mayor valor de ambas pilas y las posiciones donde se
        // encuentran.
        // int mayorPila1 = P1.Mayor();
        // int posMayorPila1 = P1.PosMayor();
        // int mayorPila2 = P2.Mayor();
        // int posMayorPila2 = P2.PosMayor();

        // System.out.println("Mayor valor de la Pila 1: " + mayorPila1 + " en la
        // posición: " + posMayorPila1);
        // System.out.println("Mayor valor de la Pila 2: " + mayorPila2 + " en la
        // posición: " + posMayorPila2);

        // // f. Informar si el menor valor de la Pila1 se encuentra en la Pila2.
        // if (P2.isExiste(menorPila1)) {
        // System.out.println("El menor valor de la Pila 1 se encuentra en la Pila 2.");
        // } else {
        // System.out.println("El menor valor de la Pila 1 no se encuentra en la Pila
        // 2.");
        // }

        // // g. Informar si el Mayor valor de la Pila2 se encuentra en la Pila1.
        // if (P1.isExiste(mayorPila2)) {
        // System.out.println("El mayor valor de la Pila 2 se encuentra en la Pila 1.");
        // } else {
        // System.out.println("El mayor valor de la Pila 2 no se encuentra en la Pila
        // 1.");
        // }

        ///////////////////////////////// 3 ///////////////////////////////////
        // Pila pila = new Pila();
        // Aleatorio aleatorio = new Aleatorio(50); // Límite de valores aleatorios
        // entre 1 y 50

        // for (int i = 0; i < 10; i++) {
        // int valorAleatorio = aleatorio.getPositivo();
        // pila.Insertar(valorAleatorio);
        // }

        // // a. Indicar cuántos nodos tiene
        // System.out.println("La pila tiene " + pila.CantiNodos() + " nodos.");

        // // b. Imprimir la Pila
        // System.out.println("Contenido de la pila:");
        // pila.Imprimir();

        // // c. Informar cuántos nodos contienen valores pares
        // System.out.println("La pila contiene " + pila.CantidadPares() + " nodos con
        // valores pares.");

        // // d. Imprimir los nodos con valores pares
        // System.out.println("Nodos con valores pares:");
        // pila.ImprimirPares();

        // // e. Indicar cuántos nodos contienen valores impares
        // System.out.println("La pila contiene " + (pila.CantiNodos() -
        // pila.CantidadPares()) + " nodos con valores impares.");

        // // f. Imprimir los nodos con valores impares
        // System.out.println("Nodos con valores impares:");
        // pila.ImprimirImpares();
        
        /////////////////////////// 4 //////////////////////////////////
        // Pila pilaA = new Pila();
        // Pila pilaB = new Pila();
        // Pila pilaC = new Pila();
        
        // Insertar 15 nodos con valores aleatorios entre -50 y -1 en pilaA
        // Aleatorio aleatorioA = new Aleatorio(50);
        // for (int i = 0; i < 15; i++) {
        // int valorAleatorioA = aleatorioA.getNegativos();
        // pilaA.Insertar(valorAleatorioA);
        // }

        // Insertar 15 nodos con valores aleatorios entre 1 y 50 en pilaB
        // Aleatorio aleatorioB = new Aleatorio(50);
        // for (int i = 0; i < 15; i++) {
        // int valorAleatorioB = aleatorioB.getPositivo();
        // pilaB.Insertar(valorAleatorioB);
        // }

        // // Insertar 5 nodos de pilaA y 5 nodos de pilaB de forma intercalada en pilaC
        // for (int i = 0; i < 5; i++) {
        // pilaC.Insertar(pilaA.Extraer());
        // pilaC.Insertar(pilaB.Extraer());
        // }

        // // Imprimir las tres pilas
        // System.out.println("Contenido de pilaA:");
        // pilaA.Imprimir();
        // System.out.println("Contenido de pilaB:");
        // pilaB.Imprimir();
        // System.out.println("Contenido de pilaC:");
        // pilaC.Imprimir();

        // // Imprimir los pares positivos de pilaC
        // System.out.println("Pares positivos de pilaC:");
        // pilaC.ImprimirParesPositivos();

        // // Imprimir los impares negativos de pilaC
        // System.out.println("Impares negativos de pilaC:");
        // pilaC.ImprimirImparesNegativos();

        ////////////////////////////  5 ////////////////////////////////////////
        // Pila pilaA = new Pila();
        // Pila pilaB = new Pila();
        // Pila pilaC = new Pila();

        // Insertar 10 nodos con valores aleatorios entre -50 y -1 en pilaA
        // Aleatorio aleatorioAB = new Aleatorio(50);
        // for (int i = 0; i < 10; i++) {
        // int valorAleatorioAB = aleatorioAB.getNegativos();
        // pilaA.Insertar(valorAleatorioAB);
        // }

        // // Insertar 10 nodos con valores aleatorios entre 1 y 50 en pilaB
        // Aleatorio aleatorioBC = new Aleatorio(50);
        // for (int i = 0; i < 10; i++) {
        // int valorAleatorioBC = aleatorioBC.getPositivo();
        // pilaB.Insertar(valorAleatorioBC);
        // }

        // // Insertar un nodo en pilaC que contenga la suma de las pilas A y B
        // int sumaAB = pilaA.Suma() + pilaB.Suma();
        // pilaC.Insertar(sumaAB);

        // // Insertar un nodo en pilaC que contenga la cantidad de valores pares de las
        // pilas A y B
        // int cantidadParesAB = pilaA.ContarPares() + pilaB.ContarPares();
        // pilaC.Insertar(cantidadParesAB);

        // // Insertar un nodo en pilaC que contenga la cantidad de valores impares de
        // las pilas A y B
        // int cantidadImparesAB = pilaA.ContarImpares() + pilaB.ContarImpares();
        // pilaC.Insertar(cantidadImparesAB);

        // // Imprimir las tres pilas
        // System.out.println("Contenido de pilaA:");
        // pilaA.Imprimir();
        // System.out.println("Contenido de pilaB:");
        // pilaB.Imprimir();
        // System.out.println("Contenido de pilaC:");
        // pilaC.Imprimir();
        

        ///////////////////////////////// 6 ///////////////////////////////////

        // Crear una Pila e ingresar 20 nodos con valores aleatorios entre -50 y 50
        Pila pila = new Pila();
        Aleatorio aleatorio = new Aleatorio(100); // Rango de valores entre -50 y 50

        for (int i = 0; i < 20; i++) {
            int valorAleatorio = aleatorio.getPositivoNegativos();
            pila.Insertar(valorAleatorio);
        }

        // a) Imprimir la pila
        System.out.println("a) Valores de la pila:");
        pila.Imprimir();

        // b) Imprimir todos los valores pares
        System.out.println("\nb) Todos los valores pares:");
        pila.ImprimirPares();

        // c) Imprimir solo los valores pares positivos
        System.out.println("\nc) Solo los valores pares positivos:");
        pila.ImprimirParesPositivos();

        // d) Imprimir solo los valores pares negativos
        System.out.println("\nd) Solo los valores pares negativos:");
        pila.ImprimirParesNegativos();

        // e) Imprimir todos los valores impares
        System.out.println("\ne) Todos los valores impares:");
        pila.ImprimirImpares();

        // f) Imprimir solo los valores impares positivos
        System.out.println("\nf) Solo los valores impares positivos:");
        pila.ImprimirImparesPositivos();

        // g) Imprimir solo los valores impares negativos
        System.out.println("\ng) Solo los valores impares negativos:");
        pila.ImprimirImparesNegativos();
    }
}
