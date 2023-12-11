package atividade.ifesfeswitch;

import java.util.Scanner;

public class Atividade1 {

	public static void main(String[] args) {
		
		float n1,n2,n3,somaAb;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("\nEntre com o número A: ");
		n1 = ler.nextFloat();
		
		System.out.println("\nEntre com o número B: ");
		n2 = ler.nextFloat();

		System.out.println("\nEntre com o número C: ");
		n3 = ler.nextFloat(); //entre com os três números
		
		somaAb=n1+n2;
	
		if(somaAb>n3){
			System.out.println("\nA Soma de A + B é Maior do que C");
		}else if(somaAb<n3) {
			System.out.println("\nA Soma de A + B é Menor do que C");
		}else if(somaAb==n3){
			System.out.println("\nA Soma de A + B é Igual a C");
		}else {
			System.out.println ("\nValor inválido");}
		ler.close();

	}
}
