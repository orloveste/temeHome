package Tema_saptamana_2.Gata;

import java.util.Scanner;

public class _4_afiseaza_numerele_maiMari_decat_cel_introdus {
    public static void main(String[] args) {
        int numere = 0;
        int numar;
        int[] numereleMele = {1, 12, 121, 222, 48, 548, 7575, 44};
        Scanner in = new Scanner(System.in);
        System.out.println("Introduceti numarul: ");
        numar = in.nextInt();
        System.out.print("Numerele din sir predefinit mai mari decat cel introdus: ");
        for (int i = 0; i < numereleMele.length; i++) {
            if (numereleMele[i] > numar) {
                System.out.print(numereleMele[i] + " ");
            }
        }
    }
}
