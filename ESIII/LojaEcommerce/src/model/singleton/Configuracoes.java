package model.singleton;

public class Configuracoes {
    private static Configuracoes instancia;
    private String tema;

    private Configuracoes() {
    }

    public static Configuracoes getInstancia() {
        if (instancia == null) {
            synchronized (Configuracoes.class) {
                if (instancia == null) {
                    instancia = new Configuracoes();
                }
            }
        }
        return instancia;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public void exibirConfiguracoes() {
        System.out.println("Configurações: Tema - " + tema);
    }
}
