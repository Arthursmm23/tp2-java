import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite seu salário bruto anual: ");
        double salarioBruto = scanner.nextDouble();


        double imposto = calcularImpostoRenda(salarioBruto);


        System.out.printf("Imposto de Renda a pagar: R$ %.2f%n", imposto);
        System.out.printf("Salário líquido anual: R$ %.2f%n", salarioBruto - imposto);

        scanner.close();
    }


    public static double calcularImpostoRenda(double salarioBruto) {
        double imposto = 0;

        if (salarioBruto <= 22500) {
            imposto = 0;
        } else if (salarioBruto <= 30000) {
            imposto = (salarioBruto - 22500) * 0.075;
        } else if (salarioBruto <= 55000) {
            imposto = (30000 - 22500) * 0.075 + (salarioBruto - 30000) * 0.15;
        } else if (salarioBruto <= 80000) {
            imposto = (30000 - 22500) * 0.075 + (55000 - 30000) * 0.15 + (salarioBruto - 55000) * 0.225;
        } else {
            imposto = (30000 - 22500) * 0.075 + (55000 - 30000) * 0.15 + (80000 - 55000) * 0.225 + (salarioBruto - 80000) * 0.275;
        }

        return imposto;
    }
}