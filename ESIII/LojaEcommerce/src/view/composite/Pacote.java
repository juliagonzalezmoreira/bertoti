package view.composite;

import view.composite.ItemPedido;

import java.util.ArrayList;
import java.util.List;

public class Pacote extends ItemPedido {
    private List<ItemPedido> itens = new ArrayList<>();

    public Pacote(String nome) {
        super(nome);
    }

    public void adicionarItem(ItemPedido item) {
        itens.add(item);
    }

    public void removerItem(ItemPedido item) {
        itens.remove(item);
    }

    public void exibirDetalhes() {
        System.out.println("Pacote: " + nome);
        for (ItemPedido item : itens) {
            item.exibirDetalhes();
        }
    }
}
