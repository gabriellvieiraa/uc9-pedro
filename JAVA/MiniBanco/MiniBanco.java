package MiniBanco;
import java.util.Scanner;  

public class MiniBanco {

    static void exibirMenu(){
        System.out.println("\n=== MiniBanco===");
        System.out.println("1 - Depositar");
        System.out.println("2 - Sacar");
        System.out.println("3 - Consultar saldo");
        System.out.println("4 - Ver extrato");
        System.out.println("0 - sair");
        System.out.println("Escolha");
    }


    public static void main(String[] args) {

        System.out.println("Mini Bnaco iniciado. ");

        Scanner scanner = new Scanner(System.in);
        
        //variáveis principais da conta
        double saldo = 0.0;
        int opcao = -1;

        //boas vindas
        System.out.print("Digite o seu nome: ");
        String nome = scanner.next();
        System.out.printf("Olá, %s! Saldo inicial: R$ %.2f\n", nome, saldo);

        exibirMenu();

        scanner.close();
        

    }
    
}
