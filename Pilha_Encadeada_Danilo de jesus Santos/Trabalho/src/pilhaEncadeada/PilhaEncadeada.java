package pilhaEncadeada;

public class PilhaEncadeada {
	private No topo;
	private int tamanho;

	public PilhaEncadeada() {
		topo = null;
		tamanho = 0;
	}

	public int tamanho() {
		return tamanho;
	}

	
	public boolean vazia() {
		return (topo == null);
	}
	
	
// método para empilhar
	public void empilha(Object elemento) {
		No num = new No();
		num.posElemento(elemento);
		num.posProx(topo);
		topo = num;
		tamanho++;
	}
	
	
	
// método para desempilhar
	public Object desempilha() {
		Object contador = topo.retElemento();
		topo = topo.retProx();
		tamanho--;
		return contador;
	}

	
	

	public Object topo() {
		return topo.retElemento();
	}

	
	public String toString() {
		return "O top é: "+topo;
	}

}
