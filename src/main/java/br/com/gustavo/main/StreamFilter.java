package br.com.gustavo.main;

import java.util.List;

public class StreamFilter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Pessoa> lista =  new Pessoa().Info();
		
		lista.stream()
				.filter(pessoa -> pessoa.getSexo().equals("feminino"))
				.forEach(p -> System.out.println(p.getNome()));
				
	}
}
