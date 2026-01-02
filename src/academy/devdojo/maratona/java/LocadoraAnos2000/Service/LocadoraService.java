package academy.devdojo.maratona.java.LocadoraAnos2000.Service;

import academy.devdojo.maratona.java.LocadoraAnos2000.Dominio.Cliente;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LocadoraService {

    // 1. O MAP FICA AQUI (Atributo da Classe)
    // Ele é o seu "banco de dados" de aluguéis.
    // Chave: O Cliente (quem alugou).
    // Valor: A Lista de Itens (o que ele alugou).
    private Map<Cliente, List<ItemAlugavel>> alugueis = new HashMap<>();

    // 2. O MÉTODO ALUGAR
    public void alugar(Cliente cliente, ItemAlugavel item) {
        // Passo A: Verifica se esse cliente já tem uma lista de aluguéis iniciada no Map
        List<ItemAlugavel> itensAlugados = alugueis.get(cliente);

        // Passo B: Se a lista for nula (primeira vez que ele aluga), cria uma nova
        if (itensAlugados == null) {
            itensAlugados = new ArrayList<>();
            // Associa a nova lista ao cliente no Map
            alugueis.put(cliente, itensAlugados);
        }

        // Passo C: Adiciona o novo item na lista (seja ela nova ou recuperada)
        itensAlugados.add(item);

        System.out.println("Item '" + item.getTitulo() + "' alugado para " + cliente.getNome());
    }

    // 3. MÉTODO EXTRA (Para visualizar o Map)
    public void imprimirAlugueis() {
        // Itera sobre o Map para mostrar quem alugou o quê
        for (Map.Entry<Cliente, List<ItemAlugavel>> entry : alugueis.entrySet()) {
            System.out.println("Cliente: " + entry.getKey().getNome());
            System.out.println("Itens: " + entry.getValue()); // A lista imprime com colchetes []
            System.out.println("-----------------");
        }
    }
}