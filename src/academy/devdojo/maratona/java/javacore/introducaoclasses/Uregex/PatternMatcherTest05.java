package academy.devdojo.maratona.java.javacore.introducaoclasses.Uregex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest05 {
    public static void main(String[] args) {
        //   \d  = Todos os dígitos
        // \D = Tudo que não for dígito
        // \s = Espaços em branco \t \n \f \r
        // \S = Todo os caracteres excluindo os brancos
        // \w = a-ZA-Z, dígitos, _
        // \W = Tudo que não for incluso no \w
        // [] - procure por algum desses que contém aí dentro [abc], que contenha a ou b ou c
        // ? Zero ou uma ocorrência
        // * Zero ou mais
        // + uma ou mais
        //{n,m} de n até m
        //()
        // | o(v|c)o    ovo | oco
        // $
        // . 1.3 = 123, 133, 1@3, 1A3
        // ^\w+ vai ficar pegando tudo até acabar parando quando aparecer um espaço (no caso do \w)

        String texto = "luffy@hotmail.com, 123jotaro@gmail.com, #@!zoro@mail.br, teste@gmail.com, sakura@mail";
        String regex = "(\\w\\w\\w\\w\\w|\\w\\w\\w\\w|\\w\\w\\w\\w\\w\\w)(@hotmail|@gmail).com";
        String regex2 = "([a-zA-Z0-9\\._-])+@([a-zA-Z])+\\.([a-zA-Z])+)+";


        System.out.println("#@!zoro@mail.br".matches(regex));

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        while (matcher.find()) {
            System.out.println(matcher.start()+" "+matcher.group());
        }

    }
}
