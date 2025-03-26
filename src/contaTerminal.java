import java.util.Scanner;

public class contaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        int conta;
        String agencia;
        String nomeCliente;
        double saldo;

        System.out.println("Digite o número da conta: ");
        conta = scanner.nextInt();
        System.out.println("Digite o numero da agencia:");
        agencia = scanner.next();
        System.out.println("Digite o nome do cliente: ");
        nomeCliente = scanner.next();

        System.out.println("digite o saldo da conta:");
        saldo = scanner.nextDouble();

        scanner.close();

        System.out.println("Ola " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agencia é: "
                + agencia + " sua conta: " + conta + " e seu saldo disponível é: " + saldo
                + " que já está disponível para saque");

    }
}
