package atividade.operadores;

import java.util.Scanner;
public class atividade2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite a nota1: ");
		float nota1 = leia.nextFloat();
		
		System.out.println("\nDigite nota2:");
		float nota2 = leia.nextFloat();

		System.out.println("\nDigite nota3");
		float nota3 = leia.nextFloat();
		
		System.out.println("\nDigite nota4: ");
		float nota4 = leia.nextFloat();
		
		float mediaFinal = (nota1+nota2+nota3+nota4)/4;
		System.out.println("Media Final:"+ mediaFinal);
		
leia.close();	
	}
	

}
