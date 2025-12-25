package academy.devdojo.maratona.java.javacore.introducaoclasses.Ameusexercicios.APrimeiro.treze;

public class GeradorRelatorios {
    private Relatorio relatorio;

    public GeradorRelatorios(Relatorio relatorio) {
        this.relatorio = relatorio;
    }

    public void retornarRelatorio() {
        relatorio.retornarTipoRelatorio();
        System.out.println("TA ai seu Tipo");
    }
    public void gerarRelatorio() {
        relatorio.gerarRelatorio();
        System.out.println("TA ai seu relatorio");
    }
}
