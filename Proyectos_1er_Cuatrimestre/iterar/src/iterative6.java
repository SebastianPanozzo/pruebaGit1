import java.util.Scanner;

public class iterative6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número entero positivo mayor que 1: ");
        int numero = scanner.nextInt();

        if (numero <= 1) {
            System.out.println("El número debe ser mayor que 1.");
            return;
        }

        boolean esPrimo = false;

        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                esPrimo = false;
            } else {
                esPrimo = true;
        } }

        if (esPrimo) {
            System.out.println("Es primo.");
        } else {
            System.out.println("No es primo.");
        }

    }
}