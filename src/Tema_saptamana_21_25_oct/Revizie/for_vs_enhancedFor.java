package Tema_saptamana_21_25_oct.Revizie;

import java.util.Arrays;

public class for_vs_enhancedFor {
    public static void main (String[] args) {
        int[] v = {33,22,33,46,55,33};
        for (int x : v) {
            System.out.print(x + " ");
        }
        System.out.println();
        //acelas lucru cu
        for (int i=0; i<v.length; i++) {
            int x=v[i];
            System.out.print(x +" ");
        }
        /*vrem sa inlocuim 33 cu 99 in sirul v*/
        for (int x:v) {
            if (x==33) {
                x=99;
            }
        }
        System.out.println("\n" + Arrays.toString(v));
    }
}
