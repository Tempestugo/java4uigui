package academy.devdojo.maratona.java.javacore.introducaoclasses.ZZG.dominio;

public class Pessoa {
    private String firstName;
    private String lastName;
    private String username;
    private String email;

    public Pessoa(String email, String username, String lastName, String firstName) {
        this.email = email;
        this.username = username;
        this.lastName = lastName;
        this.firstName = firstName;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public static class PessoaBuilder{
        private String firstName;
        private String lastName;
        private String username;
        private String email;


        public PessoaBuilder username(String username){
            this.firstName = username;
            return this;
        }
        public PessoaBuilder lastName(String lastName){
            this.firstName = lastName;
            return this;
        }
        public PessoaBuilder email(String email){
            this.firstName = email;
            return this;
        }
        public PessoaBuilder firstName(String firstName){
            this.firstName = firstName;
            return this;
        }


    }


}
