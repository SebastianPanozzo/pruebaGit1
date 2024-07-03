import java.util.Scanner;

public class programa2 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresar nombre: ");
        String nombre = sc.next(); // Lee la próxima cadena ingresada por el usuario

        System.out.println("Tu nombre es " + nombre); // Imprime el nombre ingresado por el usuario
    }
}
