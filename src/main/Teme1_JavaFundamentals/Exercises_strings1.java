package main.Teme1_JavaFundamentals;

import java.util.Scanner;

public class Exercises_strings1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /*1.Create variable of type String. Initialize it with value "Lorem ipsum dolor sit amet , consectetur adipiscing elit”.
        a) Convert it to lower case
        b) Convert it to upper case
        c) Replace „o” with „z"
        d) Check if your variable ends with „elit”.*/
        String a = "Lorem ipsum dolor sit amet , consectetur adipiscing elit";
        String b = new String("Lorem ipsum dolor sit amet , consectetur adipiscing elit");
        System.out.println("Exercitii 01_Java_Fundamental, pag31 \n Punctul 1 - raspunsuri:");
        System.out.println("Text original: " + "\"" + b + "\"");
        System.out.println("a)" + b.toLowerCase());
        System.out.println("b)" + b.toUpperCase());
        System.out.println("c)" + b.replace('o', 'z'));
        //Check if ends with a particular sequence
        System.out.println("d.1) se termina cu: pup - " + b.endsWith("pup"));
        System.out.println("d.2) se termina cu: elit - " + b.endsWith("elit"));
       /*2. Write in a comment on each line what result you expect .
                Launch it and verify the results
        String a = "abc";
        String b = "abc";
        String c = new String("abc");
        System.out.println(a == b);
        System.out.println(a.equals (b));
        System.out.println(b == c);
        System.out.println(b.equals (c); */
        String a1 = "abc";
        String b1 = "abc";
        String c1 = new String("abc" );

        System.out.println("\nExercitii 01_Java_Fundamental, pag31 \n Punctul 2 - raspunsuri:");
        System.out.println("a1 = a");
        System.out.println("b1 = b");
        System.out.println("c1 = c");
        // o sa fie adevarat
        System.out.println("a este la fel cu b: " + (a1 == b1));
        /*The == is a relational operator in Java that is used to compare two operands. It is used to determine whether
         the two operands are equal or not. Using the == operator, you can compare any primitive type such as int, char,
          float and Booleans. After comparison, the == operator returns a boolean value.*/
        //o sa fie adevarat
        System.out.println("a este egal cu b: " + a1.equals (b1));
        /* o sa fie fals */
        System.out.println("b nu o sa fie la fel ca c: " + ( b1 == c1));
        System.out.println("a o sa fie la fel ca c: " + ( a1 == c1));
        /* o sa fie adevarat*/
        System.out.println("b o sa fie egal cu c acum: " + b1.equals (c1));
        System.out.println("a o sa fie egal cu c acum: " + a1.equals (c1));
        /*The equals() Method example in Java
The equals() method compares two objects for equality and returns true if they are equal. The equals() method provided
 in the Object class uses the identity operator (==) to determine whether two objects are equal. For primitive data types,
  this gives the correct result.*/




    }
}
