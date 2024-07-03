import java.util.Scanner;

public class interes {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese Pesos: ");
        int pesos = scanner.nextInt();

        System.out.print("Ingrese Años: ");
        int anios = scanner.nextInt();

        System.out.print("Ingrese interés (%): ");
        double interes = scanner.nextDouble();

        calcularInteres(pesos, anios, interes);

    }

    static void calcularInteres(int pesos, int anios, double interes) {
        double resultado = (pesos * Math.pow((1 + (interes / 100)), anios));

        System.out.println("Resultado: " + resultado);
    }
}


