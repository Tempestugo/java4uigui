package academy.devdojo.maratona.java.javacore.introducaoclasses.Ycolecoes.test;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest01 {
    public static void main(String[] args) {
        Queue<String > fila = new PriorityQueue<>();
        fila.add("D");
        fila.add("A");
        fila.add("D");
        fila.add("O");

        for (String s : fila) {
            System.out.println(s);
        }
        while(!fila.isEmpty()){
            System.out.println(fila.peek());
            fila.poll();
        }
        System.out.println(fila);
    }
}
