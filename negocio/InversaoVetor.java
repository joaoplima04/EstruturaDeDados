package negocio;

import java.util.Scanner;

public class InversaoVetor {
	
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		int[] vetorOriginal = new int[5];
		int[] vetorInvertido = new int[5];
		
		for (int i = 0; i < vetorOriginal.length; i++) {
			System.out.println("vetorOriginal[" + i + "] = ");
			vetorOriginal[i] = leitor.nextInt();
		}
		leitor.close();
		
		for (int i = 0; i < vetorOriginal.length; i++) {
			vetorInvertido[vetorOriginal.length - 1 - i] = vetorOriginal[i];
		}
		
		for (int i = 0; i < vetorInvertido.length; i++) {
			System.out.println("VetorInvertido[" + i + "] = " + vetorInvertido[i]);
		}
	}
}
