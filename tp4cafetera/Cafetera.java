package tp4cafetera;

public class Cafetera {
    private int capacidadMaxima;
    private int cantidadActual;
    private int saborizado;
    private int tipo;
    private String marca;

    // Constructor predeterminado
    public Cafetera() {
        this.capacidadMaxima = 1000;
        this.cantidadActual = 0;
        this.saborizado = 0;
        this.tipo = 1; // Grano tostado por defecto
        this.marca = "Vacía";
    }

    // Constructor con la capacidad máxima de la cafetera
    public Cafetera(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = capacidadMaxima;
        this.saborizado = 0;
        this.tipo = 1; // Grano tostado por defecto
        this.marca = "Vacía";
    }

    // Constructor con la capacidad máxima y la cantidad actual
    public Cafetera(int capacidadMaxima, int cantidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        if (cantidadActual > capacidadMaxima) {
            this.cantidadActual = capacidadMaxima;
        } else {
            this.cantidadActual = cantidadActual;
        }
        this.saborizado = 0;
        this.tipo = 1; // Grano tostado por defecto
        this.marca = "Vacía";
    }

    // Método para llenar la cafetera
    public void llenarCafetera() {
        this.cantidadActual = this.capacidadMaxima;
        this.saborizado = 0; // Sabor amargo
        this.marca = "El MOCA";
    }

    // Método para servir una taza
    public boolean servirTaza(int capacidadTaza) {
        if (this.cantidadActual >= capacidadTaza) {
            this.cantidadActual -= capacidadTaza;
            return true;
        } else {
            return false;
        }
    }

    // Método para vaciar la cafetera
    public void vaciarCafetera() {
        this.cantidadActual = 0;
        this.saborizado = 0; // Sabor amargo
        this.marca = "Vacía";
    }

    // Método para agregar café a la cafetera
    public void agregarCafe(int cantidad) {
        this.cantidadActual += cantidad;
        if (this.cantidadActual > this.capacidadMaxima) {
            this.cantidadActual = this.capacidadMaxima;
        }
    }

    // Método para saborizar la cafetera
    public void saborizar(int tipoSabor) {
        if (this.saborizado == 0) {
            this.saborizado = tipoSabor;
        }
    }

    // Método toString
    @Override
    public String toString() {
        String sabor;
        switch (this.saborizado) {
            case 0:
                sabor = "Amargo";
                break;
            case 1:
                sabor = "Azúcar";
                break;
            case 2:
                sabor = "Edulcorante";
                break;
            case 3:
                sabor = "Stevia";
                break;
            case 4:
                sabor = "Miel";
                break;
            default:
                sabor = "Desconocido";
                break;
        }
        String tipoCafe = (this.tipo == 1) ? "Grano tostado" : "Café instantáneo";

        return "Cafetera{" +
                "capacidadMaxima=" + capacidadMaxima +
                ", cantidadActual=" + cantidadActual +
                ", saborizado=" + sabor +
                ", tipo=" + tipoCafe +
                ", marca='" + marca + '\'' +
                '}';
    }

    public static void main(String[] args) {
        // Crear una cafetera de prueba
        Cafetera cafetera = new Cafetera();

        // Mostrar información de la cafetera
        System.out.println("Información de la cafetera:");
        System.out.println(cafetera);

        // Llenar la cafetera
        cafetera.llenarCafetera();
        System.out.println("Cafetera llenada:");
        System.out.println(cafetera);

        // Servir una taza
        int capacidadTaza = 200;
        boolean tazaServida = cafetera.servirTaza(capacidadTaza);
        if (tazaServida) {
            System.out.println("Se sirvió una taza de café.");
        } else {
            System.out.println("No hay suficiente café para servir una taza.");
        }

        // Agregar café a la cafetera
        int cantidadCafe = 300;
        cafetera.agregarCafe(cantidadCafe);
        System.out.println("Se agregaron " + cantidadCafe + " cc de café a la cafetera.");
        System.out.println(cafetera);

        // Vaciar la cafetera
        cafetera.vaciarCafetera();
        System.out.println("Cafetera vaciada:");
        System.out.println(cafetera);

        // Saborizar la cafetera
        cafetera.saborizar(1);
        System.out.println("Cafetera saborizada con azúcar:");
        System.out.println(cafetera);
    }
}
