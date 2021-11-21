package pilhaEncadeada;

public class No {

	private Object elemento;
	private No proximo;

	public No() {
		this(null, null);
	}

	public No(Object numero, No contador) {
		elemento = numero;
		proximo = contador;
	}

	public Object retElemento() {
		return elemento;
	}

	public No retProx() {
		return proximo;
	}

	public void posElemento(Object novoElemento) {
		elemento = novoElemento;
	}

	public void posProx(No novoNo) {
		proximo = novoNo;
	}

	@Override

	public String toString() {
		return "O elemento é: "+elemento
				+"O prórximo é: "+proximo;
	}

}