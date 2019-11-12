package main.Teme1_JavaFundamentals.Tema_saptamana_2.Gata;

public class _8_afiseaza_media_numerelor_din_sir {
    public static void main(String[] args) {
        int[] sir = {7,6,7,7,7,8,9,10,5};
        int suma = 0;
        System.out.println("sirul de numere: ");
        for (int i = 0; i < sir.length; i++){
            System.out.print(sir[i] + " ");//afisare sir de numere
            suma += sir[i];
        }System.out.println("\nMedia numerelor este = " + (float)suma/sir.length);
    }
}
