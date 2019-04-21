import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

public class Knight {
	public static void main(String[] args) throws FileNotFoundException {
		PrintStream output = new PrintStream("src/output");
		Scanner filereader = new Scanner(new File("src/knight.in"));
		int n = Integer.parseInt(filereader.nextLine());
		while (n > 0) {
			String line = filereader.nextLine();
			Scanner split = new Scanner(line);
			int[][]arr1 = fill(split.next());
			int[][]arr2 = fill(split.next());
			int[][]arr3 = fill(split.next());
			System.out.println(Arrays.deepToString(arr1));
			System.out.println(Arrays.deepToString(arr2));
			System.out.println(Arrays.deepToString(arr3));
			boolean end = false;
			for (int i = 0; i < 8 && !end; i++) {
				for (int j = 0; j < 8&& !end; j++) {
					for (int k = 0; k < 8&& !end; k++) {
						String ar1 = "" + arr1[0][i] + arr1[1][i];
						String ar2 = "" +arr2[0][j] + arr2[1][j];
						String ar3 = "" +arr3[0][k] + arr3[1][k];
																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																												
						if (ar1.equals(ar2) && ar2.equals(ar1)){
							output.println(((char)(arr1[0][i]+64)) + "" + (arr1[1][i]));
							end = true;
							break;
						}

					}
				}
			}
			n--;
		}
	}
	
	public static int[][] fill(String in) {
		int x = in.charAt(0)-64;
		int y = Integer.parseInt(in.substring(1, 2));
		int[][] arr = new int[2][8];
		arr[0][0] = x+1;
		arr[1][0] = y+2;
		arr[0][1] = x-1;
		arr[1][1] = y+2;
		arr[0][2] = x-2;
		arr[1][2] = y+1;
		arr[0][3] = x-2;
		arr[1][3] = y-1;
		arr[0][4] = x-1;
		arr[1][4] = y-2;
		arr[0][5] = x+1;
		arr[1][5] = y-2;
		arr[0][6] = x+2;
		arr[1][6] = y-1;
		arr[0][7] = x+2;
		arr[1][7] = y+1;
		return arr;		
	}
}
