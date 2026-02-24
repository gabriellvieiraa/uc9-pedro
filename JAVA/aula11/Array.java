package aula11;

public class Array {

    public static void printArray(int[] a){

        //escrever o método que passado um array int unidimensional
        //o método imprime os valores de cada endereço do array

        //bidimensional
        

        //for (int v : a){
        //    System.out.println(v);
        //}

       
        //for(int z = 0; z < a.length; z++){
        //System.out.println(a[z]);

       // }
    }

    public static void main(String[] args) {

        //inicialização dos vetors:

        int[] counts; // um array ou vetor de int
        double[] values; // um array ou vetor de double
        int size = 10;

        //criação dos vetores:

        counts = new int[4]; // hard array, tamanho fixo
        values = new double[size]; // array com tamanho variável

        // inicialização com atribuição de valores
        int[] a = {1, 2, 3, 4};
        int[] b = {1, 2, 3, 4, 5};


        printArray(b);

        counts[0] = 7;
        counts[1] = counts[0] * 2;
        counts[2]++;
        counts[3] -= 60;

        int i = 0;

        // for(int z = 0; z <= 3;z++){
          //  System.out.println(a[z]);
        
            
        }

    }
    

