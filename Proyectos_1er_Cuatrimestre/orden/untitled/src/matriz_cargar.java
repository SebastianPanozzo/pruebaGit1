import java.util.Scanner;

public class matriz_cargar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*

        System.out.println("Ingrese el número de filas de la matriz:");
        int filas = scanner.nextInt();

        System.out.println("Ingrese el número de columnas de la matriz:");
        int columnas = scanner.nextInt();

        int[][] matriz = new int[filas][columnas];

        System.out.println("Ingrese los elementos de la matriz:");

        //  matriz
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("Ingrese el elemento en la posición [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        */

        int[][] matriz = {
                {1, 5, 3},
                {4, 5, 6},
                {7, 5, 9}
        };

        int filas = 3;
        int columnas = 3;

        /* Mostrar la matriz por consola
        System.out.println("Matriz :");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("[ " + matriz[i][j] + " ] ");
            }
            System.out.println(); // Nueva línea después de cada fila
        }

        */

        int uno = 0;
        int ene = 5;

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {

                if (matriz[i][j] == ene) {
                    uno = uno + 1;
                }

            }
        }

        System.out.print("[ " + uno + " ] ");

    }
}