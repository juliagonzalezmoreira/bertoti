public class Usuario implements Observer {
    private String nome;
    private String ultimaMensagem;

    public Usuario(String nome) {
        this.nome = nome;
    }

    public void atualizar(String mensagem) {
        ultimaMensagem = mensagem;
        mostrar();
    }

    public void mostrar() {
        System.out.println("Usuário: " + nome + ", última mensagem: " + ultimaMensagem);
    }
}
