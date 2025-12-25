package academy.devdojo.maratona.java.javacore.introducaoclasses.Uregex;

import java.util.Scanner;

public class ScannerTest02 {
    public static void main(String[] args) {
        String texto = "Levi,Eren,Mikasa,200,True,100,100,false,true,False";
        Scanner scan = new Scanner(texto);
        scan.useDelimiter(",");
        while(scan.hasNext()){
            if(scan.hasNextInt()){
                int i = scan.nextInt();
                System.out.println("Int "+ i);
            }else if(scan.hasNextBoolean()){
                boolean bool = scan.nextBoolean();
                System.out.println("boolean "+ bool);
            }else System.out.println(scan.next());
        }
    }
}
