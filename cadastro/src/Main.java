import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite seu nome completo: ");
        String nomeUsuario = scanner.nextLine();

        System.out.print("Digite sua idade: ");
        int idadeUsuario = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Digite o nome da sua mãe: ");
        String nomeMae = scanner.nextLine();

        System.out.print("Digite o nome do seu pai: ");
        String nomePai = scanner.nextLine();


        System.out.println("\n--- Informações ---");
        System.out.println("Nome: " + nomeUsuario);
        System.out.println("Idade: " + idadeUsuario);
        System.out.println("Mãe: " + nomeMae);
        System.out.println("Pai: " + nomePai);


        compararTamanhoNomes(nomeUsuario, nomeMae, nomePai);

        scanner.close();
    }


    private static void compararTamanhoNomes(String nomeUsuario, String nomeMae, String nomePai) {
        int tamanhoNomeUsuario = nomeUsuario.length();
        int tamanhoNomeMae = nomeMae.length();
        int tamanhoNomePai = nomePai.length();

        System.out.println("\n--- Comparação de Tamanho dos Nomes ---");
        System.out.println("Tamanho do seu nome: " + tamanhoNomeUsuario);
        System.out.println("Tamanho do nome da mãe: " + tamanhoNomeMae);
        System.out.println("Tamanho do nome do pai: " + tamanhoNomePai);

        if (tamanhoNomeUsuario > tamanhoNomeMae && tamanhoNomeUsuario > tamanhoNomePai) {
            System.out.println("Seu nome é mais longo que o da sua mãe e do seu pai!");
        } else if (tamanhoNomeUsuario > tamanhoNomeMae) {
            System.out.println("Seu nome é mais longo que o da sua mãe!");
        } else if (tamanhoNomeUsuario > tamanhoNomePai) {
            System.out.println("Seu nome é mais longo que o do seu pai!");
        } else {
            System.out.println("Seu nome não é mais longo que o da sua mãe ou do seu pai.");
        }
    }
}