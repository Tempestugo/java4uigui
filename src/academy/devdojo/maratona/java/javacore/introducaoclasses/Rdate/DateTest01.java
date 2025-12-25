package academy.devdojo.maratona.java.javacore.introducaoclasses.Rdate;

import java.util.Date;

public class DateTest01 {
    public static void main(String[] args) {
        Date data = new Date(10000000000000L);// long 100000
        System.out.println(data);
        //.toString() já embutido
        data.setTime(data.getTime() +3_600_000);
        //trabalha com long em ms
        System.out.println(data.getTime());
    }
}
