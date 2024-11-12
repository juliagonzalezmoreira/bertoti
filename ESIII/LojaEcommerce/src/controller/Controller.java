package controller;

import controller.strategy.EnvioNormal;
import controller.strategy.MetodoEnvio;
import model.ModelFacade;

public class Controller {
    private MetodoEnvio metodoEnvio;
    private ModelFacade modelFacade;

    public Controller() {
        metodoEnvio = new EnvioNormal();
        modelFacade = ModelFacade.getInstancia();
    }

    public void setMetodoEnvio(MetodoEnvio metodoEnvio) {
        this.metodoEnvio = metodoEnvio;
    }

    public void notificarClientes(String mensagem) {
        modelFacade.notificarClientes(mensagem);
    }

    public void realizarPedido() {
        System.out.println("Realizando pedido...");
        metodoEnvio.enviar();
        System.out.println("Pedido realizado com sucesso!");
    }
}
