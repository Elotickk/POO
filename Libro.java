import java.security.PublicKey;

public class Libro {
    private String titulo;
    private String autor;
    private double numEjem;
    private double numEjemPrest;

    public Libro (){
        //contructor por defecto 
    }

    public Libro (String titulo , String autor,double numEjem, double numEjemPrest ) {
        this.titulo = titulo;
        this.autor = autor;
        this.numEjem = numEjem;
        this.numEjemPrest = numEjemPrest;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    public void setNumEjemplares(Double numEjem) {
        this.numEjem = numEjem;
    }
    
    public void setNumEjemplaresPrestados(double numEjemPrest) {
        this.numEjemPrest = numEjemPrest;
    }
    
    // Métodos Getters
    public String getTitulo() {
        return titulo;
    }
    
    public String getAutor() {
        return autor;
    }
    
    public double getNumEjemplares() {
        return numEjem;
    }
    
    public double getNumEjemplaresPrestados() {
        return numEjemPrest;
    }

    public boolean prestar() {
        if (numEjem > numEjemPrest) {
            numEjemPrest++;
            return true; // Se ha podido realizar el préstamo
        } else {
            return false; // No hay ejemplares disponibles para prestar
        }
    }

    public boolean devolver(){
        
        if (numEjemPrest > 0){
            numEjemPrest = numEjemPrest - 1;
            return true;//Se ha devuelto el libro 
        } else{
            return false; // No hay pedido de libros prestados
        }

    }

    public double disponible() {
        return numEjem - numEjemPrest;
    }
    
    @Override
    public String toString() {
        return 
        "Título: " + titulo + "\n" +
        "Autor: " + autor + "\n" +
        "Número de ejemplares: " + numEjem + "\n" +
        "Número de ejemplares prestados: " + numEjemPrest;
    }
    

    public static void main(String[] args) {

        Libro libro1 = new Libro("La Biblia", "Varios", 10,0);
        Libro libro2 = new Libro("El Quijote", "Miguel de Cervantes", 10, 0);

        //Prestar el libro
        if (libro1.prestar()) {
            System.out.println("Se ha prestado el libro correctamente.");
        } else {
            System.out.println("No hay ejemplares disponibles para prestar.");
        }

        // Devolver el libro
        // if (libro1.devolver()) {
        //         System.out.println("Se ha devuelto el libro correctamente");
        // } else {
        //     System.out.println("No hay pedido de deolver el libro"); 
        // }

        libro1.disponible();
        // 
        System.out.println("Libro 1:");
        System.out.println(libro1);
        System.out.println("Disponibles para préstamo: " + libro1.disponible());
        System.out.println();
        
        System.out.println("Libro 2:");
        System.out.println(libro2);
        System.out.println("Disponibles para préstamo: " + libro2.disponible());
        
        
        // Imprimir las propiedades del libro
        // System.out.println("Datos del objeto inicial ");
        // System.out.println("Título: " + libro1.getTitulo());
        // System.out.println("Autor: " + libro1.getAutor());
        // System.out.println("Número de ejemplares: " + libro1.getNumEjemplares());
        System.out.println("Número de ejemplares prestados: " + libro1.getNumEjemplaresPrestados());
    }
}
