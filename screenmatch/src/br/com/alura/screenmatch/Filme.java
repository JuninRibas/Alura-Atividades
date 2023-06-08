package br.com.alura.screenmatch;

import br.com.alura.screnmatch.calculos.IClassificavel;

public class Filme extends Titulo implements IClassificavel{

	private String diretor;

	public String getDiretor() {
		return diretor;
	}

	public void setDiretor(String diretor) {
		this.diretor = diretor;
	}

	@Override
	public int getClassificacao() {
		// TODO Auto-generated method stub
		return  (int) (mediaAvaliacao()/2);
	}

	

}
