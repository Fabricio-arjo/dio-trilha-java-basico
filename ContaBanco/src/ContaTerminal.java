import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    
    public static void main(String[] args) {
      
      Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

      int numero;
      String agencia, nomeCliente;
      double saldo;
  
      System.out.println("Informe o número da agência:");
      agencia = scanner.next();
     
      System.out.println("Informe o número da conta: ");
      numero = scanner.nextInt();

      System.out.println("Informe o nome do cliente:");
      nomeCliente = scanner.next();

      System.out.println("Informe seu saldo atual:");
      saldo = scanner.nextDouble();


      System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "+ agencia + ", conta " + numero  +" e seu saldo " + saldo + " já está disponível para saque.");





    }


}
