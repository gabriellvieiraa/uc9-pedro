//Dia da Semana (Switch)
//Usando switch, receba um número de 1 a 7 e imprima o dia da semana correspondente (1=Domingo, 2=Segunda, etc.).

package ifs;

import java.util.Scanner;

public class exercicio6 {

    public static void main(String[] args) {
        
        int dia;
        dia =1;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite um número");
        dia = in.nextInt();

        switch(dia){
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("fora do range");
                break;
        }
    }
    
}
