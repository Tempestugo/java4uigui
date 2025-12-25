package academy.devdojo.maratona.java.javacore.introducaoclasses.Qstring.test;

public class StringBuilderTest01 {
    static void main(String[] args) {
        String nome = "William";
        nome.concat("DevDojo");
        nome.substring(0,3);
        System.out.println(nome);
        StringBuilder sb  = new StringBuilder(16);
        sb.append(nome);
        sb.append(" Dev Dojo").append(" Academy");
        sb.substring(0,3);
        sb.reverse();
        sb.reverse();
        System.out.println(sb.toString());
        // tem o método toString dentro do StringBuilder
    }

}
