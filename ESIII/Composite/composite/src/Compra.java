public class Compra {
    public static void main(String[] args) {
        Produto tenis = new Produto("Tênis", 250);
        Produto camiseta = new Produto("Camiseta", 60);
        Produto cueca = new Produto("Cueca", 30);

        Carrinho carrinho = new Carrinho();
        carrinho.adicionarItem(tenis);
        carrinho.adicionarItem(camiseta);

        Carrinho carrinho2 = new Carrinho();
        carrinho2.adicionarItem(cueca);
        carrinho2.adicionarItem(carrinho);

        carrinho2.comprar();
    }
}
