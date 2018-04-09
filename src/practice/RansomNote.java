package practice;

import java.util.Scanner;

public class RansomNote {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int m = in.nextInt();
		int n = in.nextInt();
		String magazine[] = new String[m];
		for(int magazine_i=0; magazine_i < m; magazine_i++){
			magazine[magazine_i] = in.next();
		}
		String ransom[] = new String[n];
		for(int ransom_i=0; ransom_i < n; ransom_i++){
			ransom[ransom_i] = in.next();
		}
		System.out.println(traceable(magazine, ransom));
	}

	private static String traceable(String[] magazine, String[] ransom) {
		boolean inMag = true;
		for (String r: ransom){
			if (!wordInArray(r, magazine)){
				inMag = false;
				break;
			}else {
				magazine = remove_from_mag(magazine, r);
			}
		}
		return inMag ? "Yes" : "No";
	}

	private static String[] remove_from_mag(String[] magazine, String r) {
		for (int i = 0; i < magazine.length; i ++){
			if (r.equals(magazine[i])){
				magazine[i] = "";
				break;
			}
		}
		return magazine;
	}

	private static boolean wordInArray(String r, String[] magazine) {
		for (String m: magazine) {
			if (r.equals(m)) return true;
		}
		return false;
	}
}
