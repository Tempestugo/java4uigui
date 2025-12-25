package academy.devdojo.maratona.java.javacore.introducaoclasses.Wnio.text;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DirectoryStream {
    public static void main(String[] args) {
        Path path = Paths.get(".");
        try(java.nio.file.DirectoryStream<Path> stream = Files.newDirectoryStream(path)) {
        for(Path file : stream) {
            System.out.println(file.getFileName());
        }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
