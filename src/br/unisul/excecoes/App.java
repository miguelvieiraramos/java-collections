package br.unisul.excecoes;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class App {

	public static void main(String[] args) {
		int[] numeros = new int[2];
		numeros[0] = 3;
		numeros[1] = 4;
		
		//excecao nao checada porque é um erro de programacao (tentar acessar um indice que não existe)
		int numero = numeros[2]; 	
		
		
		//ja essa excecao é checada porque a aplicacao nao pode prever que vá acontecer
		try {
			FileInputStream fileInputStream = new FileInputStream("any_file");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

}
