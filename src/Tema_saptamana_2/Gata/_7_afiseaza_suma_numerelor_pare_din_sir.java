package Tema_saptamana_2.Gata;
// gata, nu am reusit sa afisez sirul intreg separat de sirul cu pare extras
public class _7_afiseaza_suma_numerelor_pare_din_sir {
    public static void main(String[] args) {
        int[] sir = {21, 22, 21, 34, 2, 42, 45, 32, 5};
        int suma = 0;
        System.out.println("Sirul meu: ");
        for (int i = 0; i < sir.length; i++) {
            System.out.print(sir[i] + " ");// afisare sir
            if (sir[i] % 2 == 0) {
                suma += sir[i];
                //System.out.print(sir[i] + " ");//verificare daca scoate numerele pare

            }//System.out.println(suma);
        }
        System.out.println("\nSuma numerelor pare din sir este: " + suma);
    }
}
