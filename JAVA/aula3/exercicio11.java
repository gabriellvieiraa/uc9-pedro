 //Escreva um método void imprimirLinha() que imprima 20 hifens. Chame-o.

package aula3;

public class exercicio11 {

    public static void imprimelinha(){
        System.out.println("Entrei no metodo imprimelinha");

    }

     public static void tresLinhas(){
        imprimelinha();
        imprimelinha();
        imprimelinha();

    }
    public static void main(String[] args) {
        System.out.println("Primeira linha");
        tresLinhas();
        System.out.println("Segunda linha");
    }
}
    
