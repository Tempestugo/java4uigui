package academy.devdojo.maratona.java.javacore.introducaoclasses.ZZAclassesinternas.test;

public class OuterClassesTest03 {
    private String name = "William";
    static class Nested{
        private String name3 = "William2";
        void print(){
            System.out.println(new OuterClassesTest03().name+" "+name3);
        }

    }
    public static void main(String[] args) {
        Nested nested = new Nested();
        nested.print();
    }
}
