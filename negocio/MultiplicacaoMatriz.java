package negocio;

import java.util.Scanner;

public class MultiplicacaoMatriz {
	
	private static void preenchendoMatriz(int[][] matriz) {
		Scanner leitor = new Scanner(System.in);
		
		for (int i = 0; i < matriz.length ; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				System.out.print("Digite a sua posição (" + i + ", " + j + "): ");
				
				matriz[i][j] = leitor.nextInt();
			}
		}
			
	}
	
	public static void main(String[] args) {
		int[][] operando1 = new int[2][3];
		int[][] operando2 = new int[3][2];
		int[][] resultado = new int[2][2];
		
		// Entrada de dados
		preenchendoMatriz(operando1);
		preenchendoMatriz(operando2);
		
		// Processamento
		for (int i = 0 ; i < resultado.length ; i++) {
			for (int j = 0; j < resultado[i].length ; j++) {
				for(int k = 0 ; k < operando2.length ; k++) {
					resultado [i][j] += (operando1[i][k] * operando2[k][j]);
				}
			}
		}
		for (int i = 0 ; i < resultado.length ; i++) {
			for (int j = 0; j < resultado[i].length ; j++) {
				System.out.print(resultado[i][j] + "\t");
			}
			System.out.println();
	}
}
}
