package tp3libro;

public class main {
    public static void main(String[] args) {
        // Crear un libro de prueba
        Libro libro = new Libro("El señor de los anillos", "J.R.R. Tolkien", 0, 2);

        // Mostrar información del libro
        System.out.println("Información del libro:");
        System.out.println(libro);

        // Prestar un ejemplar del libro
        boolean prestamoExitoso = libro.prestar();
        if (prestamoExitoso) {
            System.out.println("Se prestó un ejemplar del libro.");
        } else {
            System.out.println("No quedan ejemplares disponibles para prestar.");
        }

        // Devolver un ejemplar del libro
        boolean devolucionExitosa = libro.devolver();
        if (devolucionExitosa) {
            System.out.println("Se devolvió un ejemplar del libro.");
        } else {
            System.out.println("No se pudo realizar la devolución. No hay ejemplares prestados.");
        }

        // Mostrar la cantidad de libros disponibles para préstamo
        System.out.println("Cantidad de ejemplares disponibles para préstamo: " + libro.disponibles());
    }
}
