package academy.devdojo.maratona.java.introducao;

public class exercicio2 {
    static void main(String[]args) {
        int quantosDias = 2;
        String DiaDaSemana = "";
        switch (quantosDias) {
            case 1:
                DiaDaSemana = "Segunda";
                System.out.println(DiaDaSemana);
                break;
            case 2:
                DiaDaSemana = "Não é segunda";
                System.out.println(DiaDaSemana);
                break;

        }
        int opcoesMenu = 3;

        switch (opcoesMenu) {
            case 1:
                System.out.println("Escolheu Depositar");
            case 2:
                System.out.println("Escolheu sacar");
            case 3:
                System.out.println("Escolheu Ver saldo");
            case 4:
                System.out.println("Escolheu Sair");
                break;
        }


    }

}
