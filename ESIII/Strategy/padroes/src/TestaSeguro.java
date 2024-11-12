public class TestaSeguro {

    public static void main(String[] args) {
        Seguro seguroA = new Seguro(new SeguroCarro());
        seguroA.cotar(40000);

        Seguro seguroM = new Seguro(new SeguroMoto());
        seguroM.cotar(15000);

        Seguro seguroC = new Seguro(new SeguroCasa());
        seguroC.cotar(250000);
    }
}
