public class App {
    public static void main(String[] args) throws Exception {
        Ventilador ventilador = new Ventilador(5);
        System.out.println("Ventilador creado: " + ventilador);

        // Enchufar el ventilador
        ventilador.enchufar();
        System.out.println("Ventilador enchufado: " + ventilador);

        // Encender el ventilador
        ventilador.encender();
        System.out.println("Ventilador encendido: " + ventilador);

        // Subir la velocidad del ventilador
        ventilador.subirVelocidad();
        System.out.println("Velocidad actual: " + ventilador.getVelocidadActual());

        // Bajar la velocidad del ventilador
        ventilador.bajarVelocidad();
        System.out.println("Velocidad actual: " + ventilador.getVelocidadActual());

        // Activar el oscilador
        ventilador.activarOscilador();
        System.out.println("Oscilador activado: " + ventilador);

        // Desactivar el oscilador
        ventilador.desactivarOscilador();
        System.out.println("Oscilador desactivado: " + ventilador);

        // Desenchufar el ventilador
        ventilador.desenchufar();
        System.out.println("Ventilador desenchufado: " + ventilador);
    }
}
