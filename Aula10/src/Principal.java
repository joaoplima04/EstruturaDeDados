import java.util.Scanner;

public class Principal {
	public static final int TAMANHO = 10;
	
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		Arvore objArvore = new Arvore();
		
		for (int i = 0; i < TAMANHO; i++) {
			objArvore.inserir((int) (TAMANHO * Math.random()));
		}
		
		objArvore.navegarEmOrdem();
		
		while (true) {
			System.out.println("Digite um número: ");
			objArvore.procurar(leitor.nextInt());
		}
	}
}
