package br.com.alura.threads.exs01;

public class Print {

	public static void main(String[] args) {

		Runnable tPrint = new TarefaPrint("Mamma Mia!");
		Thread threadPrint = new Thread(tPrint);
		threadPrint.start();
	}
}
