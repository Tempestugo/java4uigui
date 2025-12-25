package academy.devdojo.maratona.java.javacore.introducaoclasses.BintroducaoMetodos.dominio;

public class Calculadora {

    public void somaDoisNumeros() {
        System.out.println(10 + 10);

    }

    public void subtrairDoisNumeros() {
        System.out.println(21 - 2);

    }

    public void multiplaDoisNumeros(int num1, int num2) {
        System.out.println(num1 * num2);

    }

    public double divideDoisNumeros(double num1, double num2) {
        if (num2 == 0 || num1 == 0) {
            return 0;
        }
        return num1 / num2;
        //public int
        // return (int) (num1/num2);   Casting

    }

    public double divideDoisNumeros2(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        }
        return 0;
        //public int
        // return (int) (num1/num2);   Casting
    }

    public void imprimeDivisaoDoisNumeros(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Não existe divisão por 0");
            return; // Exit the method immediately.
        } else {
            System.out.println(num1 / num2);
        }
    }

    public void alteraDoisNUmeros(int num1, int num2) {
        num1 = 99;
        num2 = 33;
        System.out.println("Dentro do alteraDoisnumeros");
        System.out.println("num1: " + num1);
        System.out.println("num2: " + num2);
    }

    public void somaArray(int[] numeros) {
        int soma = 0;
        for (int num : numeros) {
            soma += num;

        }
        System.out.println("Soma: " + soma);
    }

    // public void somaVarArgs(String... numeros) {
    //String também funciona

    public void somaVarArgs(double valor,int... numeros) {
        // VarArgs sempre no final para ele saber quando parar.
        //double valor diz que no primeiro antes da virgula é double
        int soma = 0;
        for (int num : numeros) {
            soma += num;

        }
    System.out.println("Soma: " + soma);}

}

