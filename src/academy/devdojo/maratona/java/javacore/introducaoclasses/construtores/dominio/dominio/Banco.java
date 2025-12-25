package academy.devdojo.maratona.java.javacore.introducaoclasses.construtores.dominio.dominio;

public class Banco {
    private int numConta;
    private  String tipo;
    private  String dono;
    private  double saldo;
    private  boolean status;


    public Banco(int numConta,String tipo,String dono,double saldo,boolean status) {
        this.numConta = numConta;
        this.tipo = tipo;
        this. dono = dono;
        this.saldo = saldo;
        this. status = status;
    }

    public void depositar(double valor){
        this.saldo+=valor;
    }
    public void sacar(double valor){
        this.saldo-=valor;
    }
    public void abrirConta(String tipo,String dono,double saldo){
        this.tipo=tipo;
        this.dono=dono;
    }

    public void fecharConta(){
        this.saldo=0;
    }
    public void pagarMensal(){
        if(this.saldo>0){
            this.saldo-=this.saldo;

        }
    }








    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        if (status == true) {
            this.status = status;
        }else{
            this.status = false;
        }
    }





    public double getSaldo() {
        return saldo;
    }


    public void setSaldo(double saldo) {
        if (saldo < 0){
            this.tipo = String.valueOf(false);
            System.out.println("Sua conta foi cancelada por insuficiência de saldo");
        }else{
            this.saldo = saldo;
        }
    }




    public String getDono() {

        return dono;
    }


    public void setDono(String dono) {

        this.dono = dono;
    }





    public String getTipo() {
        return tipo;
    }




    public void setTipo(String tipo) {

        if (tipo.equals("Conta Corrente") || tipo.equals("Conta poupança")) {
            this.tipo = tipo;
        }else{
            System.out.println("Tipo inválido");
        }
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        if  (numConta >= 0) {
            this.numConta = numConta;
        }else{

        }

    }
}

