package testeIr;

import java.util.Scanner;

public class TesteIR {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Digite o salário");
		double salario = s.nextDouble();
		if (salario >= 1900.0 && salario <= 2800.0) {
			System.out.println("O IR é de 7.5% é pode deduzir na declaração o valor de R$142,00");
		} else if (salario >= 2800.1 && salario <= 3751.0) {
			System.out.println("O IR é de 15% é pode deduzir R$ 350");
		} else if (salario >= 3751.01 && salario <= 4664.00) {
			System.out.println("O IR é de 22.5% e pode deduzir R$ 636");
		}
	}

}
