package jokenpo;

import java.util.Random;
import java.util.Scanner;

public class desafioPedraPapelTesoura {

	public static void main(String[] args) {
		
		Random sorteio = new Random();
		Scanner leitor = new Scanner(System.in);
		
		int valorSorteado = sorteio.nextInt(3) + 1;
		int pedra=1;
		int papel=2;
		int tesoura=3;
		int maior;
		int voceGanhou = 0;
		int computadorGanhou = 0;
		int partidas = 2;
		
		System.out.println("--------------");
		System.out.println("J O K E N P O ");
		System.out.println("--------------");
		System.out.println("3 Partidas");
		
		System.out.println("--------------");
		System.out.println("1 - Pedra");
		System.out.println("2 - Papel");
		System.out.println("3 - Tesoura");
		System.out.println("--------------");
		System.out.println();
		
		System.out.print("Qual a sua escolha? ");
		int ppt = leitor.nextInt();
		
		System.out.println("Escolha do Comptador: " + valorSorteado);
		leitor.close();
		
		
			if (ppt == 1 && valorSorteado == 3 ) {
				System.out.println("Você escolheu pedra");
				System.out.println("O computador escolheu Tesoura");
				System.out.println("Você venceu");
				
			}else if (ppt == 1 && valorSorteado == 2) {
				System.out.println("Você escolheu pedra");
				System.out.println("O computador escolheu papel");
				System.out.println("Computador ganhou");
				
			}else if (ppt == 2 && valorSorteado == 1) {
				System.out.println("Você escolheu papel");
				System.out.println("O computador escolheu pedra");
				System.out.println("Você venceu");
				
			}else if (ppt == 2 && valorSorteado == 3) {
				System.out.println("Você escolheu papel");
				System.out.println("O computador escolheu tesoura");
				System.out.println("Computador ganhou");
				
			}else if (ppt == 3 && valorSorteado == 1) {
				System.out.println("Você escolheu tesoura");
				System.out.println("O computador escolheu pedra");
				System.out.println("Você venceu");	
				
			}else if (ppt == 3 && valorSorteado == 2) {
				System.out.println("Você escolheu tesoura");
				System.out.println("O computador escolheu papel");
				System.out.println("Computador ganhou");	
			} else {
				System.out.println("Você escolheu: " + ppt);
				System.out.println("O computador escolheu: " + valorSorteado);
				System.out.println("EMPATE");
			}



	}
}
		

	


