package academy.devdojo.maratona.java.introducao;

public class OlaDevDojo17 {
    static void main(String[]args) {
        int[] numeros = new int[3];
        int[] numeros2 =  {1,2,3,4,5};
        int[] numeros3 = new int[]{1,2,3,4,5};
        for (int i = 0; i < numeros2.length; i++){
            System.out.println(numeros2[i]);

        }
        for(int num : numeros3){ //não tem como acessar índices
            System.out.println(num);
        }
        //basicamente isso, vai pegando um índice de cada vez
        int num = numeros3[0];
        System.out.println(num);

    }

}
