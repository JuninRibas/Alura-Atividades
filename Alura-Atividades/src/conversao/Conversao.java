package conversao;

import java.util.Scanner;

public class Conversao {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Digite a temperatura em graus Celsius:");
		
		Double temperatura = s.nextDouble();
		Double fahrenheit = (temperatura * 1.8) + 32;
		
		System.out.println("A temperatura em Fahrenheit é: "+fahrenheit);
	}

}
