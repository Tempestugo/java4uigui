package academy.devdojo.maratona.java.javacore.introducaoclasses.Minterfaces.test;

import academy.devdojo.maratona.java.javacore.introducaoclasses.Minterfaces.dominio.DataLoader;
import academy.devdojo.maratona.java.javacore.introducaoclasses.Minterfaces.dominio.DatabaseLoader;
import academy.devdojo.maratona.java.javacore.introducaoclasses.Minterfaces.dominio.FIleLoader;

public class DataLoaderTest01 {
    public static void main(String[] args) {
        DatabaseLoader databaseLoader = new DatabaseLoader();
        FIleLoader fileLoader = new FIleLoader();
        databaseLoader.load();
        fileLoader.load();

        databaseLoader.remove();
        fileLoader.remove();

        databaseLoader.checkPermission();
        fileLoader.checkPermission();

        DataLoader.retrieveMaxDataSize();
        DatabaseLoader.retrieveMaxDataSize();
    }
}
