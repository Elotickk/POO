package tp3libro;
public class Libro {
    private String titulo;
    private String autor;
    private int numEjemplares;
    private int numEjemplaresPrestados;

    // Constructor por defecto
    public Libro() {
    }

    // Constructor con parámetros
    public Libro(String titulo, String autor, int numEjemplares, int numEjemplaresPrestados) {
        this.titulo = titulo;
        this.autor = autor;
        this.numEjemplares = numEjemplares;
        this.numEjemplaresPrestados = numEjemplaresPrestados;
    }

    // Setters y getters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumEjemplares() {
        return numEjemplares;
    }

    public void setNumEjemplares(int numEjemplares) {
        this.numEjemplares = numEjemplares;
    }

    public int getNumEjemplaresPrestados() {
        return numEjemplaresPrestados;
    }

    public void setNumEjemplaresPrestados(int numEjemplaresPrestados) {
        this.numEjemplaresPrestados = numEjemplaresPrestados;
    }

    // Método para prestar un ejemplar del libro
    public boolean prestar() {
        if (numEjemplares > 0) {
            numEjemplares--;
            numEjemplaresPrestados++;
            return true;
        } else {
            return false;
        }
    }

    // Método para devolver un ejemplar del libro
    public boolean devolver() {
        if (numEjemplaresPrestados > 0) {
            numEjemplaresPrestados--;
            numEjemplares++;
            return true;
        } else {
            return false;
        }
    }

    // Método para mostrar la cantidad de libros disponibles para préstamo
    public int disponibles() {
        return numEjemplares;
    }

    // Método toString
    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", numEjemplares=" + numEjemplares +
                ", numEjemplaresPrestados=" + numEjemplaresPrestados +
                '}';
    }

    // Método main para probar el funcionamiento de la clase Libro
}
