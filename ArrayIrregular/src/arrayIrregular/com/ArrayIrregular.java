package arrayIrregular.com;

import java.util.Scanner;

public class ArrayIrregular {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        int numEntrevistados=0, numFilhos=0;
		
		System.out.println("Entre com o número de entrevistados:");
		numEntrevistados = scan.nextInt();
		
		String[][] nomesFilhos = new String[numEntrevistados][];
		
		for(int i=0; i<nomesFilhos.length; i++) {
			System.out.println("Entre com o número de filhos:");
			numFilhos = scan.nextInt();
			
			nomesFilhos[i] = new String[numFilhos];
			for(int j=0; j<nomesFilhos[i].length; j++) {
				System.out.println("Digite o nome do filho "+(1+j));
				nomesFilhos[i][j] = scan.next();
			}
		}
		for(int i=0; i<nomesFilhos.length; i++) {
			System.out.println("Pessoa "+(1+i)+" tem "+nomesFilhos[i].length+" filhos");
			
			for(int j=0; j<nomesFilhos[i].length; j++) {
				System.out.println(nomesFilhos[i][j]);
			}
		}
	}

}
