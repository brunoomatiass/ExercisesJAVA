
//Read the beginning and the end of a game. Then, calculate the duration of the game, knowing that it can start on one day and end on another, with a minimum duration of 1 hour and a maximum of 24 hours.




package conditionalSentences;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		
		int start,end, duration;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Que horas começou o jogo? ");
		start = sc.nextInt();
		System.out.println("Que horas terminou o jogo? ");
		end = sc.nextInt();
		sc.close();
		
		duration = (end - start);
		
		if(duration > 1 && duration<= 24) {
			System.out.println("O jogo durou " + duration + " horas.");
		}
		
		else if (duration < 1) {
			System.out.println("A duração mínima do jogo é 1hr.");
		}
		
		else if (duration > 24) {
			System.out.println("A duração máxima do jogo é 24hrs.");
		}
		
		
	}

}
