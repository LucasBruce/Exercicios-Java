package com.polindromo.exercicio;

import java.util.Scanner;

public class Polidromo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] vetorA = new int[10];
		boolean polindromo = true;

		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Entre com o valor na posicao [" + (1 + i) + "]");
			vetorA[i] = scan.nextInt();
		}

		polindromo = true;
		for (int i = 0; i < (vetorA.length / 2); i++) {
			if (vetorA[i] != vetorA[vetorA.length - 1 - i]) {
				polindromo = false;
				break;
			}
		}
		System.out.print("vetorA = ");
		for (int vetA: vetorA) {
			System.out.print(vetA + " ");
		}

		System.out.println();

		if (polindromo) {
			System.out.println("Polindromo!");
		} else {
			System.out.println("Nao e polindromo!");
		}
	}
}
