package academy.devdojo.maratona.java.javacore.introducaoclasses.Ameusexercicios.APrimeiro.Quinto;

public class MonstroTest01 {
    public static void main(String[] args) {
        Monstro monstro = new Monstro();
        Monstro monstro2 = new Monstro();

        monstro.setTodosOsAtaques(3,4213,5423,14);
        monstro.mostrarAtaques();
        System.out.println("------------------------------");

        int ataques[] = new int[]{1,23,4};
        System.out.println("------------------------------");
        monstro.setTodosOsAtaques(ataques);
        monstro.mostrarAtaques();
        System.out.println("------------------------------");

        monstro.setTodosOsAtaques(new int[]{1,2,3,4,5,6,7,8,9,10});
        monstro.mostrarAtaques();







    }

}
