package Tema_saptamana_21_25_oct.Revizie;

import java.util.Random;
import java.util.Scanner;

public class nr_aparitii_in_sir {
    private int[] vector;
    //private int[] = new int[10];
    static int count = 0;

    public nr_aparitii_in_sir(int len) {
        vector = new int[len];
        Random random = new Random();
        for (int i = 0; i < len; i++) {
            vector[i] = 2 + random.nextInt(49);
        }
    }
    public nr_aparitii_in_sir(int len, int max) {
        vector = new int[len];
        Random random = new Random();
        for (int i = 0; i < len; i++) {
            vector[i] = 2 + random.nextInt(max);
        }
    }
    public void AfisareSir() {
        for (int i = 0; i < this.vector.length; i++) {
            System.out.print(this.vector[i] + " ");// "this" este optional in acest caz
        }
    }
    public int numarAparitii(int x) {
        int nrAparitii = 0;
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == x) {
                nrAparitii++;
            }
        }
        return nrAparitii;
    }
}
class Main2 {
    public static void main(String[] args) {
        nr_aparitii_in_sir sir1 = new nr_aparitii_in_sir(15,10);
        nr_aparitii_in_sir sir2 = new nr_aparitii_in_sir(10,5);

        Scanner input = new Scanner(System.in);
        System.out.println("\nIntroduceti numarul de cautat in sir: ");
        int nr = input.nextInt();
        sir1.AfisareSir();
        System.out.println("\nNumarul " + nr + " apare in sir1 de " + sir1.numarAparitii(nr) +
                " ori\n");
        sir2.AfisareSir();
        System.out.println("\nNumarul " + nr + " apare in sir2 de " + sir2.numarAparitii(nr) + " ori;");

    }
}