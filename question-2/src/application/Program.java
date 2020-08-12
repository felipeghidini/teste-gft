package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Pessoa pessoa = new Pessoa();
		
		System.out.print("Digite o nome da pessoa: ");
		String nome = sc.nextLine();
		pessoa.setNome(nome);
		System.out.print("Digite o endereço: ");
		String endereco = sc.next();
		pessoa.setEndereco(endereco);
		System.out.print("Digite o telefone: ");
		Double telefone = sc.nextDouble();
		pessoa.setTelefone(telefone);
		
		System.out.println(pessoa.toString());
		
		sc.close();
	}

}
