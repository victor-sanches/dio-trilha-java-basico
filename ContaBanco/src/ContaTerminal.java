import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
        public static void main(String[] args) {

            // Importando e configurando o Scanner
            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

             // Solicitando os dados do usuário
             System.out.println("Por favor, informe o numero da sua conta");
             int numeroConta = scanner.nextInt();

             System.out.println("Agora digite o número da Agência!");
             String numeroAgencia = scanner.next();
             scanner.nextLine(); // Limpar o buffer

             System.out.println("Me informe o seu nome completo");
             String nomeCliente = scanner.nextLine();

             // Definindo o saldo disponivel
             double saldo = 237.48;
             System.out.println(saldo);  
            
             // Exibindo a mensagem final
             System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco. Sua agência é " 
             + numeroAgencia + ", conta " + numeroConta + ", e seu saldo de R$" + saldo + " já está disponível para saque.");
             }
    }
