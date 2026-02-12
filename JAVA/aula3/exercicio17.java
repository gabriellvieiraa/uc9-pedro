//Extrator de Dígitos: Peça um número de 3 dígitos. Extraia e imprima cada dígito.


package aula3;

import java.util.Scanner;

public class exercicio17 {
    public static void main(String[] args) {
        
        int num;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite um número de 3 dígitos: ");
        num = in.nextInt();
        System.out.println();

        

        System.out.println("Número digitado por dígito: "+num);

    }
    
}
