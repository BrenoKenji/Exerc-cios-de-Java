package Exercicios;

import java.util.Scanner;

public class Exercicio6 {
	//Algoritmo que mostra o antecessor e o sucessor de um numero
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Digite um numero: ");
		numero = sc.nextInt();

		System.out.println("Este eh o antecessor do seu numero:  " + (numero-1));
		System.out.println("Este eh o sucessor do seu numero: " + (numero+1));
	}
}
