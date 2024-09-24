package Exercicios;

import java.util.Scanner;

//Expressar idade em dias.
public class Exercicio1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int dia, mes, ano;
		
		System.out.println("Digite quantos dias se passaram depois de seu aniversario: ");
		dia = sc.nextInt();
		System.out.println("Digite o quantos meses se passaram desde seu aniversario: ");
		mes = sc.nextInt();
		System.out.println("Digite quantos anos voce tem atualmente: ");
		ano = sc.nextInt();
		
		System.out.println("Voce possui " + ((ano*365)+(mes*30)+dia) + " dias de vida!");
	}
}
