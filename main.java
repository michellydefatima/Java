package Main;

import java.util.Locale;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner escolheu = new Scanner(System.in);
		Scanner nKm = new Scanner(System.in); // recebe o valor do km a ser convertido
		Scanner nM3 = new Scanner(System.in); // recebe o valor do metro cubico a ser convertido
		int opcao;
		float km;
		float metro;
		float m3; // m3 = metro cubico :)
		float litro;
		
		opcao = 0;
		
		while (opcao != 3) {
		System.out.println("Bem vindo ao conversor! Digite: \n"
				+ "1 para converter quilômetros em metros. \n"
				+ "2 para converter metros cúbicos em litros. \n"
				+ "3 para sair do conversor. \n");
		opcao = escolheu.nextInt();
		
			if (opcao == 1) {
				System.out.println("Digite o valor do quilômetro a ser convertido em metro: ");
				km = nKm.nextFloat();
				metro = km * 1000;
				System.out.printf(" %.2f quilômetro(s) equivale a %.2f metro(s). \n"
						+ "------------------------------------------------------------- \n", km, metro);
			}
			
				else if (opcao == 2) {
					System.out.println("Digite o valor do metro cúbico a ser convertido em litro: ");
					m3 = nM3.nextFloat();
					litro = m3 * 1000;
					System.out.printf(" %.2f metro(s) cúbico(s) equivale a %.2f litro(s). \n"
							+ "------------------------------------------------------------- \n", m3, litro);
					
				}	
			
		
		}
		
		System.out.println("Conversor finalizado!");
	}

}
