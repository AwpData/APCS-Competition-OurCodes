import java.io.*;
import java.util.*;

public class Climb {
	public static void main(String[] args) throws FileNotFoundException {
		PrintStream output = new PrintStream("src/Climb/output");
		Scanner filereader = new Scanner(new File("src/Climb/climb"));
		int num = Integer.parseInt(filereader.nextLine());
		while (num > 0) {
			int times = Integer.parseInt(filereader.nextLine());
			int numberofprints = 1;
			while (times > 0) {
				for (int i = 0; i < times; i++) {
					output.print(" ");
				}
				for (int j = 1; j <= numberofprints; j++) {
					output.print("C");
				}
				numberofprints++;
				times--;
				output.println();
			}
			num--;
		}
	}
}
