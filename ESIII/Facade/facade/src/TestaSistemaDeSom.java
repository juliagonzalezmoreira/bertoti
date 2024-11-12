import java.util.Scanner;

public class TestaSistemaDeSom {
    public static void main(String[] args) {
        SistemaDeSom sistemaDeSom = new SistemaDeSom();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite 1 para ligar o sistema de som ou 2 para desligar:");
        int input = scanner.nextInt();
        if (input == 1) {
            sistemaDeSom.ligar();
        } else if (input == 2) {
            sistemaDeSom.desligar();
        } else {
            System.out.println("Entrada inválida");
        }
    }
}
