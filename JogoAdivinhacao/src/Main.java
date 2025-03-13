import java.util.Random;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int numeroSecreto = random.nextInt(100) + 1;
        int palpite;
        boolean acertou = false;

        System.out.println("Bem-vindo ao Jogo de Adivinhação!");
        System.out.println("Tente adivinhar o número entre 1 e 100.");

        while (!acertou) {
            System.out.print("Digite seu palpite: ");
            palpite = scanner.nextInt();

            if (palpite == numeroSecreto) {
                acertou = true;
                System.out.println("Parabéns! Você acertou o número secreto: " + numeroSecreto);
            } else if (palpite < numeroSecreto) {
                System.out.println("O número secreto é maior que " + palpite + ".");
            } else {
                System.out.println("O número secreto é menor que " + palpite + ".");
            }
        }

        scanner.close();
    }
}