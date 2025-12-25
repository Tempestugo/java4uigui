package academy.devdojo.maratona.java.javacore.introducaoclasses.Wnio.text;

import java.nio.file.Path;
import java.nio.file.Paths;

public class NormalizeTest01 {
    public static void main(String[] args) {
        String diretorioProjeto = "home/william/dev";
        String arquivotxt  = "../../arquivo.txt";
        Path path1 = Paths.get(diretorioProjeto, arquivotxt);
        Path path2 = Paths.get("/home/./william/./dev");
        System.out.println("Diretorio projeto: "+path2.normalize());

        System.out.println("Diretorio projeto: "+path1);
        System.out.println("Diretorio projeto: "+path1.normalize());

    }
}

//Sim: é principalmente questão de entendimento
//Tecnicamente:
//home/arquivo.txt
//home/william/dev/../../arquivo.txt
