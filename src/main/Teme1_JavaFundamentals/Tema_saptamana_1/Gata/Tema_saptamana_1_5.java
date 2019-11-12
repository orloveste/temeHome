package main.Teme1_JavaFundamentals.Tema_saptamana_1.Gata;
import java.util.Scanner;
public class Tema_saptamana_1_5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x, y;
        //String a = "*";
        System.out.println("Introduceti numarul: ");
        x = in.nextInt();
        y = 0;
        if (x == y) {
            System.out.println(" Numarul este 0!");
        }
        while (x > y) {
            y++;
            //System.out.println(x);
            //x--;
            System.out.print("$");//well done :)) facand exercitiul 10 am rezolvat 5
        }
    }
}


        /*int numar;
        Scanner in = new Scanner(System.in);
        System.out.println("Introduceti numarul pentru afisarea grafica: ");
        numar = in.nextInt();
        System.out.println("Numara verzisorii sa vezi daca corespunde numarului: " + numar);
        char dolar = '$';
        dolar = (char) numar;
        System.out.println(dolar); // afisare dolar
        System.out.println();*/
        /*int char*/
/*        int k = 0;
        while (numar < 0) {
            k++;
            numar--;
            if (k == numar){
                break;
            }
        }
        System.out.println("a intrat de " + k + " ori");*/

        /*final boolean b = (numar == dolar);
        System.out.println(b);*/
        //System.out.println(numar + dolar);








//5.	Scrieti un program care afiseaza pe ecran mai multi dolari.
// Numarul de dolari este introdus de la tastatura.
// De exemplu daca utilizatorul introduce numarul 5 atunci pe ecran se va afisa $$$$$