package jokenpo;

import java.util.Random;
import java.util.Scanner;

public class desafioPedraPapelTesoura {

	public static void main(String[] args) {
		
		Random sorteio = new Random();
		Scanner leitor = new Scanner(System.in);
		
		int pedra=1;
		int papel=2;
		int tesoura=3;
		int maior;
		int voceGanhou = 1 ;
		int computadorGanhou = 1 ;
		int partidas = 0;
		int empate = 0;
		int rodadas = 0;
		
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
		
			
		
		System.out.print("Quantas partidas você quer jogar? " );
		while(partidas >= 0) {
		partidas = leitor.nextInt();
		
			if (partidas % 2 == 1) {
		
		while (voceGanhou < partidas && computadorGanhou < partidas && empate < partidas) {
			System.out.println();
			System.out.println("--------------");
			System.out.println("1 - Pedra");
			System.out.println("2 - Papel");
			System.out.println("3 - Tesoura");
			System.out.println("--------------");
			System.out.println();
			System.out.print("Qual a sua escolha? ");
			int ppt = leitor.nextInt();
			
			int valorSorteado = sorteio.nextInt(3) + 1;
			System.out.println("Escolha do Comptador: " + valorSorteado);
			System.out.println();
		
			if (ppt == 1 && valorSorteado == 3 ) {
				System.out.println("Você escolheu pedra");
				System.out.println("O computador escolheu Tesoura");
				System.out.println("Você venceu "); voceGanhou++;
				
			}else if (ppt == 1 && valorSorteado == 2) {
				System.out.println("Você escolheu pedra");
				System.out.println("O computador escolheu papel");
				System.out.println("Computador ganhou "); computadorGanhou++;
				
			}else if (ppt == 2 && valorSorteado == 1) {
				System.out.println("Você escolheu papel");
				System.out.println("O computador escolheu pedra");
				System.out.println("Você venceu ");  voceGanhou++;
				
			}else if (ppt == 2 && valorSorteado == 3) {
				System.out.println("Você escolheu papel");
				System.out.println("O computador escolheu tesoura");
				System.out.println("Computador ganhou "); computadorGanhou++;
				
			}else if (ppt == 3 && valorSorteado == 1) {
				System.out.println("Você escolheu tesoura");
				System.out.println("O computador escolheu pedra");
				System.out.println(" Computador ganhou "); computadorGanhou++;	
				
			}else if (ppt == 3 && valorSorteado == 2) {
				System.out.println("Você escolheu tesoura");
				System.out.println("O computador escolheu papel");
				System.out.println(" Você Venceu "); voceGanhou++;	
			} else {
				System.out.println("Você escolheu: " + ppt);
				System.out.println("O computador escolheu: " + valorSorteado);
				System.out.println(" EMPATE "); empate++;
			
			}			
		}	
			if (computadorGanhou > voceGanhou) {
				System.out.print("O Computador Venceu");
			} else if (empate == partidas || voceGanhou + computadorGanhou + empate == partidas) {
				partidas++;
				System.out.println("Partida de Ouro!");
			} else {
				System.out.println("Você Venceu");
			}
			
		}  else  {
			System.out.println("Para haver um ganhador, este número precisa ser ímpar. Selecione novamente: ");
		}
		}
		leitor.close();
	}
	
}

		
	
	

		

	


