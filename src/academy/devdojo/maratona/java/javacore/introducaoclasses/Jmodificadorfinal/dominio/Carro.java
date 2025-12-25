package academy.devdojo.maratona.java.javacore.introducaoclasses.Jmodificadorfinal.dominio;

public  class Carro  {
    private String nome;
    public  final double VELOCIDADE_LIMITE =250;
    public final Comprador COMPRADOR = new Comprador();


    public final void imprime(){
        System.out.println("Nome: "+this.nome);
    }


    public Comprador getCOMPRADOR() {
        return COMPRADOR;
    }
    // constantes no java tudo CAPSLOCK, separado por underscore
    // modificador de acesso variável e classes (final)



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
