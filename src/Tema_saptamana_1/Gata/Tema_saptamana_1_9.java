package Tema_saptamana_1.Gata;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Scanner;
public class Tema_saptamana_1_9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int var1, var2, var3;
        int var0 = 0;
        System.out.print("Introduceti numarul 1: ");
        var1 = in.nextInt();
        System.out.print("Introduceti numarul 2: ");
        var2 = in.nextInt();
        System.out.print("Introduceti numarul 3: ");
        var3 = in.nextInt();
        while (var0 < var1 || var0 < var2 || var0 < var3) {
            var0++;
            if (var0 == var1) {
                System.out.println(var0 + " ");
            } else if (var0 == var2) {
                System.out.println(var0 + " ");
            } else if (var0 == var3) {
                System.out.println(var0 + " ");
            }
        }



        /*for (int x = var1;  x < var3; ++x) {
            System.out.print(x);
        }*/
        /*String[] variabileIntroduse = {var1 + "," + var2 + "," + var3 + ","};
        for (String i : variabileIntroduse) {
            System.out.print("Numerele aranjate sunt: " + i);*/
        /*if ((var1 < var2) && (var2 < var3)) {
            System.out.println("Numerele in ordine crescatoare sunt: " + var1 + ", " + var2 + ", " + var3);
        }
        if ((var1 < var2) && (var2 > var3)) {
            System.out.println("Numerele in ordine crescatoare sunt: " + var1 + ", " + var3 + ", " + var2);
        }
        if ((var1 > var2) && (var2 > var3)) {
            System.out.println("Numerele in ordine crescatoare sunt: " + var3 + ", " + var2 + ", " + var1);
        }
        if ((var1 > var2) && (var2 < var3)) {
            System.out.println("Numerele in ordine crescatoare sunt: " + var2 + ", " + var1 + ", " + var3);

            System.out.print("Comparatie: ");
            }*/




    }
}

//9.	Scrieti un program care citeste 3 numere de la tastatura
// si le afiseaza apoi in ordine crescatoare.