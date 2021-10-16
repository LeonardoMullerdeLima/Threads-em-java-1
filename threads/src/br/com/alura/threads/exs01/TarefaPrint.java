package br.com.alura.threads.exs01;

public class TarefaPrint implements Runnable {
	
	private String toPrint;
	
	public TarefaPrint(String string) {
		this.toPrint = string;
	}

	@Override
	public void run() {
		System.out.println(this.toPrint);
	}
}
