import java.util.Locale;
import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de kilómetros a recorrer: ");

        scanner.useLocale(Locale.US);
        float kilometros = scanner.nextFloat();

        double precioPorKm = 10.50; // Precio por kilómetro en Bs/.
        double precioTotal = kilometros * precioPorKm;

        System.out.println("El precio del boleto es: Bs/." + precioTotal);

    }
}
