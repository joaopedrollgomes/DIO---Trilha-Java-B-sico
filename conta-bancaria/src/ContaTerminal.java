import java.util.Scanner;

public class ContaTerminal {
    public void contaBancaria() {
        Scanner scanner= new Scanner(System.in);

        System.out.println("Digite o numero da conta: ");
        int numeroDaConta = scanner.nextInt();

        System.out.println("Digite a agencia: ");
        String agencia = scanner.next();

        System.out.println("Digite seu nome: ");
        String nomeDoCliente = scanner.next();

        System.out.println("Digite o saldo: ");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeDoCliente + ", obrigado por criar uma conta em nosso banco, sua agência é: " + agencia + ", conta: " + numeroDaConta + " e seu saldo: " + saldo + " já está disponível para saque");
    }
}
