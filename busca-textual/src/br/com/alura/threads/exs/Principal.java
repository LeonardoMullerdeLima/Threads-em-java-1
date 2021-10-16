package br.com.alura.threads.exs;

public class Principal {

	public static void main(String[] args) {
		
		int quantidade = 1000;

		new Thread(new ImprimeNumeros(quantidade)).start();
		new Thread(new ImprimeNumeros(quantidade)).start();
	}
}
