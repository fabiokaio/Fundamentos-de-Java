import java.util.Scanner;

public class SimulacaoBancaria {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double saldo = 0;
        boolean continuar = true;

        while (continuar) {

            System.out.println("Escolha uma opção:");
            System.out.println("1. Depositar");
            System.out.println("2. Sacar");
            System.out.println("3. Verificar saldo");
            System.out.println("0. Sair");

            int opcao = input.nextInt();
            switch (opcao) {
                case 1:
                    // Ler o valor a ser depositado e atualizar/imprimir o saldo.
                    System.out.println("Digite o valor a ser depositado:");
                    int valorDeposito = input.nextInt();
                    System.out.println("Seu depósito foi realizado com sucesso.");
                    System.out.println("Valor depositado: " + valorDeposito + " reais.");
                    System.out.println("Seu saldo é: " + saldo + " reais.");
                    break;
                case 2:
                    int valorSaque = input.nextInt();
                    if(valorSaque > saldo){
                        System.out.println("O valor do saque é superior ao seu saldo atual");
                    }else{
                        saldo -= valorSaque;
                        System.out.println("Seu saque foi realizado com sucesso.");
                    }
                    System.out.println("Seu saldo é de " + saldo + " reais.");
                    // Ler o valor a ser sacado e verificar/imprimir se há saldo suficiente.
                    break;
                case 3:
                    System.out.println("Seu saldo é: " + saldo + " reais.");
                    break;
                case 0:
                    System.out.println("Programa encerrado.");
                    continuar = false;  // Atualiza a variável de controle para encerrar o loop
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
        input.close();
    }
}