package academy.devdojo.maratona.java.javacore.introducaoclasses.SFormatação;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFOrmatTest01 {
    public static void main(String[] args) {
        NumberFormat [] nfa = new NumberFormat[7];
        Locale localeJapan = Locale.JAPAN;
        Locale localeItalian = Locale.ITALY;


        Locale localePT = new Locale("pt", "BR");
        // padrão de moeda
        nfa[0] = NumberFormat.getCurrencyInstance(localeJapan);
        nfa[1] = NumberFormat.getCurrencyInstance(localeItalian);
        nfa[2] = NumberFormat.getCurrencyInstance(localePT);


        // ponto e virgula
        nfa[3] = NumberFormat.getInstance(localePT);
        nfa[4] = NumberFormat.getCurrencyInstance(localeJapan);
        nfa[5] = NumberFormat.getCurrencyInstance(localeItalian);

        double valor = 10_000.2130;
        for(NumberFormat nf : nfa){
            System.out.println(nf.format(valor));
            System.out.println(nf.getMaximumFractionDigits());
        }
        String valorString = "1000.2130";

        String valorString2 = "￥1000.2130";


        Double.parseDouble(valorString);
        try {
            System.out.println(nfa[0].parse(valorString));
        } catch (ParseException e) {
            e.printStackTrace();
        }

        try {
            System.out.println(nfa[0].parse(valorString2));
        } catch (ParseException e) {
            e.printStackTrace();
        }


    }
}
