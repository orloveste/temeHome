package Tema_saptamana_21_25_oct.Revizie;

//import java.util.Random;
import java.util.*;

public class static_vs_nonstatic {
    private int[] vector; // = new int[10];
    static int count = 0;
    int val = 0;
    public static_vs_nonstatic(int len) {
        vector = new int[len];
        Random random = new Random();
        for (int i = 0; i < len; i++) {
            vector[i] = 2 + random.nextInt(49);
        }
        count = 5;
        val = 55;
        //random.nextInt(200);
    }
    public static_vs_nonstatic(int len, int max) {
        vector = new int[len];
        Random random = new Random();
        for (int i = 0; i < len; i++) {
            vector[i] = 2 + random.nextInt(max);
        }
        count = 400;
        val = 99;
        //random.nextInt(200);
    }
    public void AfisareSir() {
        for (int i = 0; i < this.vector.length; i++) {
            System.out.print(this.vector[i] + " ");
            // este optional "this." in acest caz
        }
    }
    public static void AfisareSTatica(static_vs_nonstatic obj){//ex didactic
        obj.AfisareSir();
    }
}

class Main {
    public static void main(String[] args) {
        static_vs_nonstatic sir1 = new static_vs_nonstatic(7);
        sir1.AfisareSir();
        System.out.print("\nSir count: " + static_vs_nonstatic.count + " si sir1.val: "+
        sir1.val);
        System.out.println();

        static_vs_nonstatic nrLoto = new static_vs_nonstatic(6,49);
        nrLoto.AfisareSir();
        System.out.println("\nSir count: " + static_vs_nonstatic.count + " si sir1.val: "+
                sir1.val + " nrLoto.val: " + nrLoto.val);

        System.out.println("\nSir1 count: " + sir1.count + " nrLoto.count: " + nrLoto.count + " si sir1.val: "+
                sir1.val + " nrLoto.val: " + nrLoto.val);
        System.out.println();
    }

}