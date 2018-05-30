package Algorithms.WarmUp;

public class GCD {
	public static void main(String[] args) {
		System.out.println(gcd_Euclid(54,24));
	}

	private static int gcd_Euclid(int a, int b) {
		int max = Math.max(a,b);
		int min = Math.min(a,b);
		while (true){
			int reminder = max % min;
			if (reminder == 0) {break;}
			max = min;
			min = reminder;
		}
		return min;
	}
}
