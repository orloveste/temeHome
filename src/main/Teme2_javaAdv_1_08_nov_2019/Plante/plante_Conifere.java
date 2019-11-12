package main.Teme2_javaAdv_1_08_nov_2019.Plante;
//documentare suplimentara: https://ro.wikipedia.org/wiki/Pădure_de_conifere
//softul nu recumoaste diacriticele :)) CUM FACI SA APARA TEXTUL? STRING?

public class plante_Conifere extends Plante {
    private String brad;
    private String molid;
    protected plante_Conifere(String brad, int varsta){
        super(varsta);
        //switch (varsta)
        //synchronized ()
        this.brad = brad;
    }

    public String getBrad() {
        return brad;
    }

    public String getMolid() {
        return molid;
    }
    /*public String getBrad(){

    }*/ // nu stiu ce a fost in capul meu sa fac get
}
