package br.unisul.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class App {

	public static void main(String[] args) {
		LinkedList<String> nomes = new LinkedList<String>();
		nomes.add("Miguel");
		nomes.add("Raiana");
		nomes.add("Murilo");
		nomes.addFirst("Dino");
		nomes.addLast("Thor");
		
		String firstName = nomes.getFirst();
		System.out.println(firstName);
		String lastName = nomes.getLast();
		System.out.println(lastName);
		String secondName = nomes.get(1);
		System.out.println(secondName);
		
		nomes.removeFirst();
		nomes.removeLast();
		nomes.remove(1);
		
		Iterator<String> iterator = nomes.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
	}

}
