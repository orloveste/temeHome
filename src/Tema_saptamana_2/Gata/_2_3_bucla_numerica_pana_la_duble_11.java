package Tema_saptamana_2.Gata;

import java.util.Scanner;

public class _2_3_bucla_numerica_pana_la_duble_11 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int number;
        do
        {
            System.out.print("Introduceti numarul: ");
            number = keyboard.nextInt();
        }while (number % 11 != 0);
        System.out.println("Ai introdus corect " + number);
    }//nu e bun ca nu ia de la sute in sus
    //vezi ce am facut in clasa pe 12.10.2019
}

