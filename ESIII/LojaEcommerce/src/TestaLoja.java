import controller.Controller;
import controller.strategy.EnvioExpresso;
import controller.strategy.EnvioNormal;
import controller.strategy.MetodoEnvio;
import model.ModelFacade;
import view.View;
import view.composite.ItemPedido;
import view.composite.Pacote;
import view.composite.Produto;

import java.util.Scanner;

public class TestaLoja {
    public static void main(String[] args) {
        Controller controller = new Controller();
        View view = new View(controller);

        ModelFacade modelFacade = ModelFacade.getInstancia();
        modelFacade.adicionarObservador(view);

        Scanner scanner = new Scanner(System.in);

//        // Configurando o idioma e o tema da loja
//        System.out.print("Digite o idioma da loja: ");
//        String idioma = scanner.nextLine();
//        System.out.print("Digite o tema da loja: ");
//        String tema = scanner.nextLine();
//        modelFacade.setConfiguracoes(idioma, tema);

        ItemPedido pacote = new Pacote("Pacote 1");

        // Adição de itens ao pacote
        boolean adicionarItem = true;
        while (adicionarItem) {
            System.out.print("Digite o nome do produto: ");
            String nomeProduto = scanner.nextLine();

            System.out.print("Digite o preço do produto: ");
            double precoProduto = scanner.nextDouble();
            scanner.nextLine(); // Limpar o buffer

            ItemPedido produto = new Produto(nomeProduto, precoProduto);
            pacote.adicionarItem((Produto) produto);

            System.out.print("Deseja adicionar mais itens ao pacote? (S/N): ");
            String resposta = scanner.nextLine();
            adicionarItem = resposta.equalsIgnoreCase("S");
        }

        MetodoEnvio metodoEnvio;
        // Escolhendo o método de envio
        System.out.println("Opções de Envio:");
        System.out.println("1. Envio Normal");
        System.out.println("2. Envio Expresso");
        System.out.print("Escolha uma opção de envio: ");
        int opcaoEnvio = scanner.nextInt();
        if (opcaoEnvio == 2) {
            metodoEnvio = new EnvioExpresso();
        } else {
            metodoEnvio = new EnvioNormal();
        }
        view.setMetodoEnvio(metodoEnvio);
        scanner.nextLine(); // Limpar o buffer

        // Adiciona observadores
        modelFacade.adicionarObservador(view);

        // Adiciona pacote ao pedido
        view.adicionarItemPedido(pacote);

        // Notifica os clientes
        System.out.print("Digite a mensagem de notificação: ");
        String mensagem = scanner.nextLine();
        modelFacade.notificarClientes(mensagem);

        // Exibe as configurações
        view.exibirConfiguracoes();

        // Realiza o pedido
        view.realizarPedido();

        scanner.close();
    }
}
