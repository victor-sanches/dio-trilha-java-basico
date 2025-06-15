import java.util.Scanner;

public class OperaçoesBancarias {
    public static void main(String[] argas){
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;
        boolean continuar = true;
        
        // scanner: cria o leitor para entrada do teclado.
        //  saldo: armazena o valor atual da conta bancária.
        //  continuar: controla se o programa continua rodando no while.
        
        while (continuar) { //    Enquanto continuar for true, o programa exibirá o menu e processará as ações do usuário.

            int opcao = scanner.nextInt(); //Lê a opção que o usuário escolheu (1, 2, 3 ou 0).
            
            switch (opcao) {  //Verifica o valor de opcao e executa um bloco diferente dependendo do valor:
                case 1:
                    double deposito = scanner.nextDouble(); // Lê o valor do depósito.
                    saldo += deposito; // Adiciona ao saldo.
                    System.out.printf("Saldo atual: %.1f%n", saldo); // Mostra o saldo com uma casa decimal.
                    
                    
                    break; // O break serve para interromper a execução de um bloco de código, geralmente dentro de estruturas como:
                case 2:
                    double saque = scanner.nextDouble();
                    if(saque <= saldo) {
                        saldo -= saque;
                        System.out.printf("Saldo atual: %.1f%n", saldo);
                    }else{
                        System.out.println("Saldo insuficiente");
                    }
                    break;
                case 3:
                    System.out.printf("Saldo atual: %.1f%n", saldo);
                    break;
                case 0: 
                    System.out.println("Programa encerrado.");
                    continuar = false; // Encerra o loop e o programa.
                    break;
                    
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    
            }
        }
        scanner.close(); // fecha o scanner ao final para liberar o recurso.
    }
}
