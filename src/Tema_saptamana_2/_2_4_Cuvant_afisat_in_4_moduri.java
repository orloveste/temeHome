package Tema_saptamana_2;
import java.util.Scanner;
public class _2_4_Cuvant_afisat_in_4_moduri {
    public static void main(String[] args) {
        String text = new String();
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Introdu cuvantul: ");
        text = keyboard.nextLine();
        System.out.println(text.toUpperCase());// litere mari
        System.out.print(text.length());// normal
        //sa le spargem...

    }
}
