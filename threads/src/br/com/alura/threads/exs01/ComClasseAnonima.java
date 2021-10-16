package br.com.alura.threads.exs01;

public class ComClasseAnonima {

	public static void main(String[] args) {

		new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("Mamma mia!");
			}
		}).start();
		
	}

}
