package atividade.ifesfeswitch;

import java.util.Scanner;

public class Atividade5 {

	public static void main(String[] args) {
		int quant,op;
		float valorTotal; 
		
		Scanner ler = new Scanner(System.in);
		System.out.println("\n\t\tMenu");
		System.out.println("\n1 - Cachorro Quente -- R$10,00");
		System.out.println("\n2 - X-Salada -- R$15,00");
		System.out.println("\n3 - X-Bacon -- R$18,00");
		System.out.println("\n4 - Bauru -- R$12,00");
		System.out.println("\n5 - Refrigerante -- R$8,00");
		System.out.println("\n6 - Suco de Laranja -- R$13,00");
		System.out.println("\nDigite a sua opção: ");
		op = ler.nextInt();//1
		System.out.println("\nDigite a quantidade desse produto: ");
		quant =ler.nextInt();
			
		switch(op) {
		case 1:
			valorTotal = 10 * quant;
			System.out.println("\n" +quant+" de Cachorro(s) Quente no valor total de R$ " + valorTotal);
			break;
		case 2:
			valorTotal = 15 * quant;
			System.out.println("\n" +quant+" de X-Salada no valor total de R$: " + valorTotal);
			break;	
		case 3:
			valorTotal = 18*quant;
			System.out.println("\n" +quant+" de X-Bacon no valor total de R$:  " + valorTotal);
			break;
		case 4:
			valorTotal = 12*quant;
			System.out.println("\n" +quant+" de X-Bauru no valor total de R$: " + valorTotal);
			break;
		case 5:
			valorTotal = 8*quant;
			System.out.println("\n" +quant+" de Refrigerante no valor total de R$: " + valorTotal);
			break;	
		case 6:
			valorTotal = 8*quant;
			System.out.println("\n" +quant+" de Sucos de Laranja no valor total de R$: " + valorTotal);
			break;	
			default:
				System.out.println("Opção Inválida");
		}		
	}
}

		

		