package aula10;

import java.util.Scanner;

public class AnaliseMeteorologica {
    
    public static void calcularMediaPonderadaTemperatura(double max, double min) {

       
        

    }

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

    public static void identificarCidadeComMaiorAmplitudeTermica(){

       


    }

    public static void main(String[] args) {



        


        

        
        

        

        



        

    }


    
}
