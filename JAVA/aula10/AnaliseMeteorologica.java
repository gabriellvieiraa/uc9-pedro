package aula10;

import java.util.Scanner;

public class AnaliseMeteorologica {

    //============= método calcularMediaPonderadaTemperatura ========================
    
    // public static void calcularMediaPonderadaTemperatura(double max, double min) {

    //     double calculo = (max * 0.7) + (min * 0.3);
    //     return calculo;
        
    // }

    //================= método classificarClima ====================================

    public static void classificarClima(double tempMedia, int umidadeMedia){


        String classificacao = "QUENTE MODERADO, CONFORTAVEL, MUITO QUENTE, QUENTE LEVE, MUITO QUENTE E UMIDO";

       if(tempMedia > 30 && umidadeMedia > 75){
        System.out.println("MUITO QUENTE E UMIDO");;
       }else if(tempMedia >= 20-25 && umidadeMedia >= 50-70){
        System.out.println("COMFORTAVEL");
       }else if(tempMedia < 15 && umidadeMedia < 50){
        System.out.println("FRIO E SECO");
       }else{
        System.out.println("Não identificado");
       }


    }

    //==================== método identificarCidadeComMaiorAmplitudeTermica ===============

    public static void identificarCidadeComMaiorAmplitudeTermica(){

       


    }

    public static void main(String[] args) {  //arrays é um objeto utilizado para armazenar uma coleção ordenada de dados em uma única variável

        // Temperaturas: [máxima, mínima] para 5 cidades
        double[][] temperaturas = {
            {32.5, 22.1},  // Cidade 1
            {28.3, 18.7},  // Cidade 2
            {35.8, 24.9},  // Cidade 3
            {30.2, 20.5},  // Cidade 4
            {25.7, 15.3}   // Cidade 5
        };

        // Umidades: [manhã, tarde, noite] para 5 cidades
        int[][] umidades = {
            {85, 60, 75},  // Cidade 1
            {78, 55, 70},  // Cidade 2
            {90, 65, 80},  // Cidade 3
            {82, 58, 72},  // Cidade 4
            {75, 50, 68}   // Cidade 5
        };


        //========== temperartura media =========

        double media1, media2, media3, media4, media5;

       //cidade 1
       
       media1 = temperaturas [0][0] * 0.7 + temperaturas [0][1] * 0.3;
       
       System.out.printf("%.2f\n", media1);         //"%" = indica q vai começar uma formatação de valor, ".2"= número de casas decimaias após a vírgula, "f"= significa double

       //cidade2 

       media2 = temperaturas [1][0] * 0.7 + temperaturas [1][1] * 0.3;

       System.out.printf("%.2f\n", media2);

       //cidade 3

       media3 = temperaturas [2][0] * 0.7 + temperaturas [2][1] * 0.3;

       System.out.printf("%.2f\n", media3);

       //cidade 4

       media4 = temperaturas [3][0] * 0.7 + temperaturas [3][1] * 0.3;

       System.out.printf("%.2f\n", media4);

       //cidade 5

       media5 = temperaturas [4][0] * 0.7 + temperaturas [4][1] * 0.3;

       System.out.printf("%.2f\n", media5);


      
   
       //========= Classificar clima ============
       
       
       String classificacao = "QUENTE MODERADO, CONFORTAVEL, MUITO QUENTE, QUENTE LEVE, MUITO QUENTE E UMIDO"; 
       
       double tempMedia = 0;    //variável double pq é número quebrado
       int umidadeMedia = 0;    //int pq é um número inteiro

       for(int i = 0; i < 5; i++){      //"i" começa com um valor 0, funciona como um contador loop e funciona enquanto "i" for mnor q 5   
                                        // "i++" a cada repetução o valor de "i" aumenta 1
       if(tempMedia > 30 && umidadeMedia > 75){
           System.out.println("MUITO QUENTE E UMIDO");;
        }else if(tempMedia >= 20 && tempMedia <= 25 && umidadeMedia >= 50 && umidadeMedia <= 70){
            System.out.println("COMFORTAVEL");  //se for verdadeiro retorna "confortável"
        }else if(tempMedia < 15 && umidadeMedia < 50){
            System.out.println("FRIO E SECO");
        }else{
            System.out.println("Não identificado");
        }
        
       
    }
    

        //============= Amplitude =============
    
        int indiceMaior = 0;
    
        double maiorAmplitude;

        double amplitude;

        maiorAmplitude = temperaturas[0][0] - temperaturas[0][1];   //Calcula a amplitude da cidade 1 e usa como valor inicial.

        for (int i = 1; i < temperaturas.length; i++) { //começa um loop com "for", "i" cria um contador q começa em 1 pq o índice 0 ja foi usado
                                                        // o length percorre todas posições dos vetores

         amplitude = temperaturas[i][0] - temperaturas[i][1]; //

        if (amplitude > maiorAmplitude) {
        maiorAmplitude = amplitude;
        indiceMaior = i;
        }

        
    }
    
    
    // =========== Saída =========
    
    System.out.println("==============================================================");
    System.out.println("        SISTEMA DE ANÁLISE METEOROLÓGICA INTELIGENTE");
    System.out.println("==============================================================");
    
    System.out.println();
    System.out.println("ANÁLISE DETALHADA POR CIDADE:");
    System.out.println("--------------------------------------------------------------");
    
    System.out.printf("%-6s | %-6s | %-6s | %-6s | %-6s | %-16s\n",
    "CIDADE", "T.MAX", "T.MIN", "T.MÉD", "UMID%", "CLASSIFICAÇÃO");
    
    System.out.println("--------------------------------------------------------------");
}
    }






