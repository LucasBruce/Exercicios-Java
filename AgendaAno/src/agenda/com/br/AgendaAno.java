package agenda.com.br;

import java.util.Scanner;

public class AgendaAno {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        int meses=0, dias=0, horas=0, entrada=0;
		
		System.out.println("Entre com os meses do ano:");
		meses = scan.nextInt();
		
		String[][][] mesesDiasHoras = new String[meses][][];
		
		System.out.println("Entre com os dias do mês:");
		dias = scan.nextInt();
		
		mesesDiasHoras = new String[meses][dias][];
		
		System.out.println("Entre com as horas do dia:");
		horas = scan.nextInt();
		
		mesesDiasHoras = new String[meses][dias][horas];
		
		do {
			System.out.println("Digite <1> para alterar mes, dia e hora.");
			System.out.println("Digite <2> para visualizar a agenda.");
			System.out.println("Digite <3> para sair do programa.");
			
			entrada = scan.nextInt();
			
			if(entrada == 1) {
				System.out.println("Informe o mes:");
				meses = scan.nextInt();
				System.out.println("Informe o dia:");
				dias = scan.nextInt();
				System.out.println("Informe a hora:");
				horas = scan.nextInt();
				
				label:for(int i=0; i<mesesDiasHoras.length; i++) {
        			for(int j=0; j<mesesDiasHoras[i].length; j++) {
        				for(int k=0; k<mesesDiasHoras[i][j].length; k++) {
        					if((i == meses) && (j == dias) && (k == horas)) {
        						System.out.println("Informe o compromisso:");
        						mesesDiasHoras[i][j][k] = scan.next();
        						break label;
							}
						}
					}
				}
			}else if(entrada == 2) {
				System.out.println("Informe o mes do compromisso:");
				meses = scan.nextInt();
				System.out.println("Informe o dia do compromisso:");
				dias = scan.nextInt();
				System.out.println("Informe a hora do compromisso:");
				horas = scan.nextInt();
				
				label1:for(int i=0; i<mesesDiasHoras.length; i++) {
        			for(int j=0; j<mesesDiasHoras[i].length; j++) {
        				for(int k=0; k<mesesDiasHoras[i][j].length; k++) {
        					if((i == meses) && (j == dias) && (k == horas)) {
        						System.out.println("No mês "+i+" dia "+j+" "
        					    +mesesDiasHoras[i][j][k]+" as "+k+"h");
        						break label1;
							}
						}
					}
				}
			}
		}while(entrada != 3);
		System.out.println("Programa Finalizado...");
	}
}
