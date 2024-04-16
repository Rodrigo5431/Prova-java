package Prova;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthScrollBarUI;

public class Q02 {
public static void main(String[] args) {
	
	Scanner leiaString = new Scanner(System.in);
	Scanner leiaInt = new Scanner(System.in);
	
	int contadorMobile = 0;
	int contadorPc = 0;
	int contadorConsole = 0;

	
	for(int i=0;i <50; i++) {
		System.out.println("Voce joga algum jogo eletronico?");
		String joga = leiaString.nextLine();
		
		if (joga.equalsIgnoreCase("sim")){
				System.out.println("Em qual plataforma voce joga?");
				System.out.println("\t 1. Mobile \n\t 2. Pc \n\t 3. Console");
				int plataforma = leiaInt.nextInt();
				
				if(plataforma == 1) {
					contadorMobile++;
					
				}else if (plataforma == 2) {
					contadorPc++;
					
				}else if (plataforma == 3) {
					contadorConsole++;
				}else {
					System.out.println("Opção inválida");
				}
		}
	}
	System.out.println("Quantidade de jogadores em cada plataforma: \n");
	System.out.println("Mobile: " + contadorMobile);
	System.out.println("Pc: " + contadorPc);
	System.out.println("Console " + contadorConsole);
}
}
