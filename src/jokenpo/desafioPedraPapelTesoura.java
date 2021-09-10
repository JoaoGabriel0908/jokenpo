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
		int partidas = 1;
		int empate = 1;
		int rodadas = 1;
		
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
		
		while(partidas <= 1) {	
		
			System.out.print("Quantas partidas você quer jogar? " );
			partidas = leitor.nextInt();
			if (partidas % 2 == 1) {
		
		while (voceGanhou < partidas && computadorGanhou < partidas ) {
			System.out.println();
			System.out.print("Qual a sua escolha? ");
			int ppt = leitor.nextInt();
			
			int valorSorteado = sorteio.nextInt(3) + 1;
			System.out.println("Escolha do Comptador: " + valorSorteado);
			System.out.println();
		
			if (ppt == 1 && valorSorteado == 3 ) {
				System.out.println("Você escolheu pedra");
				System.out.println("O computador escolheu Tesoura");
				System.out.println(" Você venceu " + voceGanhou++);
				
			}else if (ppt == 1 && valorSorteado == 2) {
				System.out.println("Você escolheu pedra");
				System.out.println("O computador escolheu papel");
				System.out.println(" Computador ganhou " + computadorGanhou++);
				
			}else if (ppt == 2 && valorSorteado == 1) {
				System.out.println("Você escolheu papel");
				System.out.println("O computador escolheu pedra");
				System.out.println(" Você venceu " + voceGanhou++);
				
			}else if (ppt == 2 && valorSorteado == 3) {
				System.out.println("Você escolheu papel");
				System.out.println("O computador escolheu tesoura");
				System.out.println(" Computador ganhou " + computadorGanhou++);
				
			}else if (ppt == 3 && valorSorteado == 1) {
				System.out.println("Você escolheu tesoura");
				System.out.println("O computador escolheu pedra");
				System.out.println(" Você venceu " + voceGanhou++);	
				
			}else if (ppt == 3 && valorSorteado == 2) {
				System.out.println("Você escolheu tesoura");
				System.out.println("O computador escolheu papel");
				System.out.println("Computador ganhou" + computadorGanhou++);	
			} else {
				System.out.println("Você escolheu: " + ppt);
				System.out.println("O computador escolheu: " + valorSorteado);
				System.out.println(" EMPATE " + empate++);
			
			}
			if (empate <= partidas) {
				partidas--;
			} else {
				
			}
		
			
			
		
		}
		
			leitor.close();
		}  else  {
			System.out.println("Para haver um ganhador, este número precisa ser ímpar. Selecione novamente: ");
			partidas++;
		}
		
			
		}
	}
}
		
	
	

		

	


