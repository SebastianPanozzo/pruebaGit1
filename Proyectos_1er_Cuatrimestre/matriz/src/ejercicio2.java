import java.util.Scanner;

public class ejercicio2 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        // Crear matriz
        System.out.print("Cargue dimension de matriz: ");
        int dimension = s.nextInt();

        int[][] matriz1 = new int[dimension][dimension];

        // carga valores en la matriz
        for (int y = 0; y < dimension; y++) {
            // filas
            for (int x = 0; x < dimension; x++) {

                if (x == y){
                    matriz1[y][x] = 1;
                } else {
                    matriz1[y][x] = 0;
                }

            }
        }

        // Mostrar la matriz por consola
        System.out.println("Matriz 1:");
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                System.out.print("[ " + matriz1[i][j] + " ] ");
            }
            System.out.println(); // Nueva línea después de cada fila
        }
    }
}