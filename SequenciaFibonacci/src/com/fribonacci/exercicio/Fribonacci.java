package com.fribonacci.exercicio;

import java.util.Scanner;

public class Fribonacci {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
       int n = 0, proximo = 0, primeiro = 1, segundo = 1;
       
       System.out.println("Entre com a quantidade da sequencia:");
       n = scan.nextInt();
       
       System.out.print(primeiro+" ");
       System.out.print(segundo+" ");
       
       for(int i = 3; i <= n; i++) {
    	   
    	   proximo = primeiro + segundo;
    	   primeiro = segundo;
    	   segundo = proximo;
    	   
    	   System.out.print(proximo+" ");
       }
	}

}
