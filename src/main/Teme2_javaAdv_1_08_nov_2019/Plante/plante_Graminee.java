package main.Teme2_javaAdv_1_08_nov_2019.Plante;
//Poaceae sau gramineae (graminee) este o familie de plante erbacee (rar lemnoase) monocotiledonate, cu rădăcina
// fasciculată, cu tulpina formată din noduri și internoduri, cu inflorescența în formă de spic; (și la sg.) plantă care
// face parte din această familie. Familia conține între 9.000-10.000 de specii de plante
public class plante_Graminee extends Plante {
    private boolean matureIsGreen;
    public plante_Graminee(boolean matureIsGreen, int varsta){
        super(varsta);
        this.matureIsGreen = matureIsGreen;
    }
    public void cuSeminteOriFara(){
    }
}
