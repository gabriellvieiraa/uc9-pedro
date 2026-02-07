//Gerenciador de Maratona de Filmes 

package aula6;

import java.util.Scanner;

public class MaratonaFilmes {

    //==============MÉTODO CABEÇALHO====================

    public static void exibirCabecalho(){
        System.out.println();
        System.out.printf("Olá, bem vido ao site Maratona Filmes!");
        System.out.println();
        System.out.println();
        
    }


    //=============Método calcularTempoTotal==================

    public static double calcularTempoTotal(double fdouble, double duracaoFilmes){
        return fdouble * duracaoFilmes;
    }


    //===============Método classificarMaratona==============

    public static void classificarMaratona





    public static void main(String[] args) {

        System.out.println();
        System.out.printf("Olá, bem vido ao site Maratona Filmes!");
        System.out.println();
        System.out.println();
        

        //==============VARIÁVEIS=============

        String usuario;
        double duracaoFilmes = 1.5;
        int quantidadeFilmes = 0;
        double resultado;
        double horas = 0;
        String classificacao;

        //===========ENTRADA===========

        Scanner in = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        usuario = in.nextLine();

        System.out.println("Digite a quantidade de filmes que deseja assistir");
        quantidadeFilmes = in.nextInt();

        System.out.println("Digite quantas horas tem cada filme");
        duracaoFilmes = in.nextDouble();

        double fdouble = new Double(quantidadeFilmes);

        //===========CONVERSÃO=============

        resultado = quantidadeFilmes * duracaoFilmes;
        horas = (double) quantidadeFilmes;

        if(horas <= 4){
            classificacao = "Maratona Leve";
        }else if(horas  <= 8){
            classificacao = "Maratona Moderada";
        }else {
            classificacao = "Maratona Épica";
        }


        //==============SAÍDA===============

        System.out.println();
        System.out.println("====================================");
        System.out.println("GERENCIADOR DE MARATONA DE FILMES");
        System.out.println("====================================");
        System.out.println();

        System.out.println("Informações da Maratona:");
        System.out.println();

        System.out.println("Usuário: "+usuario);

        System.out.println("Filmes planejados: "+quantidadeFilmes);
        
        System.out.println("Duração média por filme: "+duracaoFilmes);

        System.out.println();

        System.out.println("Cálculos:");
        System.out.println();

        System.out.println("Tempo total: " + resultado + " horas");

        System.out.println("Classificação: "+classificacao);

       


    }
    
}
