package academy.devdojo.maratona.java.javacore.introducaoclasses.Ameusexercicios.APrimeiro.Acollections.test;

import academy.devdojo.maratona.java.javacore.introducaoclasses.Ameusexercicios.APrimeiro.Acollections.dominio.Consumidor;
import academy.devdojo.maratona.java.javacore.introducaoclasses.Ameusexercicios.APrimeiro.Acollections.dominio.Smartphone;

import java.util.*;

public class PriorityQueueTest01 {
   public static void main(String[] args) {
       Queue<Smartphone> queue = new PriorityQueue<>(new SmartphonePrecoComparator());
       Consumidor c1 = new Consumidor("Lala",21L);
       Smartphone s1 = new Smartphone("1234","Xiaomi", 100);
       Smartphone s2 = new Smartphone("1231234","Batata", 200);
       Smartphone s3 = new Smartphone("1231234","Bobobo", 8000);
       Smartphone s4 = new Smartphone("1231234","Avião", 2200);

        queue.offer(s1);
        queue.offer(s2);
        queue.offer(s3);
        queue.offer(s4);

        for(Smartphone s: queue){
            System.out.println(s.getMarca()+" "+s.getPreco());
        }

       // Forma CORRETA de consumir uma PriorityQueue:
       while(!queue.isEmpty()){
           // O poll() pega o primeiro e REMOVE, forçando a fila a reorganizar o próximo
           Smartphone s = queue.poll();
           System.out.println(s.getMarca() + " " + s.getPreco());
       }



//• Cenário de Uso: Imagine um servidor recebendo milhares de requisições. Algumas são de usuários "Premium", outras de usuários "Grátis".
//• Você joga tudo na PriorityQueue.
//• O servidor pede: "Me dê a próxima coisa mais importante para fazer" (poll()).
//• A fila entrega instantaneamente a requisição Premium, não importa quando ela chegou.
   }
}
