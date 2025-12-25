package academy.devdojo.maratona.java.javacore.introducaoclasses.VIO;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriter01 {
    //FileReader
    //BufferedWriter
    //BufferedReader
    public static void main(String[] args)  {
        File file =new File("file.txt");
        try(FileWriter fw = new FileWriter(file, true)) {
            fw.write("Hello World");

            fw.flush();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
