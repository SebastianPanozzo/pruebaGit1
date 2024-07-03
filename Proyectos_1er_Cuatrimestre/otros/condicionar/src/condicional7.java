import java.util.Scanner;

public class condicional7 {
    public static void main(String[] Args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese artículo: ");
        String articulo = scanner.next();

        System.out.print("Ingrese clave: ");
        int clave = scanner.nextInt();

        System.out.print("Ingrese precio: ");
        int precio = scanner.nextInt();


        if(clave == 01){
            System.out.println("Articulo: " + articulo);
            System.out.println("Precio: " + precio );
            System.out.println("Descuento: " + precio * 0.9);
        } else if (clave == 02) {
            System.out.println("Articulo: " + articulo);
            System.out.println("Precio: " + precio );
            System.out.println("Descuento: " + precio * 0.8);
        } else {
            System.out.print("Clave no válida.");
        }

    }
}