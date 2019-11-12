package main.Teme1_JavaFundamentals.Tema_saptamana_1.Gata;
import java.util.Scanner;
public class Tema_saptamana_1_8 {
    public static void main(String[] args) {
        int nota;
        int nota2;
        Scanner in = new Scanner(System.in);
        System.out.print("Introduceti nota: ");
        nota = in.nextInt();
        System.out.print("Introduceti nota 2: ");
        nota2 = in.nextInt();
        //float media;
        System.out.print("Media este: " + (float)  (nota + nota2)/2);
    }// de facut bucla la introducerea unei noi note sa se faca media notelor cumulate
}
