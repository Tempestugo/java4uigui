package academy.devdojo.maratona.java.javacore.introducaoclasses.TresourcesBundle;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourcesBundlesTest01 {
    public static void main(String[] args) {
        System.out.println(Locale.getDefault());
        ResourceBundle resourceBundle = ResourceBundle.getBundle("messages", new Locale("en","US"));

        System.out.println(resourceBundle.getString("hello"));

        ResourceBundle resourceBundle2 = ResourceBundle.getBundle("messages", new Locale("pt","BR"));
        System.out.println(resourceBundle2.getString("hello"));

        System.out.println(resourceBundle.getString("batata"));
        //messages_fr_CA.properties
         //messages_fr.properties
        //messages_pt_BR.properties
        //messages_pt.properties
        //messages.properties
    }
}
