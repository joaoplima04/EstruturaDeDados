package aula2;

public class No {
    private int valor;  // O valor armazenado no nó
    private No proximo; // Referência para o próximo nó na lista

    // Construtor
    public No(int valor, No proximo) {
        this.valor = valor;
        this.proximo = proximo;
    }

	public No() {
		super();
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public No getProximo() {
		return proximo;
	}

	public void setProximo(No proximo) {
		this.proximo = proximo;
	}
    


}
