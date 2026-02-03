//Comparador Simples
//Receba dois números e informe qual é o maior, ou se são iguais.

package ifs;

import java.util.Scanner;

public class exercicio3 {

    public static void main(String[] args) {
        
        int num1;
        int num2;

        Scanner in = new Scanner(System.in);

        System.out.println("Digiter um número");
        num1 = in.nextInt();

        System.out.println("Digite o segundo número");
        num2 = in.nextInt();

        if(num1 > num2){
            System.out.println("O primeiro numero é maior que o segundo" );
        }else if (num1 < num2){
            System.out.println("O segundo numero é maior que o primeiro ");
        }else{
            System.out.println("números iguais");
        }



    }
    
}
