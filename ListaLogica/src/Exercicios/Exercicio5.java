package Exercicios;

import java.util.Scanner;

public class Exercicio5 {
	//Crie um algoritmo que leia o valor salario minimo e o valor de um usuario, depois imprima a quantidade de salarios que o usuario recebe.
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		float salarioMinimo = 788, salario;
		
		System.out.println("Digite o valor do seu salario atual: ");
		salario = sc.nextFloat();
		
		if(salario < salarioMinimo) {
			System.out.println("Seu salario eh menor do que um salario minimo");
		} else {
			System.out.println("Seu salario eh o equivalente a " + salario/salarioMinimo + " salarios minimos");
		}
	}
	
}
