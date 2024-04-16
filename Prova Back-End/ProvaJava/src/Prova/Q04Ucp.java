package Prova;
import java.util.Scanner;

public class Q04Ucp {

	public static void main(String[] args) {
		
		Scanner leiaInt = new Scanner(System.in);
		Scanner leiaString = new Scanner(System.in);
		
		String servico1 = "Troca de Óleo";
		String servico2 = "Alinhamento e Balanceamento";
		String servico3 = "Revisão do sistema de freios";
		
		double valor1 = 50.00;
		double valor2 = 80.00;
		double valor3 = 120.00;
		double total;
		
		System.out.println("Escolha os serviços: /n1. Troca de Óleo /n2. Alinhamento e Balanceamento /n3. Revisão do sistema de freios");
		int escolha = leiaInt.nextInt();
			
		if (escolha == 1) {
				total = valor1;
				
			}else if (escolha ==2) {
				total = valor2;
				
				
			}else if (escolha == 3) {
				total = valor3;
			}
		
		System.out.println("Deseja mais algum serviço?");
		String sN = leiaString.nextLine();
			
		
		while(sN.equalsIgnoreCase("sim")) {
			System.out.println("Escolha os serviços: /n1. Troca de Óleo /n2. Alinhamento e Balanceamento /n3. Revisão do sistema de freios");
			int escolha1 = leiaInt.nextInt();
			if (escolha == 1) {
				total = valor1 + valor1;
				
			}else if (escolha ==2) {
				total = valor2 + valor2;
				
				
			}else if (escolha == 3) {
				total = valor3 + valor3;
			}
			
			System.out.println("Deseja mais algum serviço?");
			String sN1 = leiaString.nextLine();
			
			System.out.println("" + total);
		}
		
		
	
		

	}

}
