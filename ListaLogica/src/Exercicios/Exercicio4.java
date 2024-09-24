package Exercicios;

import java.util.Scanner;

public class Exercicio4 {
	//Calcular IPI a ser acrescido
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		double ipi, valorUnitarioPeca1, valorUnitarioPeca2, valorTotal;
		int qntPeca1, qntPeca2;
		String codigoPeca1, codigoPeca2;
		
		System.out.println("Digite a porcentagem do IPI: ");
		ipi = sc.nextDouble();
		
		System.out.println("Digite o valor unitario da peca 1: ");
		valorUnitarioPeca1 = sc.nextDouble();
		
		System.out.println("Digite a quantidade de pecas 1: ");
		qntPeca1 = sc.nextInt();
		
		System.out.println("Digite o valor unitario da peca 2: ");
		valorUnitarioPeca2 = sc.nextDouble();
		
		System.out.println("Digite a quantidade de pecas 2: ");
		qntPeca2 = sc.nextInt();
		
		valorTotal = (((valorUnitarioPeca1*qntPeca1) + (valorUnitarioPeca2*qntPeca2)) * (ipi/100 +1));
		
		System.out.println("O valor total a ser pago sera de: " + valorTotal);
	}
}
