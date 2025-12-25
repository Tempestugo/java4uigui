package academy.devdojo.maratona.java.javacore.introducaoclasses.SFormatação;

import java.util.Locale;

public class LocaleTest02 {
    public static void main(String[] args) {
        System.out.println(Locale.getDefault());
       String[] isoCountries = Locale.getISOCountries();
       String[] isoLangagues = Locale.getISOLanguages();

       for (String iso : isoCountries) {
           System.out.print(iso+" ");

       }
       for(String iso : isoLangagues) {
           System.out.print(iso+" ");
       }
    }
}
