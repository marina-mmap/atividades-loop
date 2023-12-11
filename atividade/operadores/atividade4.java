package atividade.operadores;

import java.util.Scanner;
public class atividade4 {
	public static void main(String[] args) {
	Scanner leia = new Scanner(System.in);
	
	System.out.println("\nDigite a numero1: ");
	float n1 = leia.nextFloat();
	
	System.out.println("\nDigite numero2: ");
	float n2 = leia.nextFloat();

	System.out.println("\nDigite numero3 ");
	float n3 = leia.nextFloat();
	
	System.out.println("\nDigite numero4: ");
	float n4 = leia.nextFloat();
	
	float diferencaDeproduto = (n1*n2)-(n3 * n4);
	System.out.println("Diferença (n1 x n2) - (n3 x n4) = "+ diferencaDeproduto);
	
	leia.close();

}
}
