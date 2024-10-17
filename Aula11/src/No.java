
public class No {
	// Propriedades da classe
	private int numero = 0;
	private boolean vermelho = true;       // vermelho: true    preto: false
	private No esquerda = null;
	private No direita = null;
	
	
	// Métodos construtores da classe
	public No() {
		super();
	}

	public No(int numero, boolean vermelho, No esquerda, No direita) {
		super();
		this.numero = numero;
		this.vermelho = vermelho;
		this.esquerda = esquerda;
		this.direita = direita;
	}
	
	// Métodos de acesso da classe
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public boolean isVermelho() {
		return vermelho;
	}

	public void setVermelho(boolean vermelho) {
		this.vermelho = vermelho;
	}

	public No getEsquerda() {
		return esquerda;
	}

	public void setEsquerda(No esquerda) {
		this.esquerda = esquerda;
	}

	public No getDireita() {
		return direita;
	}

	public void setDireita(No direita) {
		this.direita = direita;
	}
	
	
	
	
}
