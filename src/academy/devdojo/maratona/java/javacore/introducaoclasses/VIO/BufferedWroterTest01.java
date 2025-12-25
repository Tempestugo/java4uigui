package academy.devdojo.maratona.java.javacore.introducaoclasses.VIO;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWroterTest01 {
    public static void main(String[] args) {
            File file =new File("file.txt");
            try(FileWriter fw = new FileWriter(file, true); BufferedWriter bw = new BufferedWriter(fw)) {

                bw.write("Hello World");
                bw.newLine();
                bw.flush();

//                fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


