package academy.devdojo.maratona.java.javacore.introducaoclasses.Gassociado.test;

import java.util.Scanner;

public class LeituraDoTelaclado02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("O grande software de previsão do futuro");
        System.out.println("digite sua pergunta e eu respondere sim ou não");
        String pergunta = input.nextLine();
        if (pergunta.charAt(0) == ' ') {
            System.out.println("SIM");

        } else {
            System.out.println("NÃO");
        }
    }
}