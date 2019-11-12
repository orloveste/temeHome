package main.Teme1_JavaFundamentals.Tema_saptamana_1.Gata;
import java.util.Scanner;
public class Tema_saptamana_1_6 {
    public static void main(String[] args) {
        int numar;
        int baza;
        System.out.println("Introduceti  numarul dorit: ");
        Scanner in = new Scanner(System.in);
        numar = in.nextInt();
        baza = 0;
        if (numar < 0) {
            System.out.println(" --------------"  + "\n*     " + numar + "       *" + "\n --------------");
        } else if (numar >= 0) {// Nu sunt multumit ca se schimba pozitia stelutei de sfarsit de pe linia cifrei
            System.out.println(" ++++++++++++++"  + "\n *\t\t" + numar + "\t  *" + "\n ++++++++++++++");
        } else {
            System.out.println("Caracterul ales nu este un numar valid! ");
        }
    }

}
/*6.	Scrieti un program care citeste de la tastatura un numar intreg n si
 afiseaza pe ecran mesaj de tipul:
-	Daca numarul e pozitiv:
+++++++++++++++++
*	     5       *
+++++++++++++++++
-	Daca numarul e negativ:
-----------------
*      -7       *
-----------------
*/