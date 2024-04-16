package Prova;

import java.util.Scanner;

public class Q01 {

	public static void main(String[] args) {
		
		Scanner leiaInt = new Scanner(System.in);
		String tipo1 = "Carro Popular";
		String tipo2 = "Carro Hatch ou sedan intermediário";
		String tipo3 = "SUV ou sedan luxo";
		double valor1 = 299.99;
		double valor2 = 399.99;
		double valor3 = 499.99;
		double total;
	
		
		System.out.println("Tabela de preços Diários");
		System.out.println("1. Popular - R$ 299,99");
		System.out.println("2. Hatch ou sedan intermediário - R$ 399,99");
		System.out.println("3. SUV ou sedan luxo - R$ 499,99");
		
		System.out.println("\n Qual o senhor gostaria?");
		int opcoes = leiaInt.nextInt();
		
		System.out.println("\n Tabela de Descontos:");
		System.out.println("\t 1. Até 6 dias - Sem desconto");
		System.out.println("\t 2. De 7 a 14 dias - 5% de desconto Diario");
		System.out.println("\t 3. De 15 a 30 dias - 10% de desconto Diario \n");
		System.out.println("Quantos dias de aluguel seriam?");
		int dias = leiaInt.nextInt();
		
		
		switch(opcoes) {
		
		case 1:
			System.out.println("Você selecionou " + tipo1 + " R$"+valor1 + " diários. \n Você escolheu " + dias + " dias.");
		
			
			if (dias <= 6) {
				System.out.println("O preço sera "+ "R$" + dias * valor1);
			}
			else if (dias >=7 && dias <=14) {
				System.out.println("O preço sera R$" + dias * valor1);
				total = dias * valor1 * 5/100;
				double valorFinal = dias * valor1 - total;
				
				System.out.println("Com desconto de 5% o valor final fica R$" + valorFinal);
			}
			
			else if (dias >= 15 && dias <= 30){
				System.out.println("O preço sera R$" + dias * valor1);
				total = dias * valor1 * 10/100;
				double valorFinal = dias * valor1 - total;
				
				System.out.println("Com desconto de 10% o valor final fica R$" + valorFinal);
			}
			break;
			
		case 2:
			System.out.println("Você selecionou " + tipo2 + " R$"+valor2 + " diários.");
			if (dias <= 6) {
				System.out.println("O preço sera "+ "R$" + dias * valor2);
			}
			else if (dias >=7 && dias <=14) {
				System.out.println("O preço sera R$" + dias * valor2);
				total = dias * valor2 * 5/100;
				double valorFinal = dias * valor2 - total;
				
				System.out.println("Com desconto de 5% o valor final fica R$" + valorFinal);
			}
			
			else if (dias >= 15 && dias <= 30){
				System.out.println("O preço sera R$" + dias * valor2);
				total = dias * valor2 * 10/100;
				double valorFinal = dias * valor2 - total;
				
				System.out.println("Com desconto de 10% o valor final fica R$" + valorFinal);
			}
				
			break;
			
		case 3:
			System.out.println("Você selecionou " + tipo3 + " R$"+valor3 + " diários.");
			if (dias <= 6) {
				System.out.println("O preço sera "+ "R$" + dias * valor3);
			}
			else if (dias >=7 && dias <=14) {
				System.out.println("O preço sera R$" + dias * valor3);
				total = dias * valor3 * 5/100;
				double valorFinal = dias * valor3 - total;
				
				System.out.println("Com desconto de 5% o valor final fica R$" + valorFinal);
			}
			
			else if (dias >= 15 && dias <= 30){
				System.out.println("O preço sera R$" + dias * valor3);
				total = dias * valor3 * 10/100;
				double valorFinal = dias * valor3 - total;
				
				System.out.println("Com desconto de 10% o valor final fica R$" + valorFinal);
			}
				
			break;
		
		default: 
            System.out.println("Opção inválido");
            break;
            
		}
		
		
		
	}

}
