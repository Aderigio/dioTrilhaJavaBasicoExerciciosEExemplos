package Entidades;

import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
	public static void main(String[] args) {
		// criando o objeto scanner

		// Novo Scanner e uso do Locale para padrão de ponto em vez de virgula
		Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

		// Entrada de uma String pelo Scanner
		System.out.println("Digite seu nome");
		String nome = scanner.next();

		System.out.println("Digite seu sobrenome");
		String sobrenome = scanner.next();

		// Entrada de uma int pelo Scanner
		System.out.println("Digite sua idade");
		int idade = scanner.nextInt();

		// Entrada de um double pelo Scanner
		System.out.println("Digite sua altura");
		double altura = scanner.nextDouble();

		// imprimindo os dados obtidos pelo usuario

		System.out.println("Ola, me chamo " + nome + " " + sobrenome);
		System.out.println("Tenho " + idade + " anos ");
		System.out.println("Minha altura é " + altura + "cm ");

	}
}
