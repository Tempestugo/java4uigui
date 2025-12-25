package academy.devdojo.maratona.java.javacore.introducaoclasses.Minterfaces.dominio;

public class FIleLoader implements DataLoader, DataRemover {
    @Override
    public void load() {
        System.out.println("Carregando dados de um arquivo");
    }

    @Override
    public void remove() {
        System.out.println("Removemndo de um arquivo");
    }
    @Override
    public void checkPermission() {
        System.out.println("Checando permissões arquivo");
    }
}
