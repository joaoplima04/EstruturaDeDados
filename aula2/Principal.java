package aula2;

public class Principal {
	public static void main(String[] args) {
		Lista objLista = new Lista();
		Lista objExcluir = new Lista();
		
		objLista.inserir(1);
		objLista.inserir(2);
		objLista.inserir(3);
		objLista.inserir(4);
		objLista.inserir(5);
		
		objExcluir.inserir(1);
		objExcluir.inserir(3);
		objExcluir.inserir(5);
		objExcluir.inserir(100);
		
		objLista.remover(objExcluir);
		
		objLista.imprimir();
	}
}
	