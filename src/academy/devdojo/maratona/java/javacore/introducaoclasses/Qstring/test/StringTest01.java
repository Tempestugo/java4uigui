package academy.devdojo.maratona.java.javacore.introducaoclasses.Qstring.test;

public class StringTest01 {
    public static void main(String[] args) {
        String nome = "William"; // String constant pool
        String nome2 = "William"; // String constant pool
        nome = nome.concat(" Suane");
        System.out.println(nome==nome2);
        //comparando variável de referência e não o valor em si
        String nome3 = new String("William");
        //1 variavel de referência, 2 objeto do tipo string, 3 uma stirng no pool

        System.out.println(nome2==nome3.intern());

    }
}
