package practice;

import java.util.Scanner;

public class KangarooProblem {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double x1 = in.nextDouble();
		double v1 = in.nextDouble();
		double x2 = in.nextDouble();
		double v2 = in.nextDouble();
		String result = kangaroo(x1, v1, x2, v2);
		System.out.println(result);
	}


	static String kangaroo(double x1, double v1, double x2, double v2) {
		if (x1 == x2) return "YES";
		if ((x1 < x2 && v1 < v2) || (x2 < x1 && v2 < v1)) {
			return "NO";
		}
		double x = (x1-x2);
		double v = (v2-v1);
		double a = x/v;
		if (a%1 == 0){
			return "YES";
		}
		return "NO";
	}
}