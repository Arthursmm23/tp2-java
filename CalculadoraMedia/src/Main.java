import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Digite as quatro notas bimestrais(coloque com vírgula):");
        double nota1 = scanner.nextDouble();
        double nota2 = scanner.nextDouble();
        double nota3 = scanner.nextDouble();
        double nota4 = scanner.nextDouble();


        double media = (nota1 + nota2 + nota3 + nota4) / 4;


        System.out.printf("Sua média é: %.2f%n", media);


        if (media >= 7) {
            System.out.println("Parabéns! Você foi aprovado.");
        } else if (media >= 5) {
            System.out.println("Você está em recuperação.");
        } else {
            System.out.println("Infelizmente, você foi reprovado.");
        }

        scanner.close();
    }
}