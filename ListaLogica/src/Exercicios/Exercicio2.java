package Exercicios;

import java.util.Scanner;

public class Exercicio2 {
	// Calcular a média de 8.9 e 7. A media dos numeros 4,5 e 6. A soma das duas medias. A media das medias.
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		double numeros1, numeros2, media1, media2;
		
		numeros1 = 8 + 9 + 7;
		numeros2 = 4 + 5 + 6;
		media1 = numeros1/3;
		media2 = numeros2/3;
		
		System.out.println("media 1: " + media1);
		System.out.println("media 1: " + media2);
		System.out.println("Soma das medias: " + (media1 + media2));
		System.out.println("Media das medias: " + (media1 + media2)/2);
	}
}
