package MiniBanco;
import java.util.Scanner;

import aula1.dobro;  

public class MiniBanco {

    //constantes

    static final double LIMITE_SAQUE = 1000.00;
    static final double TAXA_SAQUE = 0.02;

    static double calcularTotalSaque(double valor){
        return valor + (valor * TAXA_SAQUE);
    }

    static boolean dentroDoLimite(double valor){
        return valor <= LIMITE_SAQUE;
    }

    static boolean saldoSuficiente(double saldo, double valor){
        return saldo >= calcularTotalSaque(valor);
    }

    static double sacar(double saldo, double valor){
        return saldo - calcularTotalSaque(valor);
    }

    static void exibirMenu(){
        System.out.println("\n-----MiniBanco-----\n");
        System.out.println("1 - Depositar");
        System.out.println("2 - Sacar");
        System.out.println("3 - Consultar saldo");
        System.out.println("4 - Ver extrato");
        System.out.println("0 - sair");
        System.out.print("Escolha uma opiçao: ");
    }

    static double depositar(double saldo, double valor){
        return saldo + valor;
    }

    static void exibirSaldo(double saldo){
        System.out.printf("Saldo atual: R$ %.2f%n", saldo);
    }

    static boolean valorEhValido(double valor){
        return valor > 0;
    }

    static void exibirExtrato(String[] extrato, int totalLinhas){
        System.out.println("\n------------------Extrato--------------------\n");
        if (totalLinhas == 0){
            System.out.println("Nenhuma movimentação.");
        }else {
            for (int i = 0; i < totalLinhas; i++){
                System.out.println(" " + extrato[i]);
            }
        }
        System.out.println("\n---------------------------------------------\n");
    }

    static int registrar(String[] extrato, int totalLinhas, String linha){
        extrato[totalLinhas] = linha;
        return totalLinhas + 1;
    }

    public static void main(String[] args) {

        System.out.println("\nMini Bnaco iniciado. \n");

        Scanner scanner = new Scanner(System.in);
        
        //variáveis do extrato
        String[] extrato = new String[50];
        int totalLinhas = 0;

        //variáveis principais da conta
        double saldo = 0.0;
        int opcao = -1;

        //boas vindas
        System.out.print("Digite o seu primeiro nome: ");
        String nome = scanner.next();
        System.out.printf("Olá, %s! Saldo inicial: R$ %.2f\n", nome, saldo);

        while (opcao != 0){
            exibirMenu();

            opcao = scanner.nextInt();

            if (opcao == 1){
                System.out.print("Valor a depositar: R$ ");
                double valor = scanner.nextDouble();

                if (!valorEhValido(valor)){
                    System.out.print("Atenção, valor inválido. Valor deve ser maior que zero ");
                }else {
                    saldo = depositar(saldo, valor);
                    System.out.println("Depósito realizado!");
                    exibirSaldo(saldo);
                    totalLinhas = registrar(extrato, totalLinhas, String.format("Depósito +R$ %.2f => Saldo R$ %.2f", valor, saldo));
                }

               // System.out.println(" [Depositar - em breve] ");

            }else if (opcao ==2){
                System.out.printf("Valor a sacar: R$ ");
                double valorSaque = scanner.nextDouble();
                if (!valorEhValido(valorSaque)){
                    System.out.print("Atenção, valor inválido. ");
                }else if (!dentroDoLimite(valorSaque)){
                    System.out.printf("Limite exedido. Máximo: R$ %.2f%n", LIMITE_SAQUE);
                }else if (!saldoSuficiente(saldo, valorSaque)){
                    System.out.printf("Saldo insufuciente. Necessário: R$ %.2f%n", calcularTotalSaque(valorSaque));
                }else {
                    double taxa = valorSaque * TAXA_SAQUE;
                    saldo = sacar(saldo, valorSaque);
                    System.out.printf("Saque realizado. Taxa cobrada: R$ %.2f%n", taxa);
                    totalLinhas = registrar(extrato, totalLinhas, String.format("Saque -R$ %.2f => Saldo: R$ %.2f", valorSaque, saldo));
                }

                //System.out.println(" [Sacar - em breve] ");

            }else if (opcao ==3){
                exibirSaldo(saldo);
                //System.out.println(" [Consultar saldo] ");
                
            }else if (opcao ==4){
                exibirExtrato(extrato, totalLinhas);
                //System.out.println(" [Extrato - em breve] ");

            }else if (opcao == 0){
                exibirExtrato(extrato, totalLinhas);
                System.out.println("Até logo, " + nome + "!");
            }else {
                System.out.println("Opção inválida");
            }
        }

        scanner.close();
        
    }
    
}
