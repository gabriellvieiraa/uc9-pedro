//Par ou Ímpar
//Crie um programa que receba um número inteiro e imprima se ele é "Par" ou "Ímpar".


package ifs;

import java.util.Scanner;

public class exercicio1 {

    public static void main(String[] args) {
        
        int num;
        num = 10;
        Scanner in = new Scanner(System.in);
        System.out.println("Digite um número de 1 a 10");
        num = in.nextInt();

        if(num % 2 == 0 ){
            System.out.println("O número é par");
        }else{
            System.out.println("O número é ímpar");
        }

    }

}
    

