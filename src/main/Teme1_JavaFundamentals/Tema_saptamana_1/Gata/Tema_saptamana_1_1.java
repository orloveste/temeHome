package main.Teme1_JavaFundamentals.Tema_saptamana_1.Gata;

import java.util.Scanner;

public class Tema_saptamana_1_1 {
    public static void main(String[] args) {
        int a;//numar ales spre verificare
        Scanner in = new Scanner(System.in);//introducere externa
        System.out.print("Introduceti numarul pentru a afla daca este pozitiv sau negativ: ");
        a = in.nextInt();//conditionare
        if (a >= 0) {
            System.out.println("Numarul ales este pozitiv!");
        }
        else {
            System.out.println("Numarul ales este negativ!");
        }
    }

}
