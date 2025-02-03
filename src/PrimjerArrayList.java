import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

// ucitavavati brojeve dok korisnik ne upiše -1
public class PrimjerArrayList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList<Integer>();
        List<Integer> lista2 = new ArrayList<>(); // list se moze promijeniti u drugi tip za razliku od arralist

/*
        int ucitaniBroj = 0;
        do {
            System.out.println("Učitaj broj: ");
            ucitaniBroj = scanner.nextInt();
            if (ucitaniBroj != -1) {
                lista.add(ucitaniBroj); // dodavanje u listu
            }
        } while (ucitaniBroj != -1);

        System.out.println("Unesena lista je " + lista);
        System.out.println("Uneseni brojevi su :");
        for (Integer i : lista) {
            System.out.print(i + " ");
        }
        System.out.println();
        var uklonjeniBroj = lista.remove((int)(Math.random() * (lista.size() -1)));
        System.out.println("Uklonjen " + uklonjeniBroj);
        System.out.println("Lista bez elementa je " + lista);

        System.out.println();
        System.out.println("Lista pomocu for-a:");
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }
*/
        // Napišite program koji učitava broj koji predstavlja iznos u eurma koji prodavačica treba vratiti
        // klijentu. (Demo klase Scanner) Prodavačica uvijek uzvraća u najvećim novčanicama(kovanicama)
        // Program treba ispisati u koliko kojih novčanica (kovanica) treba uzvratiti
        // 500 2000 100 50 20 10 5 2 1 0.5 0.2 0.1 0.05 0.02. 0.01 eura
        // 1978 :
        // 3*500, 2 * 200 . 1*50. 1*20. 1*5 1*2 1*1
        // oduzimamo i ispisujemo koliko puta smo koju vrijednost oduzeli

        System.out.println("Unesite vrijednost: ");
        double unesenaVrijednost =  Double.parseDouble(scanner.nextLine());
        double [] novcanice = new double[] {
                500, 200, 100, 50, 20, 10, 5, 2, 1 , 0.5, 0.2, 0.1, 0.05, 0.02, 0.01
        };
        double preostalaVrijednost = unesenaVrijednost;

        for (double v : novcanice) {
            double test = 0.0;
            int brojac = 0;
            do {
                test = preostalaVrijednost - v;
                if (test >= 0) {
                    preostalaVrijednost = Math.round(test*100)/100.00;
                    brojac++;
                }
            } while (test > 0);
            if (brojac > 0) {
                System.out.println(brojac + "*" + v);
                System.out.println("Preostala vrijednost je " + preostalaVrijednost);
            }
            if (preostalaVrijednost <= 0) {
                break;
            }
        }




    }


}
