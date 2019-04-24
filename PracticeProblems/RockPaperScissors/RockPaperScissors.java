import java.io.*;
import java.util.*;

public class RockPaperScissors {
	public static void main(String[]args) throws FileNotFoundException {
		PrintStream output = new PrintStream("src/rock/output");
		Scanner filereader = new Scanner(new File("src/rock/rock"));
		int num = Integer.parseInt(filereader.nextLine());
		
		while (num > 0) {
			String sentence = filereader.nextLine();
			Scanner splitter = new Scanner(sentence);
			String player1 = splitter.next();
			String player2 = splitter.next();
			
			if (player1.equals(player2)) {
				output.println("TIE");
			}
			else if (player1.equals("ROCK") && player2.equals("SCISSORS")) {
				output.println("YOU WIN");
			}
			else if (player1.equals("PAPER") && player2.equals("ROCK")) {
				output.println("YOU WIN");
			}
			else if (player1.equals("SCISSORS") && player2.equals("PAPER")) {
				output.println("YOU WIN");
			}
			else if (player2.equals("ROCK") && player1.equals("SCISSORS")) {
				output.println("YOU LOSE");
			}
			else if (player2.equals("PAPER") && player1.equals("ROCK")) {
				output.println("YOU LOSE");
			}
			else if (player2.equals("SCISSORS") && player1.equals("PAPER")) {
				output.println("YOU LOSE");
			}
			num--;
		}		
	}
}
