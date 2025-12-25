package academy.devdojo.maratona.java.introducao;
//Arrays Multidimensionais
public class OlaDevDojo18 {
    static void main(String[]args) {
        //1,2,3,4,5 meses
        // 31, 28, 31, 30 dias
        int[][] dias = new int[3][3];
        dias[0][0] = 31;
        dias[0][1] = 28;
        dias[0][2] = 31;

        dias[1][0] = 31;
        dias[1][1] = 28;
        dias[1][2] = 31;

        for (int i = 1; i < dias.length; i++){
            for (int j = 0; j < dias[0].length; j++){
                System.out.println(dias[i][j]);
            }
        }


        // adicionou [] e no final []. Array multidimensional, dá para ter várrias dimensões
    }

}
