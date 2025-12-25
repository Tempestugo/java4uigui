package academy.devdojo.maratona.java.javacore.introducaoclasses.Wnio.text;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class PathTest02 {
    public static void main(String[] args) throws IOException {
        Path pastaPath = Paths.get("pasta");
        if(Files.notExists(pastaPath)) {
            Path pastaPath1 = Files.createDirectory(pastaPath);
        }
        Path path = Paths.get("pasta/subpasta/subsubpasta");
        Files.createDirectories(path);

        Path filepath = Paths.get(path.toString(),"file.txt");
        if(Files.notExists(pastaPath)) {

            Path filepathCreated = Files.createFile(filepath);
        }
        Path source = filepath;
        Path target = Paths.get(filepath.getParent().toString(),"file_renamed.txt");
        Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);
    }
}
