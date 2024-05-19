public class UpperTriangularMatrix {
    private int[][] matrix;
    private int size;

    // Constructor
    public UpperTriangularMatrix(int size) {
        this.size = size;
        this.matrix = new int[size][size];
    }

    // Método para establecer el valor en la posición (i, j)
    public void set(int i, int j, int value) {
        if (i <= j) { // Solo establece valores en o encima de la diagonal principal
            matrix[i][j] = value;
        } else {
            System.out.println("No se puede establecer el valor en esta posición. Es una matriz triangular superior.");
        }
    }

    // Método para obtener el valor en la posición (i, j)
    public int get(int i, int j) {
        if (i <= j) { // Solo devuelve valores en o encima de la diagonal principal
            return matrix[i][j];
        } else {
            return 0; // Valores por debajo de la diagonal principal son 0
        }
    }

    // Método para imprimir la matriz
    public void printMatrix() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Método de prueba
    public static void main(String[] args) {
        UpperTriangularMatrix upperTriangularMatrix = new UpperTriangularMatrix(4);
        upperTriangularMatrix.set(0, 0, 1);
        upperTriangularMatrix.set(0, 1, 2);
        upperTriangularMatrix.set(0, 2, 3);
        upperTriangularMatrix.set(0, 3, 4);
        upperTriangularMatrix.set(1, 1, 5);
        upperTriangularMatrix.set(1, 2, 6);
        upperTriangularMatrix.set(1, 3, 7);
        upperTriangularMatrix.set(2, 2, 8);
        upperTriangularMatrix.set(2, 3, 9);
        upperTriangularMatrix.set(3, 3, 10);
        System.out.println("Matriz triangular superior:");
        upperTriangularMatrix.printMatrix();
    }
}

