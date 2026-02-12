//Calculadora de Gorjeta: Peça o total da conta e a porcentagem da gorjeta, calcule e imprima a gorjeta e o total final

package aula3;

import java.util.Scanner;

public class exercicio16 {

    public static void main(String[] args) {
        
        double totalConta;
        double porcentagemGorjeta;
        double valorGorjeta;
        double total;

         Scanner in = new Scanner(System.in);

        System.out.println("Digite o valor total da conta: ");
        totalConta = in.nextDouble();

        System.out.println();
        System.out.println("Digite a porcentagem da gorjeta: ");
        porcentagemGorjeta = in.nextDouble();

        valorGorjeta = totalConta * porcentagemGorjeta /100;

        System.out.println("O valor da gorjeta é de R$: " + porcentagemGorjeta);
        System.out.println();

        System.out.println("O valor da gorjeta é de R$: "+valorGorjeta);

        total = totalConta + valorGorjeta;

        System.out.println("Valor final: "+total);

    }

    
}
