import java.util.*;
import java.io.*;

public class Robotcommands {
	public static void main(String[] args) throws FileNotFoundException {
		PrintStream output = new PrintStream("src/output");
		Scanner filereader = new Scanner(new File("D:/judge/robotcommands.in"));
		int num = Integer.parseInt(filereader.nextLine());
		while (num > 0) {
			filereader.nextLine();
			String path = filereader.nextLine();
			Scanner splitter = new Scanner(path);
			int upD = 0;
			int rightL = 0;
			while (splitter.hasNext()) {
				String direct = splitter.next();
				if (direct.contains("L")) {
					rightL -= Integer.parseInt(direct.substring(1));
				}
				if (direct.contains("R")) {
					rightL += Integer.parseInt(direct.substring(1));
				}
				if (direct.contains("F")) {
					upD += Integer.parseInt(direct.substring(1));
				}
				if (direct.contains("B")) {
					upD -= Integer.parseInt(direct.substring(1));
				}
			}
			if (upD == 0 && rightL == 0) {
				output.println("YES");
			} else {
				output.println("NO");
			}
			num--;
		}
	}
}
