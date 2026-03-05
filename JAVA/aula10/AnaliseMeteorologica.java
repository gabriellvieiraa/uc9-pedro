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
        double media;

       //cidade 1
       
       media = temperaturas [0][0] * 0.7 + temperaturas [0][1] * 0.3;
       
       System.out.printf("%.2f\n", media);

       //cidade2 

       media = temperaturas [1][0] * 0.7 + temperaturas [1][1] * 0.3;

       System.out.printf("%.2f\n", media);

       //cidade 3

       media = temperaturas [2][0] * 0.7 + temperaturas [2][1] * 0.3;

       System.out.printf("%.2f\n", media);

       //cidade 4

       media = temperaturas [3][0] * 0.7 + temperaturas [3][1] * 0.3;

       System.out.printf("%.2f\n", media);

       //cidade 5

       media = temperaturas [4][0] * 0.7 + temperaturas [4][1] * 0.3;

       System.out.printf("%.2f\n", media);

       


        // Amplitude

        double[] amplitude;
       


        

    }


    
}
