import java.util.Scanner;

public class matriz1 {

    public static void main(String[] args) {

        // Definir matriz1
        int[][] matriz1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int filas1 = 3;
        int columnas1 = 3;

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

        // Mostrar la matriz por consola
        System.out.println("Matriz1 :");
        for (int i = 0; i < filas1; i++) {
            for (int j = 0; j < columnas1; j++) {
                System.out.print("[ " + matriz1[i][j] + " ] ");
            }
            System.out.println(); // Nueva línea después de cada fila
        }

        // Traspuesta
        int[][] traspuesta = new int[filas1][columnas1];

        for (int i = 0; i < filas1; i++) {
            for (int j = 0; j < columnas1; j++) {
                traspuesta[j][i] = matriz1[i][j];
            }
        }

        // Mostrar la matriz por consola
        System.out.println("Traspuesta :");
        for (int i = 0; i < filas1; i++) {
            for (int j = 0; j < columnas1; j++) {
                System.out.print("[ " + traspuesta[i][j] + " ] ");
            }
            System.out.println(); // Nueva línea después de cada fila
        }


    }
}