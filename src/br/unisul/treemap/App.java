package br.unisul.treemap;

import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class App {

	public static void main(String[] args) {
		SortedMap<String, String> nomes = new TreeMap<String, String>();
		nomes.put("Chave1", "Miguel");
		nomes.put("Chave2", "Raiana");
		nomes.put("Chave3", "Murilo");
		nomes.put("Chave4", "Luciana");
		
//		String segundoNome = nomes.get("Chave2");
//		System.out.println(segundoNome);
		Set<String> chaves = nomes.keySet();
		for(String chave : chaves) {
			System.out.println(nomes.get(chave));
		}
		

	}

}
