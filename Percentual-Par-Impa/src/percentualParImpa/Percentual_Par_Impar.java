package percentualParImpa;

import java.util.Scanner;

public class Percentual_Par_Impar {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] numeros = new int[10];
		int par = 0, impar = 0;
		double percPar = 0, percImpar = 0;
		
		for(int i = 0; i < numeros.length; i++) {
			System.out.println("Entre com o numero na posicao["+(i+1)+"]");
			numeros[i] = scan.nextInt();
		}
		for(int i = 0; i < numeros.length; i++) {
			if(numeros[i] % 2 == 0) {
				par++;
			}
		}
		impar = par - numeros.length;
		
		/* Regra de tres simples
		 * 
		 * numeros ------ 100%
		 *     par ------ X
		 * 
		 * percPar = (par * 100)/numeros
		 * */
		
		percPar = (par * 100)/numeros.length;
        percImpar = percPar - 100;
        
        System.out.print("Numeros = ");
        for(int i = 0; i < numeros.length; i++) {
        	System.out.print(numeros[i]+" ");
        }
        
        System.out.println();
        
        System.out.println("Percentual de par = "+percPar+"%");
        System.out.println("Percentual de impar = "+percImpar+"%");
	}

}
