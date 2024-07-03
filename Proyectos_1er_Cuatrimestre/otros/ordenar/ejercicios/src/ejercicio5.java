import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese número 1: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Ingrese número 2: ");
        double numero2 = scanner.nextDouble();

        double calculo1 = (numero1 * 2) + Math.sqrt(numero2);
        double calculo2 = ( (Math. pow(numero1, 3)) + (Math. pow(numero2, 3)) ) / 2;

        System.out.println("Calculo 1: " + calculo1);
        System.out.println("Calculo 2: " + calculo2);

    }
}
