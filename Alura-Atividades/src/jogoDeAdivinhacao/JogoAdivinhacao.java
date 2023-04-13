package jogoDeAdivinhacao;

import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Integer numeroSorteado = 0;
		Integer numeroDigitado = 0;
		Integer numeroTentativas = 0;
		numeroSorteado = new Random().nextInt(100);
		System.out.println(numeroSorteado);
		System.out.println(
				"""

									Tente adivinhar qual numero foi sorteado!

									Você tem 5 tentativas
						--------------------------------------------------------------------------------------------------------------------------------------

											""");
		while (numeroTentativas < 5) {
			numeroTentativas++;
			numeroDigitado = s.nextInt();

			if (numeroSorteado > numeroDigitado) {
				System.out.println("O número digitado é menor que o número gerado.");
			} else if (numeroSorteado < numeroDigitado) {
				System.out.println("O número digitado é maior que o número gerado.");
			}
			if (numeroDigitado == numeroTentativas) {

				System.out.println(
						"""

											Você não acertou nenhum numero!
											Tente novamente :)
								---------------------------------------------------------------------------------------------------------------------------------------

								""");
			} else if (numeroSorteado == numeroDigitado) {

				System.out.println("Você acertou! o numero soeteado é " + numeroSorteado + " e o numero digitado foi: "
						+ numeroDigitado);
				break;
			}

		}
	}

}
