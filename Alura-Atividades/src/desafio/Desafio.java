package desafio;

import java.util.Scanner;

public class Desafio {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String nome;
		String tipoConta;
		Double saldo;
		Double transferir;
		Double receber;
		int opcao = 0;

		System.out.println("*******************************************");
		System.out.println("\nBem vindo ao Banco Java Virtual");
		System.out.println("\nDigite o nome do cliente:  ");
		nome = s.nextLine();
		System.out.println("Digite o tipo de conta do cliente: ");
		tipoConta = s.nextLine();
		System.out.println("Digite o saldo inicial do cliente: ");
		saldo = s.nextDouble();
		System.out.println("\nNome do cliente: " + nome);
		System.out.println("Tipo de conta: " + tipoConta);
		System.out.println("Saldo do cliente: R$" + saldo);
		System.out.println("\n*******************************************");

		String menu = """

				DIGITE UMA OPÇÃO!
				1 - Consultar saldo
				2 - Trasnferir
				3 - Receber
				4 - SAIR

				""";

		while (opcao != 4) {
			System.out.println(menu);
			opcao = s.nextInt();
			if (opcao == 1) {
				System.out.println("Seu saldo é de: " + saldo);
			}
			if (opcao == 2) {
				System.out.println("Quanto desejar transferir?");
				transferir = s.nextDouble();
				if (saldo < transferir) {
					System.out.println("Saldo insuficiente!!");
				} else {

					saldo -= transferir;
					System.out.println("\nTransação realizada com sucesso!");
				}

			}
			if (opcao == 3) {
				System.out.println("Quanto desejar receber?");
				receber = s.nextDouble();
				if (receber < 0) {
					System.out.println("\nNão é possivel faze este tipo de transação!!");
				} else {
					saldo += receber;
					System.out.println("Recebido com sucesso!");

				}
			} else if (opcao != 4) {
				System.out.println("Opção inválida!");
			}
		}
		System.out.println("\nObrigado por Utilizar o Banco Java Virtual");
		System.out.println("\n*******************************************");
	}

}
