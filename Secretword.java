import java.io.*;
import java.util.*;

public class Secretword {
	public static void main(String[] args) throws FileNotFoundException {
		PrintStream output = new PrintStream("src/output");
		Scanner filereader = new Scanner(new File("D:/judge/secretword.in"));
		int s = Integer.parseInt(filereader.nextLine());
		while (s > 0) {
			int n = Integer.parseInt(filereader.nextLine());
			String line = filereader.nextLine();
			Scanner splitter = new Scanner(line);
			String out = "";
			int count = 1;
			while (count <= n) {
				String word = splitter.next();
				int len = word.length();
				if (len >= count) {
					if (len< count) {
						out += word.substring(len -1, len);
					} else {
						out += word.substring(len-count,len-count+1);
					}
				}
				count++;
			}
			output.println(out);
			s--;
		}
	}
}
