package br.com.alura.screnmatch.calculos;

import br.com.alura.screenmatch.Filme;

public class CalculadoraDeTempo {
	
	private int tempoTotal;

	public int getTempoTotal() {
		return tempoTotal;
	}
	
	public void inclue(Filme f) {
		tempoTotal += f.getDuracaoEmMinutos();
	}
	
}
