package br.com.alura.threads;

public class Principal {

	public static void main(String[] args) {

		String nome = "Max";

		String arquivo1 = "assinaturas1.txt";
		String arquivo2 = "assinaturas2.txt";
		String arquivo3 = "autores.txt";

		Thread threadAssinaturas1 = new Thread(new TarefaBuscaTextual(arquivo1, nome));
		Thread threadAssinaturas2 = new Thread(new TarefaBuscaTextual(arquivo2, nome));
		Thread threadAutores = new Thread(new TarefaBuscaTextual(arquivo3, nome));

		threadAssinaturas1.start();
		threadAssinaturas2.start();
		threadAutores.start();
	}
}
