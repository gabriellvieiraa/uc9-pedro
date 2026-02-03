//Positivo, Negativo ou Zero
//Receba um número e classifique-o como "Positivo", "Negativo" ou "Zero".

package ifs;

import java.util.Scanner;

public class exercicio5 {

    public static void main(String[] args) {
        

        int num;
        num = -1;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite um número");
        num = in.nextInt();

        if(num < 0){
            System.out.println("numero negativo");
        }else if (num > 0){
            System.out.println("numero positivo");
        }else{
            System.out.println("numero é zero");
        }

    }
    
}
