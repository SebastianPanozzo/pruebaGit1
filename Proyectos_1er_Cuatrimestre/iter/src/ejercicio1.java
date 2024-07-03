import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] Args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número positivo: ");
        int numero = scanner.nextInt();

        int copia = numero;

        if(numero <= 0) {
            System.out.println("El número ingresado no es positivo.");
            return;
        }

        int suma = 0;

        while(numero > 0) {
            suma += numero % 10; // Suma el resto de la división por 10
            numero /= 10; // Quita el último dígito
        }

        System.out.println("La suma de los dígitos de " + copia + " es: " + suma);

        scanner.close();

        /*

        // Multiplataforma, tipado, OOP

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de números a ingresar: ");
        int condicion = scanner.nextInt();

        switch (condicion) {
            case 1:
                System.out.println("case 1");
                break;
            case 2:
                System.out.println("case 2");
                break;
            default:
                System.out.println("default");
                break;
        }

        // Variables definidas (for) e indefinidas (while y do while)

        // i es una variable scope, valor solo en el for
        for (int i = 11
             ; i <= 3; i++) {
            System.out.println("for: " + i);
        }

        // Se puede no ejecutar, condicional antes
        boolean condicion2 = true;
        while (condicion2) {
        }

        // Se ejecuta 1 vez minimo, condicional despues
        boolean condicion3 = true;
        do
        {
        } while (condicion3);

        */

    }
}
