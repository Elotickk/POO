public class App {
    public static void main(String[] args) throws Exception {
        Deportivo deportivo1 = new Deportivo("GHI110", "Lamborghini", "Huracan", "Negro",100000, 700);

        // Crear un objeto Vehiculo
        Furgoneta furgoneta1 = new Furgoneta("DEF110", "Renault", "Kangoo", "Blanco", 2000, 2, 1000);

        // Crear un objeto VehiculoAlquilado
        Turismo turismo1 = new Turismo("ABC110","Renault", "Twingo", "Verde", 1000, 4, false);

        System.out.println(turismo1.getAtributos());
        System.out.println(furgoneta1.getAtributos());
        System.out.println(deportivo1.getAtributos());
    }
}
