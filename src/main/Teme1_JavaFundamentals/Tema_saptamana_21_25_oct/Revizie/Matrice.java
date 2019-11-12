package main.Teme1_JavaFundamentals.Tema_saptamana_21_25_oct.Revizie;

public class Matrice {
    public static void main(String[] args) {
        //int[][] m = new int [4][4];
        int[][] m = {{1,2,3}, {4,5,6}, {7,8,9}};
        System.out.println("Matricea este: ");
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++){
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
    }
}
