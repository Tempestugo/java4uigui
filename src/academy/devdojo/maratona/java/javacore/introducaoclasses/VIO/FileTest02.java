package academy.devdojo.maratona.java.javacore.introducaoclasses.VIO;

import java.io.File;
import java.io.IOException;

public class FileTest02 {
    public static void main(String[] args) {
        File fileDiretorio = new File("pasta");
        boolean isDiretorioCriado = fileDiretorio.mkdir();
        System.out.println(isDiretorioCriado);
        File fileArquivoDiretorio = new File("pasta/arquivo.txt");
        try {
            boolean isFileCreated = fileArquivoDiretorio.createNewFile();
            System.out.println(isFileCreated);
            File fileRenamed = new File("pasta/arquivo_renomeado.txt");
            boolean isfileRenamed = fileArquivoDiretorio.renameTo(fileRenamed);
            System.out.println(fileRenamed);

            File diretorioRenamed = new File("past2");
            boolean isDiretoriorenomeado = fileDiretorio.renameTo(diretorioRenamed);
            System.out.println(isDiretoriorenomeado);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

}
