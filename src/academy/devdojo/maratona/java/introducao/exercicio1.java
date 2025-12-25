package academy.devdojo.maratona.java.introducao;

public class exercicio1 {
    static void main(String[]args) {
        Double produto = 100.0;
        produto = produto * 0.1;
        System.out.println("Seu produto com desconto fica " +produto);

        if (produto > 100){
            System.out.println("O produto precisa ser maior que 100");
        }else {
            System.out.println("O produto precisa ser maior que 10");
        }
    }

}
