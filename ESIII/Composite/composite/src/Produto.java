public class Produto implements Item{
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public void comprar() {
        System.out.println("Produto: " + nome + " por R$" + preco);
    }
}
