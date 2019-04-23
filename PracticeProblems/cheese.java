import java.io.*;
import java.util.*;

public class cheese {
	public static void main(String[] args) throws FileNotFoundException {
		PrintStream output = new PrintStream("src/cheese/output");
		Scanner filereader = new Scanner(new File("src/cheese/cheese"));

		while (filereader.hasNextLine()) {
			String word = filereader.nextLine();
			if (word.substring(0, 6).equals("cheese")) {
				output.println(word + " is cheezy!");
			} else {
				output.println(word + " needs more cheese");
			}
		}
	}
