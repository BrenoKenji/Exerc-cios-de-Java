package Exercicios;

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String args[]) {
		//Informar um saldo e mostrar seu reajuste com 1%
		Scanner sc = new Scanner(System.in);
		
		double saldo;
		
		System.out.println("Digite seu saldo: ");
		saldo = sc.nextInt();
		
		System.out.println("Este e seu saldo apos o reajuste de 1%: " + saldo*1.01);
	}
}
