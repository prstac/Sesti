//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int [] polje = new int[(int)(Math.random() * 10  +  1)];
        for (int i = 0; i < polje.length; i++) {
            polje[i] = (int) (Math.random() * 5 + 1);
        }

        for (int i : polje) {
            System.out.println(i + " ");
        }

        System.out.println();
    }
}