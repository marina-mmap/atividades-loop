package atividade.ifesfeswitch;

import java.util.Scanner;

public class Atividade3 {

	public static void main(String[] args) {
		
		String doador;
		int idade;
		boolean primeira;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("\nDigite o Nome do doador: ");
		doador = ler.nextLine();
		
		System.out.println("\nDigite a Idade do doador: ");
		idade = ler.nextInt();

		System.out.println("\nPrimeira doação de sangue? ");
		primeira = ler.nextBoolean(); //entre com os dados
		
	
		if(idade>=18 && idade<=69){
			if(idade>=60) {
				if(!primeira) {
					apto = true;
				} else {
					apto = false;
		}else if(somaAb<n3) {
			System.out.println("\nA Soma de A + B é Menor do que C");
		}if(somaAb==n3){
			System.out.println("\nA Soma de A + B é Igual a C");
		}else {
			System.out.println (doador +"não está apto(a) a doar sangue.");}
		ler.close();

	}
}



	}

}
