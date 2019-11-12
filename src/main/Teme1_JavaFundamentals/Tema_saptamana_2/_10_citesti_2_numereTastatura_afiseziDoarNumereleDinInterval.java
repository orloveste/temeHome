package main.Teme1_JavaFundamentals.Tema_saptamana_2;
import java.util.Scanner;//se face in clasa
public class _10_citesti_2_numereTastatura_afiseziDoarNumereleDinInterval {
    public static void main (String[] args) {
        int [] sirDeNumere = { 12,22,324,545,221,1,2,4,56,7,9,2323,-3,-242};

        int a, b;//numere introduse din tastatura
        //int [] sirInterval = new[] sirDeNumere;

        Scanner tastatura = new Scanner(System.in);
        System.out.print("\nIntroduceti variabila a: ");
            a = tastatura.nextInt();
            System.out.print("Introduceti variabila b: ");
            b = tastatura.nextInt();
        System.out.print("Sir de numere predefinit: ");
        for (int i = 0; i < sirDeNumere.length; i++) {
            System.out.print(sirDeNumere[i] + " ");//printeaza sirul
            for (int i1 = sirDeNumere.length - 1; i1 >= 0; i1--) {

            }


            /*int[] evenArray = Arrays.stream(array)
                    .filter(value -> value % 2 == 0)
                    .toArray();*/
            //}
            /*if (((a < sirDeNumere[i]) || (sirDeNumere[i] < b)) && ((a > sirDeNumere[i]) || (sirDeNumere[i] > b))){

                System.out.println("acesta este intervalul: " );
            } else {
                //System.out.println();
            }//System.out.println(sirDeNumere[i]);*/


        }


    }
}
