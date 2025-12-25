package academy.devdojo.maratona.java.javacore.introducaoclasses.Wnio.text;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;

public class BasicFIleAttributesTest02 {
    public static void main(String[] args) {
        //
        Path path = Paths.get("past2/novo_path.txt");
        try {
            BasicFileAttributes basicFileAttributes = Files.readAttributes(path, BasicFileAttributes.class);
            FileTime creationTime = basicFileAttributes.creationTime();
            FileTime lastModifiedTime = basicFileAttributes.lastModifiedTime();
            FileTime lastAccessTime = basicFileAttributes.lastAccessTime();
            System.out.println(creationTime+"\n "+lastModifiedTime+" \n"+lastAccessTime);
            System.out.println("----------------------");

            BasicFileAttributeView fileAttributeView = Files.getFileAttributeView(path, BasicFileAttributeView.class);
            FileTime newCreationTime = FileTime.fromMillis(System.currentTimeMillis());
            fileAttributeView.setTimes(lastModifiedTime,newCreationTime,creationTime);

             creationTime = fileAttributeView.readAttributes().creationTime();
             lastModifiedTime = fileAttributeView.readAttributes().lastModifiedTime();
             lastAccessTime = fileAttributeView.readAttributes().lastAccessTime();
            System.out.println(creationTime+"\n "+lastModifiedTime+" \n"+lastAccessTime);


        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
