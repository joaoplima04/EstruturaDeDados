
public class Arvore {
	// Propriedades da classe
	private No raiz = null;
	
	// Métodos da classe
	
	private int getAlturaDoNo(No objNo) {
		if (objNo == null) {
			return 0;
		}
		return objNo.getAltura();
	}
	
	private int getMaximoEntreDoisNumeros(int a, int b) {
		return (a > b) ? a : b;
	}
	
	private int getBalanco(No objNo) {
		if (objNo == null) {
			return 0;
		} 
		return (getAlturaDoNo(objNo.getEsquerda()) - getAlturaDoNo(objNo.getDireita()));
	}
	
	private No rotacionarEsquerda(No pai) {
		// Correção dos ponteiros
		No filho = pai.getDireita();
		pai.setDireita(filho.getEsquerda());
		filho.setEsquerda(pai);
		
		// Correção das alturas
		pai.setAltura(getMaximoEntreDoisNumeros(getAlturaDoNo(pai.getEsquerda()), getAlturaDoNo(pai.getDireita())) + 1);
		filho.setAltura(getMaximoEntreDoisNumeros(getAlturaDoNo(filho.getEsquerda()), getAlturaDoNo(filho.getDireita())) + 1);
		return filho;
	}
	
	private No rotacionarDireita(No pai) {
		// Correção dos ponteiros
		No filho = pai.getEsquerda();
		pai.setEsquerda(filho.getDireita());
		filho.setDireita(pai);
		
		// Correção das alturas
		pai.setAltura(getMaximoEntreDoisNumeros(getAlturaDoNo(pai.getEsquerda()), getAlturaDoNo(pai.getDireita())) + 1);
		filho.setAltura(getMaximoEntreDoisNumeros(getAlturaDoNo(filho.getEsquerda()), getAlturaDoNo(filho.getDireita())) + 1);
		return filho;
	}
	
	public void inserir (int numero) {
		raiz = inserir(raiz, numero);
	}
	
	private No inserir(No raiz, int numero) {
		// Caso fácil: árvore vazia
		if (raiz == null) {
			return new No(numero, 1, null, null); 
		}
		// Caso difícil: árvore NÃO vazia
		if (raiz.getNumero() > numero) {
			raiz.setEsquerda(inserir(raiz.getEsquerda(), numero));
		} else {
			raiz.setDireita(inserir(raiz.getDireita(), numero));
		}
		
		// Balanceamento
		raiz.setAltura(1 + getMaximoEntreDoisNumeros(getAlturaDoNo(raiz.getEsquerda()), getAlturaDoNo(raiz.getDireita())));
		
		int balanco = getBalanco(raiz);
		
		// Árvore inclinada à esquerda, inserir número menor
		if ((balanco > 1) && (numero < raiz.getEsquerda().getNumero())) {
			raiz = rotacionarDireita(raiz);
		}
		
		// Árvore inclinada à direita, inserir número maior
		if ((balanco < -1) && (numero > raiz.getDireita().getNumero())) {
			raiz = rotacionarEsquerda(raiz);
		}
		// Árvore inclinada à esquerda, inserir numero maior
		if ((balanco > 1) && (numero > raiz.getEsquerda().getNumero())) {
			raiz.setEsquerda(rotacionarEsquerda(raiz.getEsquerda()));
			raiz = rotacionarDireita(raiz);
		}
		// Árvore inclinada à direita, inserir número menor
		if ((balanco < -1) && (numero < raiz.getDireita().getNumero())) {
			raiz.setDireita(rotacionarDireita(raiz.getDireita()));
			raiz = rotacionarEsquerda(raiz);
		}
		return raiz;
	}
	
	public void imprimir() {
		imprimir(raiz, "");
	}
	
	private void imprimir(No raiz, String identacao) {
		if (raiz == null) {
			return;
		}
		System.out.println(identacao + raiz.getNumero());
		identacao += "---";
		imprimir(raiz.getEsquerda(), identacao);
		imprimir(raiz.getDireita(), identacao);
	}
	
	
}
