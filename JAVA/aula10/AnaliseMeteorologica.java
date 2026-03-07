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

    public static void main(String[] args) {

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


        //========== Imprimir dados ============

        //========== temperartura media =========

        double media1, media2, media3, media4, media5;

       //cidade 1
       
       media1 = temperaturas [0][0] * 0.7 + temperaturas [0][1] * 0.3;
       
       System.out.printf("%.2f\n", media1);

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
       
       double tempMedia = 0;
       int umidadeMedia = 0;

       for(int i = 0; i < 5; i++){
       
       if(tempMedia > 30 && umidadeMedia > 75){
           System.out.println("MUITO QUENTE E UMIDO");;
        }else if(tempMedia >= 20 && tempMedia <= 25 && umidadeMedia >= 50 && umidadeMedia <= 70){
            System.out.println("COMFORTAVEL");
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

        maiorAmplitude = temperaturas[0][0] - temperaturas[0][1];

        for (int i = 1; i < temperaturas.length; i++) {

         amplitude = temperaturas[i][0] - temperaturas[i][1];

        if (amplitude > maiorAmplitude) {
        maiorAmplitude = amplitude;
        indiceMaior = i;
        }
    }



        // =========== Saída =========

        System.out.println("_______________________________________________________________");
        System.out.println(" ");
        System.out.println("Olá, bem vindo ao Sistema de Análise Meteorológica Inteligente ");
        System.out.println("_______________________________________________________________");
        System.out.println(" ");

        
        System.out.printf("Essa são as médias de temperaturas de cada cidade: ");
        System.out.println(" ");
        System.out.printf("Cidade 1: %.2f\n", media1);
        System.out.printf("Cidade 2: %.2f\n", media2);
        System.out.printf("Cidade 3: %.2f\n", media3);
        System.out.printf("Cidade 4: %.2f\n", media4);
        System.out.printf("Cidade 5: %.2f\n", media5);


        System.out.println(" ");
        System.out.println("Classificação de cada cidade: "); 
        System.out.println(" ");

        System.out.println("Cidade 1: " + classificacao);
        System.out.println("Cidade 2: " + classificacao);
        System.out.println("Cidade 3: " + classificacao);
        System.out.println("Cidade 4: " + classificacao);
        System.out.println("Cidade 5: " + classificacao);

        System.out.println(" ");

        System.out.println("Cidade com maior amplitude térmica: " + (indiceMaior + 1));
        System.out.println(" ");
    
        }
    }






