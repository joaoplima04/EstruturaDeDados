package aula2;

public class Lista {
	
	private No cabeca = null;
	
	public void inserir(int valor) {
		if (cabeca == null) {
			cabeca = new No(valor, null);
			return;
		}
		
		
		No novoNo = new No(valor, cabeca);
		cabeca = novoNo;
	}
	
	public void imprimir() {
		No ponteiro = cabeca;
		
		while (ponteiro != null) {
			System.out.println(ponteiro.getValor());
			ponteiro = ponteiro.getProximo();
		}
	}
	
	public void remover(int numero) {
		
		if (cabeca == null) {
			return;
		}
		
		// Primeiro
		
		if (cabeca.getValor() == numero) {
			cabeca = cabeca.getProximo();
			return;
		}
		
		No ponteiro = cabeca;
		
		while (ponteiro.getProximo() != null && ponteiro.getProximo().getValor() != numero) {
			ponteiro = ponteiro.getProximo();
		}
		if (ponteiro.getProximo() != null) {
			ponteiro.setProximo(ponteiro.getProximo().getProximo());
		} else {
			System.out.printf("O número não foi encontrado: ", numero);
		}
	}
	
	private No getPrimeiro() {
		return cabeca;
	}
	
	public void remover(Lista listaExcluir) {
		No ponteiro = listaExcluir.getPrimeiro();
		
		while (ponteiro != null) {
			remover(ponteiro.getValor());
			ponteiro = ponteiro.getProximo();
		}
	}

}
