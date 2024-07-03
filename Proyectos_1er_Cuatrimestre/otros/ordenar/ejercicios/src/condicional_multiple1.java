import java.util.Scanner;

public class condicional_multiple1 {
    public static void main(String[] Args) {

        Scanner pago = new Scanner(System.in);
        System.out.print("Ingrese la cantidad a pagar: ");

        int total_pagar = pago;

        if(total_pagar>=20000){
            total_pagar = total_pagar*0.80;
        }
        else if(total_pagar>=50000){
            total_pagar = total_pagar*0.75;
        }
        else if(total_pagar>=100000){
            total_pagar = total_pagar*0.70;
        }

    }
}
