package academy.devdojo.maratona.java.introducao;

public class OlaDevDojo6 {
    static void main(String[] args) {
    int idade = 15;
    boolean isAutorizadoComprarBebida = idade >= 18;
        if (idade > 20) {
            System.out.println("Pode bebida");
        }
        if (idade >= 18) {
            System.out.println("Pode bebida");
        }
        if (idade < 18) {
            System.out.println("Pode não ");
        }
        if (!isAutorizadoComprarBebida) {
            System.out.println("Pode não, sem bebida");

        if (idade < 18) {
            System.out.println("Pode não ");
        }else {
            System.out.println("Pode bebida");
        }

        if(idade < 17){
            System.out.println("Categoria Infantil");
        }else if (idade >= 15 && idade < 18){
            System.out.println("Categoria Juvenil");
        }else {
            System.out.println("Categoria Adulto");
        }
        String categoria = "";
        System.out.println(categoria); //se atentar quanto a atribuição, pois se  vc não define antes,ou melhor, se é definido em um else e if, ficar esperto
        }

    }

}
