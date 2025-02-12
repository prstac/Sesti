import java.util.ArrayList;
import java.util.Scanner;

public class MinMaxNiz {
    public static void main(String[] args) {
        int[]nizBrojeva =  ucitajPolje();
        ispisPolja(nizBrojeva);
        System.out.println("Najveci broj je " + nadjiMax(nizBrojeva) + " a najmanji " + nadjiMin(nizBrojeva));
    }

    public static int[] ucitajPolje() {
        System.out.println("Koliko zelite brojeva : ");
        Scanner scanner = new Scanner(System.in);
        int velicinaPolja = scanner.nextInt();

        int[] nizBrojeva = new int[velicinaPolja];
        for (int i = 0; i < velicinaPolja; i++) {
            System.out.println("Unesite broj: ");
            nizBrojeva[i] = scanner.nextInt();
        }
        scanner.close();
        return nizBrojeva;
    }

    public static void ispisPolja(int[] nizBrojeva) {
        System.out.println("Uneseno polje je ");
        System.out.print("[");
        for (int i = 0; i < nizBrojeva.length -1; i++) {
            System.out.print(nizBrojeva[i] + ",");
        }
        System.out.print(nizBrojeva[nizBrojeva.length - 1] + "]");
        System.out.println();
    }


    public static int nadjiMin(int[] niz) {
        int min = niz[0];
        for (Integer i : niz) {
            if (i < min) {
                min = i;
            }
        }
        return min;
    }
    public static int nadjiMax(int[] niz) {
        int max = niz[0];
        for (Integer i : niz) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }
}
