package academy.devdojo.maratona.java.javacore.introducaoclasses.Oexecption.todo;


import java.io.File;
import java.io.IOException;

public class CriadorDeArquivoSimples {

    public static void main(String[] args) throws IOException {

        File();
    }


    static void File() throws IOException {
        File file = new File("Arquivo\\teste.txt");
        try {
            boolean foiCriado = file.createNewFile();
            System.out.println("SUCESSO: Arquivo '" + foiCriado + "' foi criado!");
        } catch (IOException e) {
            // NUNCA DEIXEI AQUI EM BRANCO
            e.printStackTrace();
            throw e;
        }
    }


    static void Files() throws IOException {
        File file = new File("Arquivo\\teste.txt");
            boolean foiCriado = file.createNewFile();
            System.out.println("SUCESSO: Arquivo '" + foiCriado + "' foi criado!");

    }
}

