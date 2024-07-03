import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class function2 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int[] enteros = {1, 4, 3, 2, 5};
        System.out.println(Arrays.toString(enteros));
        int[] copia = Arrays.copyOf(enteros, enteros.length);

        Arrays.sort(copia);
        int indice = Arrays.binarySearch(copia, 3);
        System.out.println("El elemento está en la ubicación: " + indice);

        String[] nombres;

        ArrayList<String> ListaNombres = new ArrayList <>();

        ListaNombres.add("a");

    }

}