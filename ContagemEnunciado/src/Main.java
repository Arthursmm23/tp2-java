import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite uma frase: ");
        String frase = scanner.nextLine();


        String[] palavras = frase.split("\\s+");


        int totalPalavras = palavras.length;


        System.out.println("Total de palavras: " + totalPalavras);

        scanner.close();
    }
}