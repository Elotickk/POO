public class Ventilador {
    private int velocidadMaxima;
    private int velocidadActual;
    private boolean enchufado;
    private boolean encendido;
    private boolean oscila;

    // Constructor predeterminado
    public Ventilador() {
        this.velocidadMaxima = 3; // Por defecto, velocidad máxima de 3
        this.velocidadActual = 0;
        this.enchufado = false;
        this.encendido = false;
        this.oscila = false;
    }

    // Constructor con la velocidad máxima del ventilador
    public Ventilador(int velocidadMaxima) {
        this();
        this.velocidadMaxima = velocidadMaxima;
    }

    // Getters y Setters
    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public int getVelocidadActual() {
        return velocidadActual;
    }

    public boolean isEnchufado() {
        return enchufado;
    }

    public boolean isEncendido() {
        return encendido;
    }

    public boolean isOscila() {
        return oscila;
    }

    // Métodos
    public void subirVelocidad() {
        if (enchufado && encendido && velocidadActual < velocidadMaxima) {
            velocidadActual++;
        }
    }

    public void bajarVelocidad() {
        if (encendido && velocidadActual > 0) {
            velocidadActual--;
        }
    }

    public void enchufar() {
        enchufado = true;
    }

    public void desenchufar() {
        enchufado = false;
        apagar(); // Si se desenchufa, se apaga automáticamente
    }

    public void encender() {
        if (enchufado) {
            encendido = true;
            velocidadActual = 0; // Inicia la velocidad a cero
        }
    }

    public void apagar() {
        encendido = false;
        velocidadActual = 0; // Velocidad a cero al apagar
    }

    public void activarOscilador() {
        if (encendido) {
            oscila = true;
        }
    }

    public void desactivarOscilador() {
        oscila = false;
    }

    @Override
    public String toString() {
        return "Ventilador{" +
                "velocidadMaxima=" + velocidadMaxima +
                ", velocidadActual=" + velocidadActual +
                ", enchufado=" + enchufado +
                ", encendido=" + encendido +
                ", oscila=" + oscila +
                '}';
    }
}