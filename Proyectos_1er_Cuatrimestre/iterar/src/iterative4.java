import java.util.Scanner;

public class iterative4 {

    public static void main(String[] Args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de números a ingresar: ");
        int numeros_totales = scanner.nextInt();

        int sumatoria = 0;

        int contador = 0;

        while (contador < numeros_totales) {
            System.out.print("Ingrese un número: ");
            int numero_ingresado = scanner.nextInt();
            sumatoria += numero_ingresado;
            contador++;

            if (numero_ingresado < 0 || numero_ingresado > 100 ) break;
        }

        System.out.println("Promedio de números ingresados es: " + sumatoria / numeros_totales);

    }
}
