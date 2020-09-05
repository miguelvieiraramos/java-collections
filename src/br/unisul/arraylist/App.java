package br.unisul.arraylist;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class App {
	public static void main(String[] args) {
		//declarando e instanciando
		List<String> nomes = new ArrayList<String>();
		
		//adicionando valores
		nomes.add("Miguel");//adiciona no final
		nomes.add("Raiana");
		nomes.add("Murilo");
		nomes.add("Luciana");
		nomes.add(2, "Dino");//adiciona no indice 2
		
		//Ordena os elementos
		Collections.sort(nomes);
		
		//Percorrendo os elementos da lista
		for(String nome : nomes) {
			System.out.println(nome);
		}
		//recuperando o valor do indice 1 da lista
		String valor = nomes.get(1);
		System.out.println("Valor do indice 1 é: " + valor);
		
		//verificando a posicao em que o valor existe
		int posicao = nomes.lastIndexOf("Murilo");
		System.out.println("O valor Murilo esta na posicao: " + posicao);
		
		//removendo o elemento da posicao 0
		nomes.remove(0);
		
		//remove elemento pelo seu valor
		nomes.remove("Luciana");
		
		//uma exception é lançada quando é solicitado a remoção de um indice não preenchido
		try {
			nomes.remove(8);
		} catch (IndexOutOfBoundsException e) {
			System.out.println("Não existe elemento nessa posição.");
		}
	}
}
