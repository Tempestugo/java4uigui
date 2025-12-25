package academy.devdojo.maratona.java.javacore.introducaoclasses.Qstring.test;

public class StringTest02 {
    public static void main(String[] args) {
        String nome= "Luffy";
        System.out.println(nome.charAt(0));
        //lens de lista é atributo e em String é metodo
        String numeros = "012345";
        System.out.println(nome.length());
        System.out.println(nome.replace("f","l"));
        System.out.println(nome.toLowerCase());
        System.out.println(nome.toUpperCase());

        System.out.println(numeros.substring(0,2));
        System.out.println(numeros.substring(2)); // desse 2 até o final

        System.out.println(nome.trim()); // remove valores em branco que tem no começo e no fim que você possui na String
    }
}
