package practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class IceCreamParlor {
	static void solve(int[] flavors, int money) {
		for (int i = 0; i < flavors.length - 1; i++) {
			if (flavors[i] >= money) continue;
			for (int j = i + 1; j < flavors.length; j++) {
				if (flavors[j] >= money) continue;
				if (flavors[i] + flavors[j] == money){
					int min = Math.min(i,j) + 1;
					int max = Math.max(i,j) + 1;
					System.out.print(min + " " + max);
					break;
				}

			}
		}
	}
	static void solve_via_hashtable(int[] flavors, int money){
		Map<Integer, Integer> hash = new HashMap<>();
		for (int i = 0; i < flavors.length; i++){
			if (flavors[i] >= money) continue;
			int compliment = money-flavors[i];
			if (hash.containsKey(compliment)){
				System.out.println(Math.min(hash.get(compliment)+1, i+1) + " " + Math.max(hash.get(compliment)+1,i+1));
			}
			hash.put(flavors[i],i);
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for(int a0 = 0; a0 < t; a0++){
			int money = in.nextInt();
			int n = in.nextInt();
			int[] arr = new int[n];
			for(int arr_i = 0; arr_i < n; arr_i++){
				arr[arr_i] = in.nextInt();
			}
			solve_via_hashtable(arr, money);
		}
		in.close();
	}
}
