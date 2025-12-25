package academy.devdojo.maratona.java.introducao;

public class OlaDevDojo8 {
    static void main(String[]args) {
        double salario = 6000;
        String mensagemDoar = "Eu vou doar 500 pro DevDojo";
        String mensagemNaoDoar = "Ainda não tenho condiões";
        // (condicao) ? verdadeiro : falso;
        //(salario > 5000) ? mensagemDoar : mensagemNaoDoar;
        String resultado = (salario > 5000) ? mensagemDoar : mensagemNaoDoar;
        String resultado2 = (salario > 5000) ?"Eu vou doar 500 pro DevDojo" : "Ainda não tenho condiões";

        System.out.println(resultado);


    }

}
