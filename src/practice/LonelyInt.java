package practice;

import java.util.*;

public class LonelyInt {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int xor = 0;
		int n = in.nextInt();
		for (int i = 0; i < n; i++) {
			xor ^= in.nextInt();
		}
		System.out.println(xor);
	}
}
