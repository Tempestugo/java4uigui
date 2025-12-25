package academy.devdojo.maratona.java.introducao;

public class OlaDevDojo13 {
    static void main(String[]args) {
        double valorCarro = 32000;
        int parcela;

        for (parcela = 1000; parcela <= valorCarro; parcela+=1000) {
            System.out.println(parcela);
            if (valorCarro < 1000){
                continue; //enquanto não for menor que 1000, ele vai continuar
            }
        }
    }

}
