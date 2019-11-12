package main.Teme2_javaAdv_1_08_nov_2019.Plante;
// daca ma apuca entuziasmul sa fac o clasificare stiintifica
// https://ro.wikipedia.org/wiki/Clasificarea_Regnului_Plantae_după_Al._Beldie_1977
public class Plante {// clasa de baza
    // sa dam ceva comun
    private boolean cuFlori;
   // private boolean faraFlori; //prea mult
    private int varsta = 1;
    public Plante(int varsta/*, boolean cuFlori*//*, boolean cuFlori, boolean faraFlori*/){
        this.varsta = varsta;
        this.cuFlori = cuFlori;
//        this.faraFlori = faraFlori;
    }
    /*public Plante(boolean cuFlori, boolean faraFlori){
        this.cuFlori = cuFlori;
        this.faraFlori = faraFlori;
    }*/// ceva nu se leaga aici
    public boolean  getCuFlori() {
        System.out.println("planta face flori" + cuFlori );// de ce as face asta?
        return  cuFlori;
    }
    /*public boolean  getFaraFlori() {
        System.out.println("planta nu face flori" + (cuFlori != faraFlori));//nu are cum sa fie diferit
        return  faraFlori;
    }*/ // nu are sens

    public int getVarsta() {
        System.out.println(" planta ere varsta " + varsta);
        return varsta;
    }
}
