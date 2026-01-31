//Peça um preço e uma quantidade, depois calcule e imprima o custo total.

package aula3;

import java.util.Scanner;

public class exercio9 {

    public static void main(String[] args) {
        
        double preço;
        int quantidade;
        double calculo;
        int custoTotal;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite um preço ");
        preço = in.nextDouble();

        System.out.println("Digite a quantidade ");
        quantidade = in.nextInt();

        calculo = preço * quantidade;

        System.out.println("Valor total: $ "+ calculo);


    }
    
}
