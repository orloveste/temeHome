package Tema_saptamana_2.Gata;
//gata
public class _9_afiseaza_numerele_pozitiveDinSir_si_fa_mediaLor {
    public static void main(String[] args) {
        int[] sir = {10,-12,293,-3,2938,121,-332,21,-31} ;
        int suma = 0;
        int numerePozitive = 0;
        System.out.print("sirul de numere este: ");
        for (int i = 0; i < sir.length; i++) {
            System.out.print(sir[i] + " ");//afiseaza sirul original
            if (sir[i] > 0) {
                //System.out.print(sir[i] + " ");//afiseaza numerele pozitive
                numerePozitive++;
                suma = suma + sir[i];
            }
        }System.out.print("\ncate numere pozitive sunt in sir: " + numerePozitive);
        System.out.println("\nsuma numerelor pozitive este = " + (float)suma/numerePozitive);
    }
}
