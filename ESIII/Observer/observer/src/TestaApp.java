public class TestaApp {
    public static void main(String[] args) {
        AppMensagens app = new AppMensagens();

        Usuario usuario1 = new Usuario("Igor");
        Usuario usuario2 = new Usuario("Alan");
        Usuario usuario3 = new Usuario("Lucas");

        app.adicionarObservador(usuario1);
        app.adicionarObservador(usuario2);

        app.novaMensagem("Olá, existem 2 usuários no grupo");

        app.adicionarObservador(usuario3);

        app.novaMensagem("Boa noite, existem 3 usuários no grupo");

        app.removerObservador(usuario1);

        app.novaMensagem("Bom dia, existem 2 usuários no grupo");

        app.removerObservador(usuario2);

        app.novaMensagem("Boa tarde, existe 1 usuário no grupo");

    }
}

