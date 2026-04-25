import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double valorAbacaxi = 7.30;
        double valorMaca = 2.0;
        double valorPera = 3.0;

        System.out.print("Insira a quantidade de abacaxis comprados: ");
        int qtdAbacaxi = scanner.nextInt();
        System.out.print("Insira a quantidade de maçãs compradas: ");
        int qtdMaca = scanner.nextInt();
        System.out.print("Insira a quantidade de pêras compradas: ");
        int qtdPera = scanner.nextInt();

        double resultado = valorAbacaxi * qtdAbacaxi + valorMaca * qtdMaca + valorPera * qtdPera;

        System.out.print("O valor da sua compra dará: R$" + resultado + " reais.");
    }
}