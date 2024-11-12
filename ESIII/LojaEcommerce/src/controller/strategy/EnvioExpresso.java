package controller.strategy;

import controller.strategy.MetodoEnvio;

public class EnvioExpresso implements MetodoEnvio {
    public void enviar() {
        System.out.println("Pedido enviado via envio expresso");
    }
}
