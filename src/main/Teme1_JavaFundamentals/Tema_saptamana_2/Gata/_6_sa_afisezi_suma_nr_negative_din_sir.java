package main.Teme1_JavaFundamentals.Tema_saptamana_2.Gata;
//gata
public class _6_sa_afisezi_suma_nr_negative_din_sir {
    public static void main(String[] args) {
        int[] numereleMele = {1, -12, -20, 121, -222, 48, 548, -7575, 44};
        int suma = 0;
        //int numereNegative;
        System.out.print("Suma numerelor negative din sir: ");
        for (int i = 0; i < numereleMele.length; i++) {
            System.out.print(numereleMele[i] + " ");
            //numereNegative = numereleMele[i];
            if (numereleMele[i] < 0) {
                //System.out.print(numereleMele[i] + " ");//afiseaza doar numerele negative
                suma += numereleMele[i];
            }   //System.out.print("Numerele negative fiind " + numereNegative);
        }   System.out.print(" este = ");
        System.out.print(suma);
    }

}