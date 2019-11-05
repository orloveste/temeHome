package Tema_saptamana_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

//https://www.baeldung.com/java-arrays-guide
public class arrays_site {
    public static void main(String[] args) {


        /*//gaseste index-ul
        int[] anArray = new int[] {5, 2, 1, 4, 8};
        for (int i = 0; i < anArray.length; i++) {
            if (anArray[i] == 4) {
                System.out.println("Found at index " + i);
                break;
            }
        }*/
        /*//sortare arrays
        int[] anArray = new int[] {5, 2, 1, 4, 8};
        Arrays.sort(anArray); // anArray is now {1, 2, 4, 5, 8}


        Integer[] anotherArray = new Integer[] {5, 2, 1, 4, 8};
        Arrays.sort(anotherArray); // anotherArray is now {1, 2, 4, 5, 8}


        String[] yetAnotherArray = new String[] {"A", "E", "Z", "B", "C"};
        Arrays.sort(yetAnotherArray, 1, 3,
                Comparator.comparing(String::toString).reversed()); // yetAnotherArray is now {"A", "Z", "E", "B", "C"}*/
            /*int[] anArray = new int[] {1, 2, 3, 4, 5};

            List<Integer> aList = new ArrayList<>();
            for (int element : anArray) {
                aList.add(element);
                System.out.println();
            }*/
        /*//This example is equivalent to the previous one, but we got rid of
        // the indices boilerplate code. The foreach loop is an option when:
        //we don't need to modify the array (putting another value in an element
        // won't modify the element in the array)
        //we don't need the indices to do something else
        int[] anArray = new int[] {1, 2, 3, 4, 5};
        for (int element : anArray) {
            System.out.println(element);
        }*/
       /* //The first way is to use the for loop:
        int[] anArray = new int[] {1, 2, 3, 4, 5};
        for (int i = 0; i < anArray.length; i++) {
            System.out.println(anArray[i]);
        }*/


    }
}
