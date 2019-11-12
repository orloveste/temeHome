package main.Teme1_JavaFundamentals.Tema_saptamana_1.Gata;
import  java.util.Scanner; // prestabilesti necesitatea de introducere a datelor extern
public class Tema_saptamana_1_4 {
    //NU AM TERMINAT - BLOCAT
    public static void main(String[] args) {
        int an;
        int x = 4;
        int y = 400;
        int z = 100;

        Scanner in = new Scanner(System.in);
        System.out.println("Adaugati anul: ");
        an = in.nextInt();

        if ((an % x == 0) && (an % y == 0)) {
            System.out.println("Anul este divizibil cu 4, dar este divizibil si cu 400, deci nu este an bisect");
        } else if ((an % x == 0) || (an % z == 0)) {
            System.out.println("Anul este divizibil cu 4 sau 100, deci este an bisect");
        } else {
            System.out.println("Anul nu este bisect");
        }
  /*  public static void main(String[] args) {
        int an;// ce trebuie? nume
        Scanner in = new Scanner(System.in);// activezi canalul
        System.out.println("Introduceti anul de la 0 la 3000, pentru a afla daca este an bisect: ");//text enunt
        an = in.nextInt();//introduci date
        int b = an;
        for (int anBisect = 0; anBisect <= 3000; anBisect = anBisect + 4) {
                if (an == anBisect) {
                    System.out.println("Este an bisect");

                }


               *//* while (b == anBisect) {
                    System.out.println("pup");
            }*//*
         *//*b = (an != anBisect);
                    else {
                    System.out.write("Gata");
                }*//*
         *//*System.out.println("Nu este an bisect" + (an != anBisect));*//*
         *//*do {
                        System.out.println("Nu este an bisect!");
                    } while (false);*//*
         *//*else if (an != anBisect) {
                    System.out.println("Nu este an bisect");
                }
                else {
                    System.out.println("Eroare, anul nu este acceptat");
                }*//*

        }

    }*/

    }
}