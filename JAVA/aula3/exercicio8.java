//Peça uma temperatura em Fahrenheit, converta para Celsius e imprima.

package aula3;

import java.util.Scanner;

public class exercicio8 {

    public static void main(String[] args) {
        
        double tempF, tempC;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite uma temperatura em Fahrenheit ");
        tempF = in.nextDouble();

        tempC = (tempF - 32)* 5 / 9;

        System.out.println("Esta temperaturta convertida é: "+ tempC);


    }
    
}
