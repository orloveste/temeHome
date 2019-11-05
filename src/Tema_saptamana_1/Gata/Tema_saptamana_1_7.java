package Tema_saptamana_1.Gata;
import java.util.Scanner;
public class Tema_saptamana_1_7 {
    public static void main(String[] args) {
        int numar;
        Scanner in = new Scanner(System.in);
        System.out.println("Introduceti numarul: ");
        numar = in.nextInt();
        System.out.print("Enumerare de la 1 la ... numarul introdus:\n" );
        for (int x = 1; x <= numar; x++) {
            System.out.print(x + "\n");
        }
    }// a iesit binisor :)
}












/*7.	Scrieti un program care afiseaza pe ecran toate numerele de la 1 si pana la n unde n
 este un numar citit de la tastatura. De exemplu daca utilizatorul introduce numarul 10 atunci
 pe ecran sa va afisa: 1,2,3,4,5,6,7,8,9,10
 */