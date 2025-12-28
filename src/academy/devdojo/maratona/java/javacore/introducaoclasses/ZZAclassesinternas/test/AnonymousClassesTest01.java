package academy.devdojo.maratona.java.javacore.introducaoclasses.ZZAclassesinternas.test;


class Animal {
    public void walk(){
        System.out.println("Animal walk");
    }
}
class Cachorro extends Animal{
    @Override
    public void walk(){
        System.out.println("Cachorro walk");
    }

}

public class AnonymousClassesTest01 {
    public static void main(String[] args) {
        Animal animal = new Animal(){
            @Override
            public void walk(){
                System.out.println("Walking in the shadows");

            }



        };

        animal.walk();
    }
}
