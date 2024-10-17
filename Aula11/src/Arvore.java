
public class Arvore {
	// Propriedades da classe
	private No raiz = null;
	
	// Métodos da classe
	private boolean vermelho(No objNo) {
		if (objNo == null) {
			return false;
		}
		return objNo.isVermelho();
	}
	
	private No rotacaoEsquerda(No pai) {
		// Correção dos ponteiros
		No filho = pai.getDireita();
		pai.setDireita(filho.getEsquerda());
		filho.setEsquerda(pai);
		// Correção das cores
		filho.setVermelho(pai.isVermelho());
		pai.setVermelho(true);
		// Retorno do filho que virou pai
		return filho;
	}
	
	private No rotacaoDireita(No pai) {
		// Correção dos ponteiros
		No filho = pai.getEsquerda();
		pai.setEsquerda(filho.getDireita());
		filho.setDireita(pai);
		// Correção das cores
		filho.setVermelho(pai.isVermelho());
		pai.setVermelho(true);
		// Retorno do filho que virou pai
		return filho;
	}
	
	private void subirVermelho(No pai) {
		pai.setVermelho(true);
		pai.getEsquerda().setVermelho(false);
		pai.getDireita().setVermelho(false);
	}
	
	public void inserir(int numero) {
		raiz = inserir(raiz, numero);
	}
	
	private No inserir(No raiz, int numero) {
		// Caso fácil: árvore vazia
		if (raiz == null) {
			return new No(numero, true, null, null);
		}
		
		// Caso difícil: árvore NÃO vazia
		if (raiz.getNumero() > numero) {
			raiz.setEsquerda(inserir(raiz.getEsquerda(), numero));
		} else {
			raiz.setDireita(inserir(raiz.getDireita(), numero));
		}
		
		// Correção do balanceamento da árvore
		if (! vermelho(raiz.getEsquerda()) && vermelho(raiz.getDireita())) {
			raiz = rotacaoEsquerda(raiz);
		}
		if (vermelho(raiz.getEsquerda()) && vermelho(raiz.getEsquerda().getEsquerda()) ) {
			raiz = rotacaoDireita(raiz);
		}
		if (vermelho(raiz.getEsquerda()) && vermelho(raiz.getDireita())) {
			subirVermelho(raiz);
		}
		return raiz;
	}
	
	public void imprimir() {
		imprimir(raiz, "");
	}
	
	private void imprimir (No raiz, String identacao) {
		if (raiz == null) {
			return;
		}
		
		System.out.println(identacao + raiz.getNumero() + (raiz.isVermelho() ? " (V)" : " (P)"));
		
		imprimir(raiz.getEsquerda(), identacao + "---");
		imprimir(raiz.getDireita(), identacao + "---");
		
	}
}
