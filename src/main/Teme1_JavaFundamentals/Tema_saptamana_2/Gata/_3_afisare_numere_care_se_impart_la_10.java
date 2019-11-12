package main.Teme1_JavaFundamentals.Tema_saptamana_2.Gata;

public class _3_afisare_numere_care_se_impart_la_10 {
    public static void main(String[] args) {
        int numereDivizibileCu10 = 0;
        int numereIndivizibileLa10 = 0;
        int[] numereleMele = {1, 12, 121, 222, 48, 548, 7575, 44, 240, 2121210};
        //System.out.println("Numerele sirului sunt: " + numereleMele + " ");
        System.out.print("Numerele care se impart la (10) din sir sunt: ");
        for (int i = 0; i < numereleMele.length; i++) {
            //System.out.println(numereleMele[i]);
            if (numereleMele[i] % 10 != 0) {
                //System.out.print(numereleMele[i] + " ");
                numereDivizibileCu10++;
            } else {
                System.out.println(numereleMele[i] + " ");
                numereIndivizibileLa10++;
            }
        } //System.out.println("\nAfiseaza numerele pare din sir: " + numerePare);
    }
}
