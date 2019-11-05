package Tema_saptamana_2.Gata;
import java.util.Scanner;
public class _2_1_afisareTextDacaIntroduciNumere1_10 {
//AFISEAZA BUCLA CAT SE RESPECTA REGULA NUMERELOR INTRE 1 SI 9
        public static void main(String[] args) {
            Scanner keyboard = new Scanner(System.in);
            int number;
            do
            {
                System.out.print("Give me a number: ");
                number = keyboard.nextInt();
            }while (number%10 > 0);
        }
    }


