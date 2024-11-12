package model;

import model.observer.NotificadorPedidos;
import model.observer.Observador;
import model.singleton.Configuracoes;

public class ModelFacade {
    private static ModelFacade instancia;
    private Configuracoes configuracoes;
    private NotificadorPedidos notificadorPedidos;

    private ModelFacade() {
        configuracoes = Configuracoes.getInstancia();
        notificadorPedidos = new NotificadorPedidos();
    }

    public static ModelFacade getInstancia() {
        if (instancia == null) {
            synchronized (ModelFacade.class) {
                if (instancia == null) {
                    instancia = new ModelFacade();
                }
            }
        }
        return instancia;
    }

    public void adicionarObservador(Observador observador) {
        notificadorPedidos.adicionarObservador(observador);
    }

    public void removerObservador(Observador observador) {
        notificadorPedidos.removerObservador(observador);
    }

    public void notificarClientes(String mensagem) {
        notificadorPedidos.notificar(mensagem);
    }

    public void setConfiguracoes(String tema) {
        configuracoes.setTema(tema);
    }

    public void exibirConfiguracoes() {
        configuracoes.exibirConfiguracoes();
    }
}
