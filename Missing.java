import java.io.*;
import java.util.*;

public class Missing {
	public static void main(String[] args) throws FileNotFoundException {
		PrintStream output = new PrintStream("src/output");
		Scanner filereader = new Scanner(new File("D:/judge/missing.in"));
		int n = Integer.parseInt(filereader.nextLine());
		while(n>0) {
			String line = filereader.nextLine();
			Scanner splitter = new Scanner(line);
			int min = splitter.nextInt();
			int max = splitter.nextInt();
			int total = splitter.nextInt();
			int add = 0;
			for(int i=min;i<=max;i++) {
				add += i;
			
			}
			add=add-total;
			output.println(add);
			n--;
		}
	}
}
