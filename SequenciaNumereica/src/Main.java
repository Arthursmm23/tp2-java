import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite o valor inicial: ");
        int valorInicial = scanner.nextInt();

        System.out.print("Digite o incremento: ");
        int incremento = scanner.nextInt();


        StringBuilder sequencia = new StringBuilder();
        for (int i = valorInicial; i <= 100; i += incremento) {
            sequencia.append(i).append(", ");
        }


        if (sequencia.length() > 0) {
            sequencia.setLength(sequencia.length() - 2);
        }
        System.out.println(sequencia.toString());
    }
}