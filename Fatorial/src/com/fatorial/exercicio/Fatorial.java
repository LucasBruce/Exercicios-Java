package com.fatorial.exercicio;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[]args) {
    	Scanner scan = new Scanner(System.in);
    	int fat = 0, val = 1;
    	
    	System.out.println("Entre com o valor do fatorial:");
    	fat = scan.nextInt();
    	
    	for(int i = 2; i <= fat; i++) {    		  			
    			val *= i;
    	}
    	System.out.print(fat+"! = ");
    	for(int i = 1; i <= fat; i++) {
    		if(i == fat) {
    			System.out.print(i+" = "+val);
    		}else {
    		
    		    System.out.print(i+" * ");
    		}
    	}
    }
}
