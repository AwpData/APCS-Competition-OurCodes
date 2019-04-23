//Practice Problem for AP CS Competition

import java.io.*;
import java.util.*;

public class diamonds {
	public static void main(String[] args) throws FileNotFoundException {
		PrintStream output = new PrintStream("src/Diamonds/output");
		Scanner filereader = new Scanner(new File("src/Diamonds/diamond"));
		filereader.nextLine();
		while (filereader.hasNextLine()) {
			int stars = 1;
			int length = filereader.nextInt();
			int shortlength = length / 2;
			while (stars <= length) {
				for (int i = 0; i < shortlength; i++) {
					output.print(" ");
				}
				for (int i = 0; i < stars; i++) {
					output.print("*");
				}
				stars += 2;
				shortlength--;
				output.println();
			}
			
			stars = length - 2;
			shortlength = length / 2;
			int startlength = 1;
			while (stars > 0) {
				for (int i = 0; i < startlength; i++) {
					output.print(" ");
				}
				for (int i = stars; i > 0; i--) {
					output.print("*");
				}
				stars -= 2;
				startlength++;
				output.println();
			} 
			output.println();
		}
	}
}

