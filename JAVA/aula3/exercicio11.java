 //Escreva um método void imprimirLinha() que imprima 20 hifens. Chame-o.

package aula3;

public class exercicio11 {

    public static void imprimelinha(){
        System.out.println("Entrei no metodo imprimelinha");

    }

      public static void vinteLinhas(int contador) {
        if (contador == 0) {
            return; // condição de parada
        }
        imprimelinha();
        vinteLinhas(contador - 1);
    }

    public static void main(String[] args) {
        System.out.println("Começo");
        vinteLinhas(20);
        System.out.println("Final");
    }
}
    
