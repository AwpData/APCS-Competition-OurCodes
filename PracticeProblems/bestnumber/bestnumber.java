import java.io.*;
import java.util.*;

public class bestnumber {
	public static void main(String[] args) throws FileNotFoundException {
		PrintStream output = new PrintStream("src/output");
		Scanner filereader = new Scanner(new File("src/bestnumber.in"));
		filereader.nextLine();
		int big;
		if (filereader.nextLine().equals("biggest")) {
			big = 0;
		} else {
			big = 1;
		}
		double total = filereader.nextDouble();
		while (filereader.hasNextDouble()) {
			double num = filereader.nextDouble();
			if (num >= 1) {
				total *= num;
			} else {
				total /= num;
			}
		}
		output.println(total);
	}
}
