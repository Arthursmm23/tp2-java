import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        final double TAXA_DOLAR = 5.25;
        final double TAXA_EURO = 6.15;
        final double TAXA_LIBRA = 7.10;


        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite o valor em reais (R$): ");
        double valorReais = scanner.nextDouble();


        System.out.print("Escolha a moeda de destino (dolar, euro, libra): ");
        String moedaDestino = scanner.next().toLowerCase();


        double valorConvertido = 0;
        switch (moedaDestino) {
            case "dolar":
                valorConvertido = valorReais / TAXA_DOLAR;
                break;
            case "euro":
                valorConvertido = valorReais / TAXA_EURO;
                break;
            case "libra":
                valorConvertido = valorReais / TAXA_LIBRA;
                break;
            default:
                System.out.println("Moeda inválida!");
                return;
        }


        System.out.printf("Valor convertido: %.2f %s%n", valorConvertido, moedaDestino);


        scanner.close();
    }
}