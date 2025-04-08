
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
  public static void main(String[] args) {
    // criando o objeto scanner

    try {

      Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

      System.out.println("Digite seu nome");
      String nome = scanner.next();

      System.out.println("Digite seu sobrenome");
      String sobrenome = scanner.next();

      System.out.println("Digite sua idade");
      int idade = scanner.nextInt();

      System.out.println("Digite sua altura");
      double altura = scanner.nextDouble();

      System.out.println("Olá, eu sou " + nome + " " + sobrenome);
      System.out.println("Minha altura é " + altura + " metros");
      System.out.println("Minha idade é " + idade + " anos");

    } catch (InputMismatchException error) {
      System.out.println("Os campos idade e altura precisam ser numericos");

    }

  }

}
