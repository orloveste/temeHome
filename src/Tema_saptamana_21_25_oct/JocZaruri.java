package Tema_saptamana_21_25_oct;
import java.util.*;
import java.math.*;
public class JocZaruri {
    private int valoareZar;
    private static int numarTotalAruncari = 0;
    private int sumaJucator = 100;

    private Random random = new Random();
    /*1) un constructor JocZaruri(int sumaJucator)
ce va initializa campul suma al obiectului JocZaruri cu suma disponibila pentru joc
*/
    public JocZaruri(int sumaJucator) {
        this.sumaJucator = sumaJucator;
       numarTotalAruncari++; // il face la fiecare aruncare fiecare jucator
        //sumaJucator = valoareZar; suma trebuie sa o faca la zaruri
    }//numarTotalAruncari++;                       // da eroare
    /*//2) aruncareZar()
    // ce va genera atribui campului valoareZar, al obiectului de tipul JocZaruri, un numar aleator intre 1 si 6
    // si va incrementa cu 1 campul static numarTotalAruncari;*/
    public int  aruncareZar() {// valabila pentru toate
        return random.nextInt(6) + 1; // 0 -> 6 // trebuie sa o trimitem in val za
        //numarTotalAruncari++;// da eroare
    }//numarTotalAruncari++;// da eroare
/*public int valoareZar() {
        new valoareZar = new int[aruncareZar()];
}*/ // nu il declara
    /*public void setValoareZar(int valoareZar) {
        this.valoareZar = aruncareZar();
    }*/ // nu cred ca trebuie set val zar

    //3) static int comparareZaruri(JocZaruri zar1, JocZaruri zar2)
    //care va primi ca si parametru 2 obiecte de tipulJocZaruri si va intoarce:
    //-1 daca zar1.valoareZar e mai mare
    //0 daca zarurile sunt egale
    //1 daca zar2.valoareZar e mai mare
    static int comparareZaruri(JocZaruri zar1, JocZaruri zar2) {// le compara fara sa le scoata? - de vazut
            if (zar1.valoareZar > zar2.valoareZar) {
                int diferenta = -1;
                return diferenta;
                // adauga caztig zar1
            } else if (zar2.valoareZar > zar1.valoareZar) {
                int diferenta = 1;
                return diferenta;
                // adauga castig zar2
            } else {
                int diferenta = 0;
                return diferenta;
                // nu trebuie sa adauge castig
            }
        }
    //numarTotalAruncari++;// error
    //4) adaugaCastig()
    // ce va adauga la suma obiectului castigator miza unui joc, de ex. 10 lei
    public int adaugaCastig() {// TO DO
        int adaugaCastig = 10;
        return getSuma();
    }
    //5) scadePierdere()
    //ce va scadea din suma obiectului pierzator miza unui joc, de ex. 10 lei
    public int scadePierdere() { // TO DO
        int scadePierdere = -10;
        return getSuma();
    }
    //6) int getSuma()
    //va intoarce valoarea campului sumaJucator al obiectului curent
    public int getSuma() {// sa adune zarurile la fiecare jucator
        return this.sumaJucator;
    }
    //7) static int getNumarTotalAruncari()
    //va intoarce valoarea campului static numarTotalAruncari
    static int getNumarTotalAruncari() {
        return numarTotalAruncari;
    }
}
class main {
    public static void main(String[] args) {
        JocZaruri zar1 = new JocZaruri(10);
        JocZaruri zar2 = new JocZaruri(10);
        //zar1.getSuma(zar1.adaugaCastig() || zar1.scadePierdere()) ;//= (zar1.adaugaCastig() || zar1.scadePierdere());
        Scanner in = new Scanner(System.in);
        String raspuns;
        do {
            System.out.println("Doriti sa jucati?");
            raspuns = in.nextLine();
            if (raspuns.equalsIgnoreCase("nu")) {
                System.out.println("La revedere!");
                break;
            }
            /*raspuns obj = new raspuns(raspuns, numarAruncari);
            raspuns[raspuns] = obj;*/ // nu merge identificare contor
            System.out.println("Aruncati jucatorul 1, zarul 1 = " + zar1.aruncareZar());
           /* System.out.println("Aruncati jucatorul 1, zarul 2");
            System.out.println(jucator1.aruncareZar());*/ // zar 2 j1
            System.out.println("Aruncati jucatorul 2, zarul 1 = " + zar2.aruncareZar());
            /*int numarAruncari = 0;
            for(int i = 0; i < numarAruncari.length; i++){
                if (numarAruncari[i] == x){
                    numarAruncari++;
                }
            }
            numarAruncari++;*/
            /*System.out.println("Aruncati jucatorul 2, zarul 2");
            System.out.println(jucator2.aruncareZar());*/
            /*System.out.println("suma zar juc 1: " + (jucator1.aruncareZar() + jucator1.aruncareZar()));
            System.out.println("suma zar juc 2: " + (jucator2.aruncareZar() + jucator2.aruncareZar()));*/
            System.out.println("Numar total aruncari: ");
            System.out.println(JocZaruri.getNumarTotalAruncari());
            System.out.println();
        } while (!raspuns.equalsIgnoreCase("nu"));
        /*System.out.println("Numar total aruncari: ");
        System.out.println(JocZaruri.getNumarTotalAruncari());
        System.out.println();*/                                 //nu le numara
        //for (int i = 0; i < )
        /*if (numarTotalAruncari > 0) {
            //trebuie sa calculez un total, sa merg prin sir cos - sa adun si sa fac suma
            //for (Produse x: cos) {// nu merge
            for (int i = 0; i <; i++) {
                //cum pot afla pretul unui produs? - dai cos x.pret/
                //buget = buget - x.pret;//nu merge
                buget = buget - cos[i].pret;
            }
        }
        //restul
        if (buget > 0){
            System.out.println("Mi-au mai ramas: "+ buget+" lei");
        }
        else{
            System.out.println("Am ramas datort cu "+ Math.abs(buget) + " lei"); // reducere
        }
        System.out.println(Math.abs(buget)+ " lei");// afiseaza din sortare
        //cat a mai ramas in magazin
        System.out.println("in magazin au mai ramas " + Produse.totalProduse + " produse");*/

    }
}








