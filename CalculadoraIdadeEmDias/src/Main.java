import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite o dia do seu nascimento: ");
        int dia = scanner.nextInt();

        System.out.print("Digite o mês do seu nascimento: ");
        int mes = scanner.nextInt();

        System.out.print("Digite o ano do seu nascimento: ");
        int ano = scanner.nextInt();


        LocalDate dataAtual = LocalDate.now();


        LocalDate dataNascimento = LocalDate.of(ano, mes, dia);


        long idadeEmDias = ChronoUnit.DAYS.between(dataNascimento, dataAtual);

        
        System.out.println("Sua idade em dias é: " + idadeEmDias + " dias.");

        scanner.close();
    }
}