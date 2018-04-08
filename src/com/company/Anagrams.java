package com.company;

import java.util.Scanner;

public class Anagrams {
	static int numberNeeded(String first, String second) {
		if (first == null || first.length() == 0) return second.length();
		if (second == null || second.length() == 0) return first.length();

		int[] charList = new int[26];
		for (char c : first.toCharArray()) {
			charList[c - 'a']++;
		}
		for (char c : second.toCharArray()) {
			charList[c - 'a']--;
		}
		int result = 0;
		for (int i : charList) {
			result += Math.abs(i);
		}
		return result;

//        ArrayList<Character> matched = new ArrayList<>();
//        if (first.length() >= second.length()){
//            for (int i = 0; i < second.length(); i++){
//                char toFind = second.charAt(i);
//                if(first.contains(String.valueOf(toFind))){
//                    second = second.replaceFirst(String.valueOf(toFind), " ");
//                    first = first.replaceFirst(String.valueOf(toFind), " ");
//                    matched.add(first.charAt(i));
//                }
//            }
//        }else {
//            for (int i = 0; i < first.length(); i++){
//                char toFind = first.charAt(i);
//                if(second.contains(String.valueOf(toFind))){
//                    second = second.replaceFirst(String.valueOf(toFind), " ");
//                    first = first.replaceFirst(String.valueOf(toFind), " ");
//                    matched.add(toFind);
//                }
//            }
//        }
//        return first.length()+second.length()-(2*matched.size());
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String b = "ksmfgsxamduovigbasjchnoskolfwjhgetnmnkmcphqmpwnrrwtymjtwxget";
		String a = "fsqoiaidfaukvngpsugszsnseskicpejjvytviya";
		System.out.println(numberNeeded(a, b));
	}
}
