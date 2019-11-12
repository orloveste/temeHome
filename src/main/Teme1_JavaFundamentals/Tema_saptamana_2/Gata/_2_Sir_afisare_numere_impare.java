package main.Teme1_JavaFundamentals.Tema_saptamana_2.Gata;

public class _2_Sir_afisare_numere_impare {
    public static void main(String[] args) {
        int numerePare = 0;
        int numereImpare = 0;
        int[] numereleMele = {1, 12, 121, 222, 48, 548, 7575, 44};
        //System.out.println("Numerele sirului sunt: " + numereleMele + " ");
        System.out.print("Numerele pare din sir sunt: ");
        for (int i = 0; i < numereleMele.length; i++) {
            //System.out.println(numereleMele[i]);

            if (numereleMele[i] % 2 == 0) {

                System.out.print(numereleMele[i] + " ");
                numerePare++;
            } else {
                //System.out.println(numereleMele[i] + " ");
                numereImpare++;
            }
        } //System.out.println("\nAfiseaza numerele pare din sir: " + numerePare);
    }
}
