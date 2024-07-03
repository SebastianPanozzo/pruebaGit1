import java.util.Scanner;

public class iterative10 {
    public static void main(String[] Args) {

    /*

    Se pide representar el algoritmo que nos calcule la suma
    de los N primeros números impares. Es decir, si ingresamos
    un 5, nos haga la suma de 1+3+5+7+9.

     */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de números a sumar: ");
        int cant = scanner.nextInt();

        int suma = 0;
        int impar = 1;

        for ( int i = 0 ; i < cant ; i++){
            suma = suma + impar;
            impar = impar + 2;
        }

        System.out.println("Suma de impares es: " + suma);

    }
}
