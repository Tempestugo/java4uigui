package academy.devdojo.maratona.java.javacore.introducaoclasses.ZZAclassesinternas.test;

public class OuterClassesTest02 {

    private String nome = "Midoriya";

    void print(String param){
        final String lastName = "Izuku";
        class LocalClass {
            public void printLocal(){
                System.out.println(nome + " " + lastName);
            }
        }
        LocalClass local = new LocalClass();
        local.printLocal();
    }

    static void main(String[] args) {
        OuterClassesTest02 outer  = new OuterClassesTest02();
        outer.print("");


    }
}
