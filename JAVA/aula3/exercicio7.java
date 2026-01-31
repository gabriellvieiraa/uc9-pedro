//pergunte ao usuário por dois números inteiros e imprima o produto

package aula3;

import java.util.Scanner;

public class exercicio7 {
    public static void main(String[] args) {

        String num1;
        String num2;
       
        Scanner in = new Scanner(System.in);

        System.out.println("Fale um número inteiro: ");
        num1 = in.nextLine();

        System.out.println("Fale o segundo número inteiro: ");
        num2 = in.nextLine();

        System.out.println("Produtos digitados: " +num1 + " e " + num2);



        
    }
    
}
