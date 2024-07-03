public class primo_sumatoria {

    static int[][] matriz1 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
    };

    static int filas1 = 3;
    static int columnas1 = 3;

    public static void main(String[] args){

        sumatoria(matriz1);
        primo(matriz1);
        promedio(matriz1);
    }

    static int promedio(int[][] matriz){

        int suma_total = 0;

        for (int i = 0; i < filas1; i++) {
            for (int j = 0; j < columnas1; j++) {
                suma_total += (matriz[i][j]);
            }
        }

        System.out.println(suma_total / 9);

        return suma_total;

    }

    static int sumatoria(int[][] matriz){

        int suma_total = 0;

        for (int i = 0; i < filas1; i++) {
            for (int j = 0; j < columnas1; j++) {
                suma_total += (matriz[i][j]);
            }
        }

        System.out.println(suma_total);

        return suma_total;
    }

    static void primo(int[][] matriz){

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                boolean esPrimo = true;
                for (int k = 2; k <= (matriz[i][j]) / 2; k++) {
                    if ((matriz[i][j]) % i == 0) {
                        esPrimo = false;
                        break;
                    }
                }

                if (esPrimo)
                    System.out.println((matriz[i][j]) + " es primo.");
                else
                    System.out.println((matriz[i][j]) + " no es primo.");

            }
        }

        return;
    }

}
