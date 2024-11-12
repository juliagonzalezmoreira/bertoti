package controller.strategy;

import controller.strategy.MetodoEnvio;

public class EnvioNormal implements MetodoEnvio {
    public void enviar() {
        System.out.println("Pedido enviado via envio normal");
    }
}
