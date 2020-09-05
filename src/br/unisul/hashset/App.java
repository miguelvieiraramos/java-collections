package br.unisul.hashset;

import java.util.HashSet;
import java.util.Set;

public class App {

	public static void main(String[] args) {
		Set<String> nomes = new HashSet<String>();
		nomes.add("Miguel");
		nomes.add("Raiana");
		nomes.add("Murilo");
		nomes.add("Miguel");

		
		//verificando se contem
		boolean possui = nomes.contains("Miguel");
		System.out.println(possui);
		
		for(String nome : nomes) {
			System.out.println(nome);
		}
		
		nomes.remove("Murilo");
		for(String nome : nomes) {
			System.out.println(nome);
		}
		
	}

}
