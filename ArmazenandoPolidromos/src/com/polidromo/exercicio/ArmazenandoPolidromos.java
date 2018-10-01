package com.polidromo.exercicio;

/*armazenando numeros, o primeiro elemento do vetorA sera
 * o ultimo elemento do vetorB e assim por diante*/
import java.util.Scanner;

public class ArmazenandoPolidromos {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Entre com o valor na posicao[" + (1 + i) + "]");
            vetorA[i] = scan.nextInt();

            vetorB[vetorA.length - 1 - i] = vetorA[i];
        }

        System.out.print("vetorA = ");
        for (int vetor : vetorA) {
            System.out.print(vetor + " ");
        }

        System.out.println();

        System.out.print("vetorB = ");
        for (int vetor : vetorB) {
            System.out.print(vetor + " ");
        }

    }

}
