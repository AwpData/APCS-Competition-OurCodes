import java.io.*;
import java.util.*;

public class Similar {
	public static void main(String[] args) throws FileNotFoundException {
		PrintStream output = new PrintStream("src/output");
		Scanner filereader = new Scanner(new File("src/triangles.in"));
		int num = Integer.parseInt(filereader.nextLine());
		while (num > 0) {
			String integers = filereader.nextLine();
			Scanner nums = new Scanner(integers);
			int big1 = nums.nextInt();
			int big2 = nums.nextInt();
			int proportionalSide = nums.nextInt();
			int small1 = nums.nextInt();
			int small2 = nums.nextInt();
			int missingsidelength = small1 * proportionalSide / big1;
			output.println(small1 + " " + small2 + " " + missingsidelength);
			num--;
		}
	}
}
