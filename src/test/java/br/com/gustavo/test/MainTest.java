package br.com.gustavo.test;

import java.util.List;

import org.junit.Test;

import br.com.gustavo.main.Pessoa;

public class MainTest {

	@Test
	public void mainTest() {
		// TODO Auto-generated method stub
		
		List<Pessoa> lista =  new Pessoa().Info();
		
		lista.stream()
				.filter(pessoa -> pessoa.getSexo().equals("feminino"))
				.forEach(p -> System.out.println(p.getNome()));
		

	}	
}
