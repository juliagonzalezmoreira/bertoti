public class SeguroCarro implements Cotacao {


    public double calcularSeguro(double valorVenal) {
        double valorSeguroCarro = valorVenal*0.06;
        System.out.println("O valor do seguro do seu carro será de R$"+String.format("%.2f",valorSeguroCarro)+" por ano");
        return valorSeguroCarro;
    }
}
