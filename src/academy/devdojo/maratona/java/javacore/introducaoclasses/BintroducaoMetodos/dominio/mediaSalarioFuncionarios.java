package academy.devdojo.maratona.java.javacore.introducaoclasses.BintroducaoMetodos.dominio;

public class mediaSalarioFuncionarios {


    public static void somaVarArgs(double... numeros) {
        double salario = 0;
        for (double num : numeros) {
            salario += num;

        }
        double media = 0;
        media = salario / numeros.length;
        System.out.println("A média é: " + media);

    }
}
