package Algorithms.Implementation;

import java.util.Scanner;

public class BreakingTheRecord {
	static int[] breakingRecords(int[] score) {
		int countMax = 0, countMin = 0;
		int min = score[0], max = score[0];
		for (int s:score) {
			if (s > max){
				countMax++;
				max = s;
			}
			if (s < min){
				countMin++;
				min = s;
			}
		}
		return new int[] {countMax, countMin};
	}


	public static void main(String[] args) {
		final Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.nextLine().trim());
		int[] score = new int[n];

		String[] scoreItems = scan.nextLine().split(" ");

		for (int scoreItr = 0; scoreItr < n; scoreItr++) {
			int scoreItem = Integer.parseInt(scoreItems[scoreItr].trim());
			score[scoreItr] = scoreItem;
		}

		int[] result = breakingRecords(score);

		for (int resultItr = 0; resultItr < result.length; resultItr++) {
			System.out.print(result[resultItr]);

			if (resultItr != result.length - 1) {
				System.out.print(" ");
			}
		}
	}
}
