package academy.devdojo.maratona.java.introducao;

public class OlaDevDojo11 {
    static void main(String[]args) {
       // while, do while, for
       int count = 0;
       while(count < 10){
           System.out.println(count);
           // ou System.out.println(++count);
           count++;

       }


       do {
           System.out.println("Dentro do While");

       } while (count < 10);

       for (int i = 0; i < 10; i++){
           System.out.println("For "+i);
       }

    }

}
