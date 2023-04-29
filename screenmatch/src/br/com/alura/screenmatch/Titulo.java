package br.com.alura.screenmatch;

public class Titulo {
	private String nome;
	private int anoDeLancamento;
	private boolean incluindoNoPlano;
	private double somaDasAvaliacao;
	private double totalDeAvaliacao;
	private int duracaoEmMinutos;
	
	public int geTotalDeAvaliacao() {
		return (int) totalDeAvaliacao;
	}
	
	
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getAnoDeLancamento() {
		return anoDeLancamento;
	}


	public void setAnoDeLancamento(int anoDeLancamento) {
		this.anoDeLancamento = anoDeLancamento;
	}


	public boolean isIncluindoNoPlano() {
		return incluindoNoPlano;
	}


	public void setIncluindoNoPlano(boolean incluindoNoPlano) {
		this.incluindoNoPlano = incluindoNoPlano;
	}


	public int getDuracaoEmMinutos() {
		return duracaoEmMinutos;
	}


	public void setDuracaoEmMinutos(int duracaoEmMinutos) {
		this.duracaoEmMinutos = duracaoEmMinutos;
	}


	public void exibiFichaTecnica() {
		System.out.println("Nome: " + nome);
		System.out.println("Ano de lançamento: " + anoDeLancamento);

		System.out.println("");

	}

	public void avalia(double nota) {
		somaDasAvaliacao += nota;
		totalDeAvaliacao++;
	}
	public Double mediaAvaliacao() {
		return somaDasAvaliacao/totalDeAvaliacao;
	}

}
