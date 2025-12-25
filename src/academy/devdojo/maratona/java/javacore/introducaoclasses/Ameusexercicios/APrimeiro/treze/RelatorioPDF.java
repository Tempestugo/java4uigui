package academy.devdojo.maratona.java.javacore.introducaoclasses.Ameusexercicios.APrimeiro.treze;

public class RelatorioPDF implements Relatorio {

@Override
    public TipoRelatorio retornarTipoRelatorio() {
    return TipoRelatorio.PDF;
    }

    @Override
    public void gerarRelatorio() {
        System.out.println("Relatório PDF gerarrelatorio");

    }
}
