package academy.devdojo.maratona.java.javacore.introducaoclasses.SFormatação;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DateFormatTest01 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        DateFormat[] dateFormat = new SimpleDateFormat[7];
        dateFormat[0] = DateFormat.getInstance();
        dateFormat[1] = DateFormat.getDateInstance();
        dateFormat[2] = DateFormat.getDateInstance(DateFormat.LONG);
        dateFormat[3] = DateFormat.getDateInstance(DateFormat.SHORT);
        dateFormat[4] = DateFormat.getDateInstance(DateFormat.MEDIUM);
        dateFormat[5] = DateFormat.getDateInstance(DateFormat.FULL);
        for (DateFormat dateFormat1 : dateFormat) {
            System.out.println(dateFormat1.format(calendar.getTime()));
        }
    }
}
//Método,O que faz
//Calendar.getInstance(),Captura a data e hora atual do sistema.
//DateFormat.getTimeInstance(),Cria um formatador de tempo baseado em um estilo e região.
//df.format(),Converte o tempo (Date) em uma String formatada.
//getDisplayCountry(),"Retorna o nome do país (ex: ""Itália"" ou ""Suíça"")."
//getDisplayLanguage(),"Retorna o nome do idioma (ex: ""português"" ou ""hindi"")."