package main.Teme1_JavaFundamentals.Tema_saptamana_21_25_oct.Revizie;

import java.util.Scanner;

public class Produse {
    String numeProdus;
    int pret;
    static int totalProduse = 10;

    public Produse (String nume, int pret) {
        this.numeProdus = nume;
        this.pret = pret;
        totalProduse--;
    }
}
class StartApp {
    public static void main(String[] args) {
        Produse[] cos = new Produse[3];
        int buget = 100;
        Scanner in = new Scanner(System.in);
        int nrProduse = 0;
        String produs;
        int pretProdus = 0;
        do {
            System.out.println("Ce doriti? ");
            produs = in.nextLine();
            if (produs.equalsIgnoreCase("nimic")){
                System.out.println("La revedere! ");
                break;
            }
            System.out.println("De cati bani?");
            pretProdus =in.nextInt();
            in.nextLine();
            Produse obj = new Produse(produs, pretProdus);
            cos[nrProduse] = obj;
            nrProduse++;
        }
        while ((produs.equalsIgnoreCase("nimic") == false) &&
                (nrProduse < 3));
        for (int i = 0; i <nrProduse; i++) {
            buget=buget-cos[i].pret;
        }
        if (buget >=0) {
            System.out.println("Mi-au mai ramas " + buget + " lei");
        }
        else {
            System.out.println("Am ramas dator cu " + buget + " lei");
        }
    }
}