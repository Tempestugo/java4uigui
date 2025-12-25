package academy.devdojo.maratona.java.javacore.introducaoclasses.Ameusexercicios.APrimeiro.treze;

public class Test01 {
    public static void main(String[] args) {
        GeradorRelatorios gerador = new GeradorRelatorios(new RelatorioPDF());
        Relatorio r1 = new RelatorioPDF();
        Relatorio r2 = new RelatorioCSV();

        new GeradorRelatorios(r1).gerarRelatorio();
        new GeradorRelatorios(r2).gerarRelatorio();



    }
}
