package br.com.alura.screnmatch.calculos;

public class FiltroDeRecomendação {
	
	public void filtra(IClassificavel classificavel) {
		if(classificavel.getClassificacao()>=4) {
			System.out.println("Está entre os prefereidos do momento");
		}else if(classificavel.getClassificacao()>=2){
			System.out.println("Muito bem avaliado no momento!");
		}else {
			System.out.println("Coloque na sua lista para assistir depois");
		}
	}
		
}
