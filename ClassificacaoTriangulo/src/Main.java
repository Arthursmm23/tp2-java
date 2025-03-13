import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite os comprimentos dos três lados do triângulo:");
        double lado1 = scanner.nextDouble();
        double lado2 = scanner.nextDouble();
        double lado3 = scanner.nextDouble();

        if (isTrianguloValido(lado1, lado2, lado3)) {
            classificarTriangulo(lado1, lado2, lado3);
        } else {
            System.out.println("As medidas fornecidas não formam um triângulo válido.");
        }

        scanner.close();
    }


    private static boolean isTrianguloValido(double a, double b, double c) {
        return a + b > c && a + c > b && b + c > a;
    }


    private static void classificarTriangulo(double a, double b, double c) {
        if (a == b && b == c) {
            System.out.println("Triângulo Equilátero: todos os lados são iguais.");
        } else if (a == b || a == c || b == c) {
            System.out.println("Triângulo Isósceles: dois lados são iguais.");
        } else {
            System.out.println("Triângulo Escaleno: todos os lados são diferentes.");
        }
    }
}