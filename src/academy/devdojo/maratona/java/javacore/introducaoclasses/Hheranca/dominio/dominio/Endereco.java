package academy.devdojo.maratona.java.javacore.introducaoclasses.Hheranca.dominio.dominio;

public class Endereco {
    private String cep;
    private String rua;


    public void imprime(){
        Pessoa pessoa = new Pessoa();
        pessoa.nome="sasa";
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }
}

