import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
  public static void main(String[] args) {

    int numConta = 1021;
    String agencia = "067-8";
    int senha = 1234;
    String nomeCliente = "Sandro Costa";
    Double saldoConta = 237.48;
    int senhaDig = 0;
    int numContaDig = 0;
    
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
    
    while(senha != senhaDig && numConta != numContaDig){
      System.out.println("Digite o número da agência: ");
        String agenciaDig = scanner.next();

      System.out.println("Digite o número da sua conta: ");
        numContaDig = scanner.nextInt();

        System.out.println("Digite a sua senha de acesso: ");
        senhaDig = scanner.nextInt();

      if(senha == senhaDig && numConta == numContaDig) 
        System.out.println("Olá " +nomeCliente+ ", obrigado por criar uma conta em nosso banco,\nSua agência é " +agencia+ " \nconta " +numConta+ " \ne seu saldo " +saldoConta+ " já está disponível para saque.");
      else
        System.out.println("Dados de agência/conta errados, tente novamente!");
    }

  }
}
