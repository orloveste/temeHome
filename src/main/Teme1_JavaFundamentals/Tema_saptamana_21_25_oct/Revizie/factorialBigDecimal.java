package main.Teme1_JavaFundamentals.Tema_saptamana_21_25_oct.Revizie;

import java.math.BigDecimal;
import java.util.Scanner;

public class factorialBigDecimal {
    public static void main (String[] args) {
        Scanner intrare = new Scanner(System.in);
        System.out.print(" introduceti numarul: ");
        int n = intrare.nextInt();
        int produs = 1;
        BigDecimal bigP = new BigDecimal(1);
        for (int i = 1; i <= n; i++) {
            //produs = produs*i;
            BigDecimal bigI = new BigDecimal(i);
            bigP = bigI.multiply(bigI);
        }
        System.out.println(n+ " ! + " +bigP.toString());
    }
}
