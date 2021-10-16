package br.com.alura.lista;

public class Lista {

	private String[] elementos = new String[1000];
	private int indice = 0;

	public synchronized void adicionaElemento(String elemento) {
		this.elementos[indice] = elemento;
		this.indice++;
		
		try {
			Thread.sleep(5);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		if (this.estaCheia()) {
			System.out.println("Lista cheia. Notificando...");
			this.notify();
		}
	}
	
	public boolean estaCheia() {
		return this.indice == this.elementos.length;
	}

	public int tamanho() {
		return this.elementos.length;
	}

	public String pegaElemento(int indice) {
		return this.elementos[indice];
	}
}
