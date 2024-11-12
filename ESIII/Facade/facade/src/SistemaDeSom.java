public class SistemaDeSom {
    private Radio radio;
    private Subwoofer subwoofer;
    private AltoFalantes altoFalantes;

    public SistemaDeSom() {
        radio = new Radio();
        subwoofer = new Subwoofer();
        altoFalantes = new AltoFalantes();
    }

    public void ligar() {
        radio.ligar();
        subwoofer.ligar();
        altoFalantes.ligar();
    }

    public void desligar() {
        radio.desligar();
        subwoofer.desligar();
        altoFalantes.desligar();
    }
}
