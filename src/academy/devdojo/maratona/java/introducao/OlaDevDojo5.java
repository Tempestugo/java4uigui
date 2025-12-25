package academy.devdojo.maratona.java.introducao;

public class OlaDevDojo5 {
    static void main(String[]args) {
    // %
    int resto = 21 % 7;
    System.out.println(resto);

    // < > <= >= == !=        retornam valores boleanos
    boolean isDezDiferenteDez = 10 != 10.0;
    System.out.println(isDezDiferenteDez);


    // && (and) || (ou) !
    int idade = 35;
    float salario = 3500F;
    boolean isDentroDAleiMaiorqQueTrinta = idade > 30 && salario > 4612;
    boolean isDentroDaLeiMenorQueTrinta = idade <  30 && salario > 4612;
        System.out.println(isDentroDAleiMaiorqQueTrinta);
        System.out.println(isDentroDaLeiMenorQueTrinta);


    double valorTotalContaCorrente = 200;
    double valorTotalContaPoupanca = 10000;
    float valorPlaystation = 5000f;
    boolean isPlaystationCincoCompravel = valorTotalContaCorrente > valorPlaystation || valorTotalContaPoupanca > valorPlaystation;
        System.out.println(isPlaystationCincoCompravel);



    // = += -= *= /= %=      Atribuição
    double bonus = 1800;
    bonus += 1000;
    bonus -= 1000;
    bonus *= 2;
    bonus /= 2;
    bonus %= 2;
    System.out.println(bonus);
    int contador = 0;
    contador++;
    contador--;
        System.out.println(contador);
    }

}
