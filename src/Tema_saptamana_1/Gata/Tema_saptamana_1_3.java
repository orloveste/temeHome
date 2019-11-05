package Tema_saptamana_1.Gata;

import java.util.Scanner;
public class Tema_saptamana_1_3 {
    public static void main(String[] args) {
        int a,b,x;//numere alese
        Scanner in = new Scanner(System.in);
        System.out.print("Introduceti primul numar: ");
        a = in.nextInt();//conditionare
        System.out.print("Introduceti al doilea numar: ");
        b = in.nextInt();
        System.out.println("Introduceti numarul pe care vreti sa il verificati, daca este intre primul si al doilea numar: ");
        x = in.nextInt();
            if ( x > a && x < b) {
                System.out.println("Numarul verificat este in intervalul corect!");
            }
            else  if (x < a && a > b){
                System.out.println("Numarul verificat este in intervalul corect!");
            }
            else {
                System.out.println("Numarul nu este in intervalul ales!");
            }
        }

    }

