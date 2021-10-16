package br.com.alura.lista;

public class TarefaImprime implements Runnable {

	private Lista lista;

	public TarefaImprime(Lista lista) {
		this.lista = lista;
	}

	@Override
	public void run() {

		synchronized (lista) {
			if (!lista.estaCheia()) {
				try {
					System.out.println("Aguardando notificação...");
					lista.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}

			for (int i = 0; i < lista.tamanho(); i++) {
				System.out.println(i + " - " + lista.pegaElemento(i));
			}
		}
	}
}
