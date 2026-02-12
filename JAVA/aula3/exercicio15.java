//Escreva um método imprimirSaudacaoPersonalizada(String nome).


package aula3;

import java.util.Scanner;

public class exercicio15 {

    public static void imprimirSaudacaoPersonalizada(String nome) {
        System.out.println();
        System.out.println("Seu nome é: " + nome);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Olá, qual seu nome?");
        String nome = in.nextLine();

        imprimirSaudacaoPersonalizada(nome);
    }
}


