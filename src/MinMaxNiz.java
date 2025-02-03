import java.util.ArrayList;
import java.util.Scanner;

public class MinMaxNiz {
    public static void main(String[] args) {
        int[] nizBrojeva = new int[0];
        Scanner scanner = new Scanner(System.in);

        int uneseniBroj = 0;

        System.out.println("Koliko zelite brojeva : ");
        int velicinaPolja = scanner.nextInt();

        nizBrojeva = new int[velicinaPolja];

        for (int i = 0; i < velicinaPolja; i++) {
            System.out.println("Unesite broj: ");
            uneseniBroj = scanner.nextInt();
            if (uneseniBroj != -1) {
                nizBrojeva[i]= uneseniBroj;
            }
        }

        System.out.println("Uneseno polje je ");

        System.out.print("[");
        for (int i : nizBrojeva) {
            System.out.print(i + ",");
        }
        System.out.print("]");

        System.out.println();

        int min = nizBrojeva[0];
        int max = nizBrojeva[0];

        for (Integer i : nizBrojeva) {
            if (i < min) {
                min = i;
            }
            if (i > max) {
                max = i;
            }
        }

        System.out.println("Najveci broj je " + max + " a najmanji " + min);
        scanner.close();

    }
}
