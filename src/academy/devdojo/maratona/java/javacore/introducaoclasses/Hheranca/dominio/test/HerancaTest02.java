package academy.devdojo.maratona.java.javacore.introducaoclasses.Hheranca.dominio.test;

import academy.devdojo.maratona.java.javacore.introducaoclasses.Hheranca.dominio.dominio.Funcionario;

public class HerancaTest02 {
    public static void main(String[] args) {
        // 1 - Bloco de inicialização estático da super classe é executando quando a JVM carrega classe pai
        // 1.1 - Bloco de inicialziação estático da sub classe é executado quando a JVM carregar classe filha
       // 1.2  Alocado espçao em memória pro objeto da superclasse pai
        //2. Cada atributo de classe é criado e inicializado com valores default ou o que  for passada pela classe pai
        // 2. BLoco de inicialização da superclasse é exectuado na ordem que aparece
        // 4. Construtor é executado da superclasse é executado
        // 5  Alocado espçao em memória pro objeto da subclasse filha
        //6. Cada atributo de classe é criado e inicializado com valores default ou o que  for passada pela classe pai
        // 7 BLoco de inicialização da subclasse é exectuado na ordem que aparece
        // 8. Construtor é executado da subclasse é executado
        Funcionario funcionario = new Funcionario("Jira","232323");

    }
}
