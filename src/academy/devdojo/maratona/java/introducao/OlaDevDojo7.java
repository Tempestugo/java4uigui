package academy.devdojo.maratona.java.introducao;

public class OlaDevDojo7 {
    static void main(String[]args) {
        int idade = 20;

        if (idade < 15){
            System.out.println("Categorriaa Iinfanttil");

        }else if(idade >= 15 && idade < 18){
            System.out.println("Categoria Juvenil");
        }else if(idade >= 18){
            System.out.println("Categoria Adulto");
        }


        String categoria = "";
        if (idade < 15){
            categoria = "Categorria Iinfanttil";

        }else if(idade >= 15 && idade < 18){
            categoria = "Categoria Juvenil";
        }else if(idade >= 18){
            categoria = "Categoria Adulto";
        }
        System.out.println(categoria);

        System.out.println("Hello World");
    }

}
