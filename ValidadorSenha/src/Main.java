import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Cadastre sua senha: ");
        String senhaCadastrada = scanner.nextLine();


        String senhaDigitada;
        do {
            System.out.print("Digite a senha novamente: ");
            senhaDigitada = scanner.nextLine();

            if (!senhaDigitada.equals(senhaCadastrada)) {
                System.out.println("Senha incorreta. Tente novamente.");
            }
        } while (!senhaDigitada.equals(senhaCadastrada));

       
        System.out.println("Senha correta! Acesso concedido.");

        scanner.close();
    }
}