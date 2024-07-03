import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el monto presupuestado total: ");
        double montoTotal = scanner.nextDouble();

        // Es una buena práctica declarar números como variables

        double Urgencias = 0.37;
        double Pediatría = 0.42;
        double Traumatología = 0.21;

        double montoUrgencias = montoTotal * Urgencias;
        double montoPediatría = montoTotal * Pediatría ;
        double montoTraumatología = montoTotal * Traumatología;

        // Imprimir la cantidad de dinero que recibirá cada área
        System.out.println("Cantidad de dinero para Urgencias: " + montoUrgencias);
        System.out.println("Cantidad de dinero para Pediatría: " + montoPediatría);
        System.out.println("Cantidad de dinero para Traumatología: " + montoTraumatología);

    }
}
