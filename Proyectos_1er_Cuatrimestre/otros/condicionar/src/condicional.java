import java.util.Scanner;

public class condicional {
    public static void main(String[] Args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese nota 1: ");
        int nota1 = scanner.nextInt();

        System.out.print("Ingrese nota 2: ");
        int nota2 = scanner.nextInt();

        System.out.print("Ingrese nota 3: ");
        int nota3 = scanner.nextInt();

        int promedio = ((nota1 + nota2 + nota3) / 3);

        if( promedio >= 60 ){
            System.out.print("Alumno aprobado: " + promedio);
        }
        else {
            System.out.print("Alumno desaprobado: " + promedio);
        }

    }
}