package academy.devdojo.maratona.java.javacore.introducaoclasses.Gassociado.test;

import java.util.Scanner;

public class LeituraDoTeclado01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite seu nome abaixo");
        String next = input.nextLine();
        System.out.println("Digite sua idade abaixo");
        int idade = input.nextInt();
        System.out.println("Digite seu sexo");
        char sexo = input.next().charAt(0);
        System.out.println("Nome "+next);
        System.out.println("Idade "+idade+" anos");
        System.out.println("Sexo "+sexo);
    }
}
