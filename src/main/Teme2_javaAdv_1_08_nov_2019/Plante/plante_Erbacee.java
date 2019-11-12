package main.Teme2_javaAdv_1_08_nov_2019.Plante;
// detalii in sursa https://ro.wikipedia.org/wiki/Plantă_erbacee
public class plante_Erbacee extends Plante {
    private int timp_de_viata;
    private String anuale ;//anual < 1
    private String bianuale;// 1< bianual <2
    private String perene;// 2 < perene
    private boolean ceTipDeViata; // si alegem cele 3 stringuri asa cum se potrivesc in IF

    public plante_Erbacee(int timp_de_viata, int varsta) {
        super(varsta);// nu inteleg de ce vrea int si bulean din plante
        this.timp_de_viata = timp_de_viata;
    }

    public int getTimp_de_viata() {
        int timp_de_viata = super.getVarsta();
//    if (int varsta <1){
////
////        }
        return timp_de_viata;
    }
//    public boolean CeTipDeViata(){
//       // if (getTimp_de_viata(anuale) == anuale) {
//            return ceTipDeViata;
//        }
//        //else if (timp_de_viata == bianuale){
//         //   return  ceTipDeViata;
//       // } return ceTipDeViata;
//    //}
    private boolean anuale(String anuale) {
        if ((0<timp_de_viata)&& (timp_de_viata <1)){
            return true;
        }return false;
    }
    private boolean bianuale(String bianuale) {
        if ((1<timp_de_viata)&& (timp_de_viata <2)){
            return true;
        }return false;
    }
    private boolean perene (String perene) {
        if ((2<timp_de_viata)&& (timp_de_viata <1)){
            return true;
        }return false;
    }

    //   public String getAnuale() {
//        anuale = getAnuale(timp_de_viata < 0);// de ce nu pot sa pun conditia?
//        if (getTimp_de_viata() <= 0) ( // varsta <0 = anuale
//
//        )
//        else{
//
//        }

//        public boolean CeTipDeViata(anuale) {//stabilim una dintre cele 3 metode
//    if (anuale!=bianuale && anuale!=perene)
//        return java.lang.String(ceTipDeViata);
//
//        return ceTipDeViata;
     // nu stiu ince ce fac cu ce tip de viata.... am uitat ideea
//    }
}