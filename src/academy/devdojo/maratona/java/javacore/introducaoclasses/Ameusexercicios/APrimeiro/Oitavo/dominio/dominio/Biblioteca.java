package academy.devdojo.maratona.java.javacore.introducaoclasses.Ameusexercicios.APrimeiro.Oitavo.dominio.dominio;

public class Biblioteca {
    private Livro[] livros;

    public void listarLivros(){
        System.out.println("Listando Livros");
        for (Livro livro : livros) {
            System.out.println(livro.getTitulo());
        }
    }


    public void aplicarDescontoEmTodos(double percentual){
        for (Livro livro : livros) {
            livro.setPreco(livro.getPreco()-livro.getPreco()*percentual);
            System.out.println(livro.getPreco());
        }
    }

    public void buscarPorCategoria(String categoria){
        for (Livro livro : livros) {
            if (livro.getCategoria().equals(categoria)) {
                System.out.println(livro.getCategoria()+" e seu nome é: "+livro.getTitulo());
            }
        }
    }



    public Biblioteca(Livro[] livros) {
        this.livros = livros;
    }

    public Livro[] getLivros() {
        return livros;
    }

    public void setLivros(Livro[] livros) {
        this.livros = livros;
    }
}
