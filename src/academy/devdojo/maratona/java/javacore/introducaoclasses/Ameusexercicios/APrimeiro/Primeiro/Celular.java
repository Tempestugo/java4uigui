package academy.devdojo.maratona.java.javacore.introducaoclasses.Ameusexercicios.APrimeiro.Primeiro;

public class Celular {
    String nome;
    String sistemaOperacional;
    String armazenamento;
    private int[] Lista;
    String idioma;
    int nivelDeBrilho;


    public Celular(String nome, String sistemaOperacional, String armazenamento) {
        this.nome = nome;
        this.sistemaOperacional = sistemaOperacional;
        this.armazenamento = armazenamento;
    }

    public void ligar(){
        System.out.println("Ligando");
        System.out.println("Nome do Celular: " + this.nome);
        System.out.println("Sistema Operacional: " + this.sistemaOperacional);
        System.out.println("Armazenamento: " + this.armazenamento);
    }

    public void instalarAplicativos(int... codigosAplicativos){
        System.out.println("Iniciando instalação de aplicativos:");

        if (codigosAplicativos.length == 0) {
            System.out.println("Nenhum aplicativo para instalar.");
            return;
        }

        for (int codigo : codigosAplicativos) {
            // 'codigo' já é o valor do item na lista.
            System.out.println("Instalando Aplicativo com código: " + codigo);
        }

    }


    public void configurar(String idioma){
        idioma = this.idioma;
        System.out.println("Configurando idioma: " + this.idioma +" dentro do primeiro");
    }
    public void configurar(String idioma, int nivelDeBrilho){
        idioma = this.idioma;
        nivelDeBrilho = this.nivelDeBrilho;
        System.out.println("Nivel de Brilho: " + this.nivelDeBrilho + " dentro do segundo ");
    }



    public int[] getLista() {
        return Lista;
    }

    public void setLista(int[] lista) {
        Lista = lista;
    }
}
