package br.unisul.treeset;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class App {
	public static void main(String[] args) {
		SortedSet<String> nomes = new TreeSet<String>();
		nomes.add("Miguel");
		nomes.add("Raiana");
		nomes.add("Murilo");
		nomes.add("Luciana");
		nomes.add("Arch");
		
		//A interface SortedSet garante a ordenação de forma crescente
		Iterator<String> iterator = nomes.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
