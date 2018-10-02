package com.operador.exercicio;

import java.util.Scanner;

public class Ternario_Par_Impar {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length];
        
        for(int i = 0; i<vetorA.length; i++) {
        	System.out.println("Entre com o valor na posicao["+(1+i)+"]");
        	vetorA[i] = scan.nextInt();
        	
        	vetorB[i] = (vetorA[i] % 2 == 0)? 1 : 0;
        }
        
        System.out.print("vetorA = ");
        for(int vetA: vetorA) {
        	System.out.print(vetA+" ");
        }
        
        System.out.println();
        
        System.out.print("vetorB = ");
        for(int vetB: vetorB) {
        	System.out.print(vetB+" ");
        }
		
	}

}
