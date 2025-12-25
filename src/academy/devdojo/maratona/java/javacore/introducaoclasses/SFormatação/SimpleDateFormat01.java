package academy.devdojo.maratona.java.javacore.introducaoclasses.SFormatação;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormat01 {
    public static void main(String[] args) {
        String mascara = "'Amsterdam' yyyy.MM.dd G 'at' HH:mm:ss z";
        String mascara2 = "'Amsterdam' dd 'de' MMMM 'de' YYYY";
        SimpleDateFormat sdf = new SimpleDateFormat(mascara2);
        System.out.println((sdf.format(new Date())));
        try {
            sdf.parse("Amsterdam 15 de fevereiro de 2021");
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

    }
}
//Imagine que você está criando um sistema e o usuário digita a data de nascimento dele em um campo de texto: "15/02/1995".
//
//Para o Java, isso é apenas um texto comum (String). Você não consegue:
//
//Somar 10 dias nessa data.
//
//Verificar se essa data é maior ou menor que "hoje".
//
//Salvar corretamente em um banco de dados como um campo de data real.
//
//        O parse() "lê" esse texto e o converte em um objeto Date (ou LocalDate nas APIs novas), permitindo que você faça cálculos e lógica de programação com ele.
