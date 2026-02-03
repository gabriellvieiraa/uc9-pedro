//Maior de Idade
//Peça a idade do usuário e informe se ele é "Maior de idade" (18 anos ou mais) ou "Menor de idade".


package ifs;

import java.util.Scanner;

public class exercicio2 {

    public static void main(String[] args) {
        
        int idade;
        Scanner in = new Scanner(System.in);

        System.out.println("Qual sua idade ?");
        idade = in.nextInt();

        if(idade < 18 ){
            System.out.println("Você ainda é menor de idade");
        }else if(idade >= 18){
            System.out.println("Maior de idade");
        }

    }
    
}

