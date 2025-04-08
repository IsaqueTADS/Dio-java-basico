import java.util.Scanner;

public class ContaTerminal {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int numero = 0;
    String agencia = "";
    String nomeCliente = "";
    double saldo = 0.0;

    System.out.println("Digite o numero para a conta: ");
    numero = scanner.nextInt();
    scanner.nextLine();
    System.out.println("Digite a agencia da conta: ");
    agencia = scanner.next();
    scanner.nextLine();
    System.out.println("Digite o seu nome: ");
    nomeCliente = scanner.nextLine();
    scanner.nextLine();
    System.out.println("Digite o saldo da conta: ");
    saldo = scanner.nextDouble();

    // Exibindo a mensagem com os dados da conta

    /**
     * <h1>Poderia ser</h1>
     * System.out.println("\nOlá ".concat(nomeCliente)
     * .concat(", obrigado por criar uma conta em nosso banco, sua agência é ")
     * .concat(agencia)
     * .concat(", conta ")
     * .concat(String.valueOf(numero))
     * .concat(" e seu saldo ")
     * .concat(String.valueOf(saldo))
     * .concat(" já está disponível para saque."));
     * 
     */
    System.out.println("\nOlá " + nomeCliente +
        ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia +
        ", conta " + numero +
        " e seu saldo " + saldo +
        " já está disponível para saque.");

    scanner.close();

  }

}
