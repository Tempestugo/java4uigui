package academy.devdojo.maratona.java.javacore.introducaoclasses.Ameusexercicios.APrimeiro.treze;

import java.sql.SQLOutput;

public class RelatorioCSV implements Relatorio {

@Override
    public TipoRelatorio retornarTipoRelatorio() {
    return TipoRelatorio.CSV;
    }

    @Override
    public void gerarRelatorio() {
        System.out.println("Relatório CSV gerarrelatorio");
    }
}
