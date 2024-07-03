import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresar cantidad de km: ");
        int cantKm = sc.nextInt();

        int precio = cantKm * 45;
        System.out.println("Precio = " + precio);
    }
}

