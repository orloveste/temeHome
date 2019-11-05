import java.util.Scanner;
public class Curs2Variabile {
    public static void main(String[] args) {
        int var1 = 6;
        int var2 = 11;
        double var3 = 0;
        int suma = 0;
        Scanner intrare = new Scanner(System.in);
        System.out.println("Introdu var1: ");
        var1 = intrare.nextInt();
        System.out.println("Introdu var2: ");
        var2 = intrare.nextInt();
        System.out.println("Introdu var3: ");
        var3 = intrare.nextInt();
        suma = var1 + var2;
        System.out.println("suma este: "+ suma + " nr double este: " + var3);
    }


}
