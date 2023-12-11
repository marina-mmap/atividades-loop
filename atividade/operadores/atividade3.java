package atividade.operadores;

import java.util.Scanner;

public class atividade3 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite seu salário bruto:");
		double salarioBruto = leia.nextDouble ( );
		
		System.out.println("\nDigite seu Adicional Noturno: ");
		double adicionalNoturno = leia.nextDouble ( );
		
		System.out.println("\nDigite seu Horas Extras: ");
		double horasExtras = leia.nextDouble ( );
		
		System.out.println("\nDigite seu Desconto: ");
		double descontos = leia.nextDouble ( );
		
		double salarioLiquido  = (salarioBruto+adicionalNoturno+(horasExtras*5)-descontos);
		System.out.println("Salário Líquido:"+ salarioLiquido);
		
		leia.close();	
	}
}
