package academy.devdojo.maratona.java.javacore.introducaoclasses.SFormatação;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocalTest01 {
    public static void main(String[] args) {
        Locale locale = new Locale("pt", "BR");
        Locale localecCH = new Locale("it", "CH");
        Locale localIndia = new Locale("hi", "IN");

        Calendar cal = Calendar.getInstance();
        DateFormat df1=  DateFormat.getTimeInstance(DateFormat.FULL, locale);
        DateFormat df2 = DateFormat.getTimeInstance(DateFormat.FULL, localecCH);
        DateFormat df3 = DateFormat.getTimeInstance(DateFormat.FULL, localIndia);
        System.out.println(df1.format(cal.getTime()));
        System.out.println(df2.format(cal.getTime()));
        System.out.println(df3.format(cal.getTime()));

        System.out.println(localecCH.getDisplayCountry());
        System.out.printf(locale.getDisplayLanguage());


        //nesse caso, ele só coloca a lingua como japonesa, mas nao define o local da variavel.

        Locale localeJp = Locale.JAPANESE;
        //aqui vc define o local que é a jpão e tambem a linguagem vem japonesa, portanto acho melhar definir o local logo de uma vez
        //que ja vem ingua e local.
        Locale localeJapan = Locale.JAPAN;

//        localeItaly.getDisplayContry(Locale.JAPAN). ou Locale.JAPANESE
    }
}
