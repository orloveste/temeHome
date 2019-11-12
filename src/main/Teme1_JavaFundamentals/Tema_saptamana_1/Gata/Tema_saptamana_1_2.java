package main.Teme1_JavaFundamentals.Tema_saptamana_1.Gata;

import java.util.Scanner;
public class Tema_saptamana_1_2 {
    public static void main(String[] args) {
        long a, b;//numere alese spre verificare
        Scanner in = new Scanner(System.in);//introducere externa
        System.out.print("Introduceti primul numar: ");
        a = in.nextInt();//conditionare
        System.out.print("Introduceti al doilea numar: ");
        b = in.nextInt();
        if (a == b) {
            System.out.println("Raspuns: Numerele alese sunt egale!");
        }
        else {
            System.out.println("Raspuns: Numarele alease NU sunt egale!");
        }
    }

}
