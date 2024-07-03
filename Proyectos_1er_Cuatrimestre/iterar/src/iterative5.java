import java.util.Scanner;

public class iterative5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número positivo: ");
        int numero = scanner.nextInt();

        if(numero <= 0) {
            System.out.println("El número ingresado no es positivo.");
        }

        int suma = 0;

        while(numero != 0) {
            suma += numero % 10; // Suma el resto de la división por 10
            numero /= 10; // Quita el último dígito
        }

        System.out.println("La suma de los dígitos de " + numero + " es: " + suma);

        scanner.close();

    }

}
