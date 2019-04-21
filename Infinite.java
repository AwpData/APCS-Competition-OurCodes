package CompSciCompetition;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.*;

public class Infinite {
	public static void main(String[] args) throws FileNotFoundException {
		PrintStream output = new PrintStream("src/output");
		Scanner filereader = new Scanner(new File("D:/judge/infinite.in"));
		int n = Integer.parseInt(filereader.nextLine());
		ArrayList<Integer> three = new ArrayList<>();
		int count = 2;
		int num = 2;
		while(num<1000000) {
			three.add(num);
			num += count;
			count++;
		}
		num = 3;
		count = 3;
		while(num<1000000) {
			three.add(num);
			num+=count;
			count++;
		}
		while(n>0) {
			boolean contain = false;
			int number = Integer.parseInt(filereader.nextLine());
			for(int i : three) {
				if(number == i) {
					contain = true; 
				}
			}
			if(number == 1) {
				output.println("2");
			} else if(contain == true) {
				output.println("3");
			} else {
				output.println("4");
			}
			n--;
		}
	}
}
