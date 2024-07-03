import java.util.Scanner;

public class adivina_numero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numeroAdivinar = (int) (Math.random() * 100); // Genera un número aleatorio entre 0 y 99
        int intentos = 5;
        int min = 0;
        int max = 100;

        System.out.println("Bienvenido al juego Adivina el Número!");
        System.out.println("Tienes 5 intentos para adivinar el número entre " + min + " y " + (max - 1));

        while (intentos > 0) {
            System.out.print("Ingresa tu número: ");
            int numeroUsuario = scanner.nextInt();

            if (numeroUsuario == numeroAdivinar) {
                System.out.println("¡Felicidades! ¡Has adivinado el número!");
                return; // Termina el juego
            } else {
                intentos--;
                if (intentos > 0) {
                    System.out.println("¡Incorrecto! Te quedan " + intentos + " intentos.");
                    if (numeroUsuario < numeroAdivinar) {
                        System.out.println("El número a adivinar es mayor.");
                        min = numeroUsuario;
                    } else {
                        System.out.println("El número a adivinar es menor.");
                        max = numeroUsuario;
                    }
                    System.out.println("Sigue intentándolo entre " + min + " y " + (max - 1));
                } else {
                    System.out.println("¡Perdiste! El número correcto era: " + numeroAdivinar);
                }
            }
        }
    }
}
