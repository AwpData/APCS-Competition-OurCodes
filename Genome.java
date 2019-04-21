package CompSciCompetition;

import java.util.*;
import java.io.*;

public class Genome {
	public static void main(String[] args) throws FileNotFoundException {
		PrintStream output = new PrintStream("src/output");
		Scanner filereader = new Scanner(new File("D:/judge/genome.in"));
		int num = Integer.parseInt(filereader.nextLine());
		while (num > 0) {
			String DNA = filereader.nextLine();
			ArrayList<String> letters = new ArrayList<>();
			for (int i = 0; i < DNA.length(); i++) {
				letters.add(DNA.substring(i, i+1));
			}
			for (int i = letters.size() - 1; i >=0; i--) {
				if (letters.get(i).equals("C")) {
					output.print("G");
				}
				if (letters.get(i).equals("G")) {
					output.print("C");
				}
				if (letters.get(i).equals("T")) {
					output.print("A");
				}
				if (letters.get(i).equals("A")) {
					output.print("T");
				}
			}
		output.println();
		num--;
		}
	}
}
