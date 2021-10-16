package br.com.alura.threads;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TarefaBuscaTextual implements Runnable {
	
	private String nome;
	private String arquivo;

	public TarefaBuscaTextual(String arquivo, String nome) {
		this.nome = nome;
		this.arquivo = arquivo;
	}

	@Override
	public void run() {
		try {
			Scanner scanner = new Scanner(new File(this.arquivo));
			
			int numeroLinha = 1;
			
			while (scanner.hasNextLine()) {
				String linha = scanner.nextLine();
				
				if (linha.toLowerCase().contains(this.nome.toLowerCase())) {
					System.out.println(String.format("%s - %d - %s", this.arquivo, numeroLinha, linha));
				}
				
				numeroLinha++;
			}
			
			scanner.close();
		} catch (FileNotFoundException e) {
			throw new RuntimeException(e);
		}
	}
}
