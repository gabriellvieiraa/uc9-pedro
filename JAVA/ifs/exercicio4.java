//Aprovado ou Reprovado
//Receba uma nota (0 a 10) e imprima "Aprovado" se for maior ou igual a 6, caso contrário "Reprovado".

package ifs;

import java.util.Scanner;

public class exercicio4 {

    public static void main(String[] args) {

        int nota;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite sua nota aqui");
        nota = in.nextInt();

        if(nota < 6 ){
            System.out.println("Reprovado");
        }else if(nota >= 6){
            System.out.println("Aprovado");
        }



    }
    
}
