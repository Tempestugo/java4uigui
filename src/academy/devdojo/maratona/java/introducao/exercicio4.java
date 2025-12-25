package academy.devdojo.maratona.java.introducao;

public class exercicio4 {
    public static void main(String[] args) {

        int[] lista = new int[5];
        lista[0] = 1;
        lista[1] = 2;
        lista[2] = 30;
        lista[3] = 40;
        lista[4] = 150;

        int soma = 0;
        int MaiorNum = 0;
        int MenorNum = 0;

        for (int i = 0; i < lista.length; i++) {
            if (lista[i] > MaiorNum) {
                MaiorNum = lista[i];
            }else if (lista[i] < MenorNum){
                MenorNum = lista[i];
            }


            soma += lista[i]; // soma acumulada
        }

        System.out.println("Soma total: " + soma);
        System.out.println("A média é: " + soma/lista.length);
        System.out.println("O maior número é: " + MaiorNum);
        System.out.println("E o menor número é " + MenorNum);

    }
}
