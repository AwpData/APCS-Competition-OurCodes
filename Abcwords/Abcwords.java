import java.io.*;
import java.util.*;

public class Abcwords {
	public static void main(String[] args) throws FileNotFoundException {
		PrintStream output = new PrintStream("src/output");
		Scanner filereader = new Scanner(new File("src/abcwords.in"));
		int num = Integer.parseInt(filereader.nextLine());

		while (num > 0) {
			boolean good = true;
			String word = filereader.nextLine();
			System.out.println(word);
			int i = 0;
			do {
				char letter = word.charAt(i);
				if (letter > word.charAt(i + 1)) {
					output.println("NO");
					good = false;
				}
				i++;
			} while (good == true && i < word.length() - 1);
			if(good == true) {
			output.println("YES");
			}
			num--;
		}
	}
}
