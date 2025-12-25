package academy.devdojo.maratona.java.javacore.introducaoclasses.Uregex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest01 {
    public static void main(String[] args) {
        //   \d  = Todos os dígitos
        // \D = Tudo que não for dígito
        // \s = Espaços em branco \t \n \f \r
        // \S = Todo os caracteres excluindo os brancos
        // \w = a-ZA-Z, dígitos, _
        // \W = Tudo que não for incluso no \w
        // [] - procure por algum desses que contém aí dentro [abc], que contenha a ou b ou c
        //
        String regex2 = "\\D";
        String regex3 = "[a-zA-C]";
        String regex4 = "0[xX][0-9a-fA-F][0-9a-fA-F]";
        String texto4 = "12 0x 0X 0xFFABC 0x109 0x1";




        String regex = "\\S";
        String texto = "abaaba";
        String texto2 = "zxldkhfkjq1h23j12e12";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);

        Pattern pattern2 = Pattern.compile(regex2);
        Matcher matcher2 = pattern.matcher(texto2);
        while (matcher.find()) {
            System.out.println(matcher.start()+" "+matcher.group());
        }
        while (matcher2.find()) {
            System.out.println(matcher2.start()+" "+matcher2.group());
        }

        int numeroHex = 0x59F861;
        System.out.println(numeroHex);
        int numeroHex2 = 0XFFFFF;
    }
}
