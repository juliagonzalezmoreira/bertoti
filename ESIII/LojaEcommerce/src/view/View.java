package view;

import controller.Controller;
import controller.strategy.MetodoEnvio;
import model.observer.Observador;
import view.composite.ItemPedido;
import view.composite.Pacote;
import view.composite.Produto;

public class View implements Observador {
    private Controller controller;
    private ItemPedido itemPedido;

    public View(Controller controller) {
        this.controller = controller;
        this.itemPedido = new Pacote("Pacote Principal");
        this.itemPedido.adicionarItem(new Produto("Produto 1", 99.99));
        this.itemPedido.adicionarItem(new Produto("Produto 2", 49.99));
    }

    public void atualizar(String mensagem) {
        System.out.println("Notificação: " + mensagem);
    }

    public void realizarPedido() {
        controller.realizarPedido();
    }

    public void setMetodoEnvio(MetodoEnvio metodoEnvio) {
        controller.setMetodoEnvio(metodoEnvio);
    }

    public void exibirDetalhesPedido() {
        itemPedido.exibirDetalhes();
    }

    public void adicionarItemPedido(ItemPedido pacote) {
    }

    public void exibirConfiguracoes() {
    }
}
