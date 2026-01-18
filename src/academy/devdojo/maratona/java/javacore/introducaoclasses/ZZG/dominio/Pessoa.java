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


    public static final class PessoaBuilder {
        private String firstName;
        private String lastName;
        private String username;
        private String email;

        public PessoaBuilder() {
        }

        public static PessoaBuilder aPessoa() {
            return new PessoaBuilder();
        }

        public PessoaBuilder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public PessoaBuilder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public PessoaBuilder username(String username) {
            this.username = username;
            return this;
        }

        public PessoaBuilder email(String email) {
            this.email = email;
            return this;
        }

        public Pessoa build() {
            return new Pessoa(email, username, lastName, firstName);
        }


    }
}
