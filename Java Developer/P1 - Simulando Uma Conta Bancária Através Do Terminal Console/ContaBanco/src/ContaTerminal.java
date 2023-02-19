import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o número da Agência");
        int numero = scanner.nextInt();

        System.out.println("Informe a Agência");
        String agencia = scanner.next();

        System.out.println("Informe o seu nome");
        String nomeCliente = scanner.next();

        System.out.println("Informe o saldo");
        double saldo = scanner.nextDouble();


        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque", nomeCliente, agencia, numero, saldo);

        }
}