/*

import java.util.Random;

public class jocZaruri {
    private int[] valoareZar;
    private static int numarTotalAruncari;
    private int sumaJucator;
    */
/*public jocZaruri (int suma ) { //de gandit formula daca trebuie
        //this.suma = sumaJucator;
        numarTotalAruncari++;
    }*//*

    //1) un constructor JocZaruri(int sumaJucator)
    public jocZaruri(int sumaJucator) {//trebuie sa faca suma zarurilor
        */
/*zar1 + zar2
         *//*

    }
    //2) aruncareZar()
    public void aruncareZar() {// se leaga de valoareZar din jocZaruri 1/6
        */
/*valoareZar = new int[zar1];
        Random random = new Random();
        for (int i = 0; i < zar1; i++) {
            zar1[i] = 1 + random.nextInt(6);
            numarTotalAruncari++;// trebuie sa numere aruncarile
        }*//*

    } */
/*3) static int comparareZaruri(JocZaruri zar1, JocZaruri zar2)
    care va primi ca si parametru 2 obiecte de tipulJocZaruri si va intoarce:*//*

    */
/*public static int comparareZaruri(jocZaruri zar1, jocZaruri zar2) {
        for (zar1.valoareZar < zar2.valoareZar) {
            return -1;
        }
        for (zar1.valoareZar == zar2.valoareZar) {
            return 0;
        }
        for (zar1.valoareZar > zar2.valoareZar) {
            return 1;
        }
    }*//*



    */
/* public jocZaruri(int zar2) {// al doilea zar nu merge cu aceeasi schema
         valoareZar = new int[zar2];
         Random random = new Random();
         for (int i = 0; i<zar2; i++){
             valoareZar[i] = random.nextInt(6);
         }
     }*//*

    //4) adaugaCastig()
    // ce va adauga la suma obiectului castigator miza unui joc, de ex. 10 lei
    int castig = 10;
    */
/*adaugaCastig() {

    }*//*


    //5) scadePierdere()
    //ce va scadea din suma obiectului pierzator miza unui joc, de ex. 10 lei
    */
/*scadePierdere(){

    }*//*


    //6) int getSuma()
    //va intoarce valoarea campului sumaJucator al obiectului curent
    */
/*int getSuma() {

    }*//*



    //7) static int getNumarTotalAruncari()
    //va intoarce valoarea campului static numarTotalAruncari
    */
/*static int getNumarTotalAruncari(){

    }*//*


    */
/*public jocZaruri(int min, int max) {
        valoareZar = new int[sumaJucator];
        Random random = new Random();
        for (int i = 0; i < sumaJucator; i++) {
            valoareZar[i] = 2 + random.nextInt(max);
        }
        numarTotalAruncari = 400;
        this.sumaJucator= 99;
    }*//*




}
class executieJocZar {
    public static void main(String[] args) {
        jocZaruri [] jucator1 = new jocZaruri[2];
        jocZaruri [] jucator2 = new jocZaruri[2];

    }
}*/
