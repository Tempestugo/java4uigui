package academy.devdojo.maratona.java.javacore.introducaoclasses.Ameusexercicios.APrimeiro.Primeiro;

public class CelularTest01 {
    public static void main(String[] args) {
        Celular celular = new Celular("IOS","Linux","64GB");
        celular.ligar();
        System.out.println("-----------------");
        celular.instalarAplicativos(101, 102, 550, 999);

        celular.configurar("Francês");
        celular.configurar("Espanhol",200);

    }
}
