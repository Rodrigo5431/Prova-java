package Prova;

import java.util.Scanner;

public class Q03 {

	public static void main(String[] args) {
		
		Scanner leiaInt = new Scanner(System.in);
		
		int idade = 0;
			
		
		while (idade >= 0) {
			
			System.out.println("Qual sua idade?");
			idade = leiaInt.nextInt();
			
			if (idade < 16 && idade > 0 ) {
				System.out.println("Você é menor de idade, proibido votar!!");
				
				
			}else if (idade >= 18 && idade <= 69) {
				System.out.println("Você é obrigado a votar!!");
				
			
			}else if (idade == 16 || idade == 17 || idade >= 70) {
				System.out.println("Voto Facultativo!!");
				
			}else if (idade < 0) {
				System.out.println("Idade incorreta, saindo do programa!!");
			}
			
		}
			

	}

}
