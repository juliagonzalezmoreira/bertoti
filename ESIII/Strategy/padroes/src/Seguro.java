public class Seguro {

    private Cotacao cotacao;

    public Seguro(Cotacao cotacao){
        this.cotacao = cotacao;
    }

    public double cotar(double valorVenal){
        return cotacao.calcularSeguro(valorVenal);
    }

    public void setCotacao(Cotacao cotacao){
        this.cotacao = cotacao;
    }
}
