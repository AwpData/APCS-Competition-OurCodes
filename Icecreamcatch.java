import java.util.*;
import java.io.*;

public class Icecreamcatch {
	public static void main(String[] args) throws FileNotFoundException {
		PrintStream output = new PrintStream("src/output");
		Scanner filereader = new Scanner(new File("D:/judge/icecreamcatch.in"));
		int s = Integer.parseInt(filereader.nextLine());
		while (s > 0) {
			int j = 0;
			int n = Integer.parseInt(filereader.nextLine());
			int[] num = new int[n * 2];
			int y = n;
			while (y>0) {

					String line = filereader.nextLine();
					Scanner parseline = new Scanner(line);
					num[j] = parseline.nextInt();
					num[j+1] = parseline.nextInt();
					j+=2;

					y--;
				}
			int min = num[0];
			int max = num[0];
			for (int x : num) {
				if (x > max) {
					max = x;
				}
				if (x < min) {
					min = x;
				}
			}
			int range = max - min +1;
			output.println(min + " " + max + " " + range);
			s--;
		}
	}
}
