package CompSciCompetition;

import java.util.*;
import java.io.*;

public class Rabbit {
	public static void main(String[] args) throws FileNotFoundException {
		PrintStream output = new PrintStream("src/output");
		Scanner filereader = new Scanner(new File("D:/judge/rabbit.in"));
		int num = Integer.parseInt(filereader.nextLine());
		while (num > 0) {
			String line = filereader.nextLine();
			Scanner splitter = new Scanner(line);
			int step = 0;
			int count = 0;
			for (int i = 0; i < 3; i++) {
				step += splitter.nextInt();
				if (step%2==1) {
					count++;
				}
			}
			output.println(count);
			num--;
		}
	}
}
