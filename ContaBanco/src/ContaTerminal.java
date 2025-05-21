import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
        public static void main(String[] args) {

            // Importando e configurando o Scanner
            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
            
            // Declarando as variáveis fora dos blocos
            int numeroConta = 0;
            String numeroAgencia = "";
            String nomeCliente = "";
            double saldo = 237.48;
            /*
            No Java, antes de usar uma informação (como o número da conta ou o nome do cliente),
            precisamos criar uma variável para armazená-la. Uma variável é como uma caixinha com nome e tipo, 
            onde você guarda dados temporariamente enquanto o programa roda.
            */
            
            // Solicitando os dados do usuário
            System.out.println("Por favor, informe o número da sua conta:");

            if (scanner.hasNextInt()) {
                numeroConta = scanner.nextInt();
                scanner.nextLine(); // Limpa o buffer
            
            } else {
                System.out.println("Nessa etapa só são aceitos números.");
                scanner.close();
                return;
            }

            System.out.println("Agora digite o número da Agência:");
            numeroAgencia = scanner.nextLine();
    
            System.out.println("Me informe o seu nome completo:");
            nomeCliente = scanner.nextLine();

             // Exibindo a mensagem final
             System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco. Sua agência é " 
             + numeroAgencia + ", conta " + numeroConta + ", e seu saldo de R$" + saldo + " já está disponível para saque.");
             }
    }
