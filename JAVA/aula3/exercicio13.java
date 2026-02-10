//Escreva um método imprimirSoma(int a, int b) que imprima a soma.

package aula3;

import java.util.Scanner;

public class exercicio13 {

    public static void imprimirSoma(int a, int b) {
        int resultado = a + b;
        System.out.println("Resultado: " + resultado);
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Digite o primeiro numero da soma:");
        int a = in.nextInt();

        System.out.println("Digite o segundo numero:");
        int b = in.nextInt();

        imprimirSoma(a, b); // chamada do método
    }
}

