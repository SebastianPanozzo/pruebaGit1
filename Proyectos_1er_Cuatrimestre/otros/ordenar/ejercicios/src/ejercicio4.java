import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de horas trabajadas: ");
        int horas_trabajadas = scanner.nextInt();

        System.out.print("Ingrese valor sueldo x hora: ");
        int valor = scanner.nextInt();

        System.out.print("Ingrese total de horas de trabajo: ");
        int horas_promedio = scanner.nextInt();

        int sueldo = 0;

        if (horas_trabajadas <= horas_promedio) {
            sueldo = horas_trabajadas * valor;
        } else {
            sueldo = horas_promedio * valor + ((horas_trabajadas - horas_promedio) * (valor * 2));
        }

        System.out.println("Sueldo total es de: " + sueldo);

    }
}
