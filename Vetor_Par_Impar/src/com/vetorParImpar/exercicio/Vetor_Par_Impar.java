package com.vetorParImpar.exercicio;

import java.util.Scanner;

public class Vetor_Par_Impar {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] vetorA = new int[20];
		int[] vetorB = new int[vetorA.length - 10];
		int[] vetorC = new int[vetorA.length - 10];
		int posB=0, posC=0;
		
       for(int i = 0; i<vetorA.length; i++) {
    	   System.out.println("Entre com os numeros na posicao["+(1+i)+"]");
    	   vetorA[i] = scan.nextInt();
       }
       for(int i=0; i<vetorA.length; i++) {
    	   if(vetorA[i] % 2 == 0) {
    		   vetorB[posB] = vetorA[i];
    		   posB++;
    	   }else {
    		   vetorC[posC] = vetorA[i];
    		   posC++;
    	   }
       }
       System.out.print("vetorA = ");
       for(int i = 0; i< vetorA.length; i++) {
    	   System.out.print(vetorA[i]+" ");
       }
       
       System.out.println();
       
       System.out.print("vetorB = ");
       for(int i = 0; i<vetorB.length; i++) {
    	   System.out.print(vetorB[i]+" ");
       }
       
       System.out.println();
       
       System.out.print("vetorC = ");
       for(int i = 0; i<vetorC.length; i++) {
    	   System.out.print(vetorC[i]+" ");
       }
	}

}
