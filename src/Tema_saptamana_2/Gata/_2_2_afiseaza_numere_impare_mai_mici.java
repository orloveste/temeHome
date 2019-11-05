package Tema_saptamana_2.Gata;
import java.util.Scanner;
public class _2_2_afiseaza_numere_impare_mai_mici {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int numar;
        int i;
        System.out.print("Introduceti numarul de referinta: ");
        numar = keyboard.nextInt();
        System.out.println("Afiseaza numarul ales este: " + numar);
        for (i = 0; numar >= i; i++) {
            if (i % 2 != 0)
                System.out.print(i + " ");
        }
    }
}
