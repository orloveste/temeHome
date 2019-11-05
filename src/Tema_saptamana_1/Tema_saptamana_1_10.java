package Tema_saptamana_1;
import java.util.Scanner;
public class Tema_saptamana_1_10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x, y,z;
        String a = "*";
        System.out.println("Introduceti numarul: ");
        x = in.nextInt();
        y = 0;
        /*if (x == y) {
            System.out.println(" Numarul este 0!");
        }*/
        while (x > y) {

            final int[][] matrix = {
                    {y++}

            };
            for (y = 0; y <= matrix.length; y++) {
                for (y = 0; y < matrix.length; y++){
                    System.out.println(matrix[y][y] + " ");
                }

            }

            /*final int[][] matrix = {
                    { 1, 2, 3},
                    { 4, 5, 6},
                    { 7, 8, 9},
            };
            for (int x = 0; x < matrix.length; x++) {
                for (int y = 0; y < matrix[x].length; y++) {
                    System.out.println(matrix[x][y]);
                }

            }*/
            /*System.out.println(x);
            x--;*/
            /*if (x == 0) {
                break;
            }*/
            //System.out.print("$");
            //System.out.println("$");


        }
        /*System.out.println();
        System.out.println("a intrat de " + y + " ori");*/
    }
}



/*10.	Scrieti un program care afiseaza pe ecran un patrat format doar
din dolari. Dimensiunea patratului se citeste de la tastatatura.
De exemplu daca utilizatorul introduce numarul 3 atunci pe ecran se va afisa:
$$$
$$$
$$$*/