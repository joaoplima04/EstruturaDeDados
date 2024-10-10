
public class Arvore {
	// Propriedades da classe
	private No raiz = null;
	
	// Métodos da classe
	public void inserir (int numero) {
		raiz = inserir(raiz, numero);
	}
	
	private No inserir(No raiz, int numero) {
		if (raiz == null) {
			raiz = new No(numero, null, null);
			return raiz;
		}
		
		// Caso difícil: árvore NÃO vazia
		if (raiz.getNumero() > numero) {
			raiz.setEsquerda(inserir(raiz.getEsquerda(), numero));
		} else {
			raiz.setDireita(inserir(raiz.getDireita(), numero));
		}
		return raiz;
	}
	
	public void procurar(int numero) {
		procurar(raiz, numero);
	}
	
	private void procurar (No raiz, int numero) {
		// Cenário muito fácil: árvore vazia
		if (raiz == null) {
			System.out.println("Se fodeu!");
			return;
		}
		
		// Cenário fácil: deu sorte achou na raiz
		if (raiz.getNumero() == numero) {
			System.out.println("Parabéns !!! Achei !!!");
			return;
		}
		
		// Cenário difícil: não achou na raíz, continuar procurando
		if (raiz.getNumero() > numero) {
			procurar(raiz.getEsquerda(), numero);
		} else {
			procurar(raiz.getDireita(), numero);
		}
	}
	
	public void navegarEmOrdem() {
		System.out.print("Navegação EM-ORDEM: ");
		navegarEmOrdem(raiz);
		System.out.println();
	}
	
	private void navegarEmOrdem(raiz) {
		if (raiz == null) {
			return;
		}
		
		navegarEmOr
	}
}
