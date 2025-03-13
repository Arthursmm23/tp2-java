import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor da compra: R$ ");
        double valorCompra = scanner.nextDouble();

        double desconto = calcularDesconto(valorCompra);
        double valorFinal = valorCompra - (valorCompra * desconto);

        System.out.printf("\nValor original: R$ %.2f%n", valorCompra);
        System.out.printf("Desconto aplicado: %.0f%%%n", desconto * 100);
        System.out.printf("Valor final: R$ %.2f%n", valorFinal);

        scanner.close();
    }

    public static double calcularDesconto(double valorCompra) {
        if (valorCompra > 1000) {
            return 0.10;
        } else if (valorCompra >= 500) {
            return 0.05;
        } else {
            return 0.0; 
        }
    }
}