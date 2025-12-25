package academy.devdojo.maratona.java.javacore.introducaoclasses.Wnio.text;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.PosixFileAttributes;

public class PosixFileAttributesTest01 {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("pasta/novo_path.txt");
        PosixFileAttributes  attributes = Files.readAttributes(path, PosixFileAttributes.class);
        System.out.println(attributes);
    }
}
