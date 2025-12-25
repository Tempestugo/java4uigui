package academy.devdojo.maratona.java.javacore.introducaoclasses.Wnio.text;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest01 {
    public static void main(String[] args) {
        Path p1 = Paths.get("C:\\Users\\coffe\\IdeaProjects\\java4uigui\\file.txt");
        Path p2 = Paths.get("C:\\Users\\coffe\\IdeaProjects\\java4uigui","file.txt");
        Path p3 = Paths.get("C:\\coffe\\IdeaProjects\\java4uigui\"","file.txt");
        Path p4 = Paths.get("coffe","IdeaProjects","java4uigui","file.txt");
        System.out.println(p1.getFileName());
    }
}
