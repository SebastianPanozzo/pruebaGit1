import java.util.Scanner;

public class ejercicio3 {

    public static void main(String[] args) {

        // Definir matriz1
        int[][] matriz1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int filas1 = 3;
        int columnas1 = 3;

        // Definir matriz1
        int[][] matriz2 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int filas2 = 3;
        int columnas2 = 3;

        /*

        // Estructuras Repetitivas
        Scanner s = new Scanner(System.in);

        // carga dimension de matriz
        System.out.println("Cargue número de filas de matriz: ");
        int filas1 = s.nextInt();
        System.out.println("Cargue número de columnas de matriz: ");
        int columnas1 = s.nextInt();

        // Matriz pruebas
        int[][] matriz1 = new int[filas1][columnas1];

        // carga valores en la matriz
        for(int y = 0; y < filas1; y++){
            // filas
            for(int x = 0; x < columnas1; x++){
                // columnas
                System.out.println("Ingrese el valor para la posicion [" + y + "][" + x + "]");
                matriz1[y][x] = s.nextInt();
            }
        }

        */

        int[][] matriz_producto = new int[filas1][columnas2];

        for (int i = 0; i < filas1; i++) {
            for (int j = 0; j < columnas2; j++) {
                for (int k = 0; k < columnas1; k++) {
                    matriz_producto[i][j] += matriz1[i][k] * matriz2[k][j];
                }
            }
        }

        if (columnas1 == filas1) {

            // Mostrar la matriz por consola
            System.out.println("Matriz producto:");
            for (int i = 0; i < filas1; i++) {
                for (int j = 0; j < columnas2; j++) {
                    System.out.print("[ " + matriz_producto[i][j] + " ] ");
                }
                System.out.println(); // Nueva línea después de cada fila
            }

        } else {
            System.out.println("Operación no válida.");
        }


    }
}