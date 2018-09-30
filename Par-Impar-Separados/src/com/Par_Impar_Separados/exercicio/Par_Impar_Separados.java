package com.Par_Impar_Separados.exercicio;

import java.util.Scanner;

public class Par_Impar_Separados {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] vetorA = new int[20];
		int[] vetorB = new int[vetorA.length - 10];
		int[] vetorC = new int[vetorA.length - 10];
		int par = 0, impar = 0;

		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Entre com o valor na posicao[" + (1 + i) + ']');
			vetorA[i] = scan.nextInt();
		}

		for (int i = 0; i < vetorA.length; i++) {
			if (vetorA[i] % 2 == 0) {
				vetorB[par] = vetorA[i];
				par++;
			} else {
				vetorC[impar] = vetorA[i];
				impar++;
			}
		}
		System.out.print("vetorA = ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}

		System.out.println();

		System.out.print("vetorB pares -> ");
		for (int i = 0; i < vetorB.length; i++) {
			System.out.print(vetorB[i] + " ");
		}

		System.out.println();

		System.out.print("vetorC impares -> ");
		for (int i = 0; i < vetorC.length; i++) {
			System.out.print(vetorC[i] + " ");
		}
	}

}
