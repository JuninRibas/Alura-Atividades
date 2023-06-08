package br.com.alura.screenmatch;

import br.com.alura.screnmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screnmatch.calculos.FiltroDeRecomendação;

public class Principal {
	

	public static void main(String[] args) {
		
		Filme filme = new Filme();
		Serie serie = new Serie();
		
	
		
		serie.setNome("lost");
		serie.setAnoDeLancamento(2000);
		serie.avalia(9);
		serie.avalia(7);
		serie.avalia(8);
		serie.mediaAvaliacao();
		serie.setTemporadas(5);
		serie.setEpisodiosPorTemporada(10);
		serie.setMinutosPorEpisodio(50);
		serie.exibiFichaTecnica();
		System.out.println("Media das avaliações: "+ serie.mediaAvaliacao());
		System.out.println("Total de  avaliações "+serie.geTotalDeAvaliacao());
		System.out.println("Duração para maratonar Lost: "+serie.getDuracaoEmMinutos());
		
		
		System.out.println("");
		filme.setNome("Top Gun");
		filme.setAnoDeLancamento(1990);
		filme.avalia(10);
		filme.avalia(5);
		filme.avalia(8);
		filme.setDuracaoEmMinutos(180);
		filme.exibiFichaTecnica();
		filme.mediaAvaliacao();
		
		System.out.println("Duração do filme em minutos: "+filme.getDuracaoEmMinutos());
		System.out.println(serie.mediaAvaliacao());
		System.out.println("Total de  avaliações "+filme.geTotalDeAvaliacao());
		
		System.out.println("");
		
		Filme outroFilme = new Filme();
		outroFilme.setNome("Tropa de Elite");
		outroFilme.setAnoDeLancamento(2003);
		outroFilme.avalia(10);
		outroFilme.avalia(8);
		outroFilme.avalia(8);
		outroFilme.setDuracaoEmMinutos(200);
		
		System.out.println("Nome do filme: "+outroFilme.getNome());
		System.out.println("Duração do filme em minutos: "+outroFilme.getDuracaoEmMinutos());
		System.out.println(outroFilme.mediaAvaliacao());
		System.out.println("Total de  avaliações "+outroFilme.geTotalDeAvaliacao());
		
		CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
		calculadora.inclue(filme);
		calculadora.inclue(outroFilme);
		System.out.println("");
		System.out.println("Tempo total dos filmes "+calculadora.getTempoTotal());
		System.out.println("");
		
		
		FiltroDeRecomendação filtro = new FiltroDeRecomendação();
		filtro.filtra(filme);
		
		Episodio episodio = new Episodio();
		episodio.setNumero(1);
		episodio.setSerie(serie);
		episodio.setTotalVisualizacoes(300);
		System.out.println("");
		
		filtro.filtra(episodio);
		
	}

}
