package br.com.alura.lista;

public class TarefaAdicionaElemento implements Runnable {

	private Lista lista;
	private int numeroDaThread;

	public TarefaAdicionaElemento(Lista lista2, int numeroDaThread) {
		this.lista = lista2;
		this.numeroDaThread = numeroDaThread;
	}

	@Override
	public void run() {
		
		for (int i = 0; i < 100; i++) {
			this.lista.adicionaElemento("Thread " + this.numeroDaThread + " - " + i);
		}
	}
}
