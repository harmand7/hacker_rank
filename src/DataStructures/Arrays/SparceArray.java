package DataStructures.Arrays;

import java.io.*;
import java.util.*;


public class SparceArray {

	/*
	 * Complete the findSuffix function below.
	 */
	static int findSuffix(String[] strings, String queryString) {
		int count = 0;
		for (int i = 0; i < strings.length; i++){
			if (strings[i].equals(queryString)) count++;
		}
		return count;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {

		int stringsCount = scanner.nextInt();
		String[] strings = new String[stringsCount];

		for (int stringsItr = 0; stringsItr < stringsCount; stringsItr++) {
			scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");
			strings[stringsItr] = scanner.nextLine();
		}

		int q = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");
		for (int qItr = 0; qItr < q; qItr++) {
			String queryString = scanner.nextLine();
			int res = findSuffix(strings, queryString);
			System.out.println(res);
		}
		scanner.close();
	}
}