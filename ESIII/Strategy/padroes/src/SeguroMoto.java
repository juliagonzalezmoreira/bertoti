public class SeguroMoto implements Cotacao {

    public double calcularSeguro(double valorVenal) {
        double valorSeguroMoto = valorVenal*0.08;
        System.out.println("O valor do seguro da sua moto será de R$"+String.format("%.2f",valorSeguroMoto)+" por ano");
        return valorSeguroMoto;
    }
}
