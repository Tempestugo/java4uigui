package academy.devdojo.maratona.java.javacore.introducaoclasses.Ameusexercicios.APrimeiro.Quinto;

public class Monstro {
    private static int totalMonstros = 0;
    private int[] todosOsAtaques;

    {
        totalMonstros++;
        System.out.println("Criando um novo monstro " + totalMonstros);
    }

    static {
        System.out.println("Carregando texturas dos monstros...");
    }

    public void setTodosOsAtaques(int... ataques) {
        this.todosOsAtaques = ataques;
    }

    public void mostrarAtaques() {
        if (todosOsAtaques == null || todosOsAtaques.length == 0) {
            System.out.println("Nenhum ataque cadastrado.");
            return;
        }

        for (int i = 0; i < todosOsAtaques.length; i++) {
            System.out.println("Ataque " + (i + 1) + ": " + todosOsAtaques[i]);
        }
    }
}
