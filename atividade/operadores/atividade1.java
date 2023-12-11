package atividade.operadores;

import java.util.Scanner;

public class atividade1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite seu salário:");
		double salario = scanner.nextDouble ( );
		System.out.println("\nDigite seu abono: ");
		double abono = scanner.nextDouble ( );
		
		double novoSalario = salario + abono; 
		
		System.out.println("\nNovo Salário: " + novoSalario);
	
scanner.close();
	}

}
