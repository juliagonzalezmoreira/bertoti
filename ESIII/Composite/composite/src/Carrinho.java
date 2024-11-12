import java.util.ArrayList;
import java.util.List;

public class Carrinho implements Item{
    private List<Item> itens;

    public Carrinho() {
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(Item item) {
        itens.add(item);
    }

    public void removerItem(Item item) {
        itens.remove(item);
    }

    public void comprar() {
        System.out.println("Comprando do carrinho os itens:");
        for (Item item : itens) {
            item.comprar();
        }
    }
}
