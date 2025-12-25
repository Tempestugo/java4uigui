package academy.devdojo.maratona.java.introducao;

public class OlaDevDojo19 {
    static void main(String[]args) {
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
        // foreach cria uma lista pensando já no tamanho da lista int [] arrBase
        for(int[] arrBase: dias){
            for(int num: arrBase){
                System.out.println(num);
            }
        }
    }

}
