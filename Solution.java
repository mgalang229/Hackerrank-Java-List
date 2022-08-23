import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Solution {
	
	static Scanner fs;
	
	public static void main(String[] args) {
		fs = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		int T = 1;
		//T = fs.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int n = fs.nextInt();
			ArrayList<Integer> arr = new ArrayList<>();
			for (int i = 0; i < n; i++) {
				arr.add(fs.nextInt());
			}
			int q = fs.nextInt();
			for (int i = 0; i < q; i++) {
				String type = fs.next();
				int x = fs.nextInt();
				if (type.equals("Insert")) {
					int y = fs.nextInt();
					arr.add(x, y);
				} else {
					arr.remove(x);
				}
			}
			for (int x : arr) {
				out.print(x + " ");
			}
			out.println();
		}
		fs.close();
		out.close();
	}
	
	static void sort(int[] a) {
		ArrayList<Integer> arr = new ArrayList<>();
		for (int x : a) {
			arr.add(x);
		}
		Collections.sort(arr);
		for (int i = 0; i < a.length; i++) {
			a[i] = arr.get(i);
		}
	}
	
	static int[] readArray(int n) {
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = fs.nextInt();
		}
		return a;
	}
}
