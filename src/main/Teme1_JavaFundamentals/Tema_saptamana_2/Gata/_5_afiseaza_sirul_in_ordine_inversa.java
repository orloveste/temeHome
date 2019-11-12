package main.Teme1_JavaFundamentals.Tema_saptamana_2.Gata;

import java.util.Arrays;

// forr = mama ei de viata
public class _5_afiseaza_sirul_in_ordine_inversa {
    public static void main(String[] args) {
        // le afiseaza in ordine
        int[] numereleMele = {1, 12, 121, 222, 48, 548, 7575, 44};
        Arrays.sort(numereleMele);
        System.out.print("Invresarea ordinii in print sir: ");
        for (int i = numereleMele.length -1; i >= 0; i--) {
            System.out.print(numereleMele[i] + " ");
        }
        /*for (numereleMele += new int []);
        System.out.println();*/
        /*int[] numereleMele = {1, 12, 121, 222, 48, 548, 7575, 44};

        System.out.print("Invresarea ordinii in print sir: ");
        for (int i = 0 ; i < numereleMele.length; i++){
            System.out.print(i + " = " + numereleMele[i] + " ");//pozitia*/
        //System.out.print(numereleMele[i] + ", ");
        //System.out.println(numereleMele[7]);
        /*int[] anArray = new int[] {1, 2, 3, 4, 5};// afisare sir
        for (int element : anArray) {
            System.out.println(element);
        }*/
        /*//Test - The first way is to use the for loop:
        int[] anArray = new int[] {1, 2, 3, 4, 5};
        for (int i = 0; i < anArray.length; i++) {
            System.out.println(anArray[i]);
        }*/
        //equals?
            /*{if (i == numereleMele[7]);
            i--;
            System.out.println(numereleMele[i]+" ");}*/
            /*do {
                System.out.println(numereleMele[i]);
                i--;

            }while (i = numereleMele[i]);*/
    }
    public int runBinarySearchIteratively(
            int[] sortedArray, int key, int low, int high) {
        int index = Integer.MAX_VALUE;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (sortedArray[mid] < key) {
                low = mid + 1;
            } else if (sortedArray[mid] > key) {
                high = mid - 1;
            } else if (sortedArray[mid] == key) {
                index = mid;
                break;
            }
        }
        return index;

    }
        /*for (int i = 0; i < numereleMele.length; i++) {

            System.out.println(i + " ");

        }*/
    }

