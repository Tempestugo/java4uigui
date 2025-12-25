package academy.devdojo.maratona.java.javacore.introducaoclasses.VIO;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");

        try {
          boolean iscreated =  file.createNewFile();
          System.out.println(iscreated);
            System.out.println("path "+file.getAbsolutePath());
            System.out.println("path "+file.getPath());
            System.out.println("is directory "+file.isDirectory());
            System.out.println("isFile "+file.isFile());
            System.out.println("is hidden "+file.isHidden());
            System.out.println("last modified "+new Date(file.lastModified()));


          boolean exists = file.exists();
          if(exists==true){

              boolean isDeleted = file.delete();
              System.out.println("Arquivo deletado com sucesso");
          }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("File existe? "+ file.exists());
    }
}
