package br.com.alura.threads.exs;

public class ImprimeNumeros implements Runnable {

	private int quantidade;

	public ImprimeNumeros(int quantidade) {
		this.quantidade = quantidade;
	}

	@Override
	public void run() {
		for (int i = 0; i <= quantidade; i++) {
			Thread threadAtual = Thread.currentThread();
			System.out.println(threadAtual + " - " + i);
		}
	}
}
