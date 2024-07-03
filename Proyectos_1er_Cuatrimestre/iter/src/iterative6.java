import java.util.Scanner;

public class iterative6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero;
        do {
            System.out.print("Ingrese un número > 1: ");
        } while ((numero = scanner.nextInt()) <= 1);

        boolean esPrimo = true;
        for (int i = 2; i * i <= numero && esPrimo; i++) {
            esPrimo = numero % i != 0;
        }

        System.out.println(esPrimo ? "Es primo." : "No es primo.");
    }
}
