package Algorithms.Sorting;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;

public class SortTest {

	static class MyObject{
		int value;
		String name;

		public MyObject(){
			value = 1;
			name = "Hello";
		}
	}

	public static void main(String[] args) {
		int[] array = new int[] {1,2,3,4,5};
		String[] strings = new String[] {"Hello", "World"};
		int[] temp = new int[array.length];


		appendStrings(strings);
		copy(array, temp);
		incrementArray(array);
		System.out.println(Arrays.toString(strings));
		System.out.println(Arrays.toString(array));
		System.out.println(Arrays.toString(temp));
	}

	private static void appendStrings(String[] strings) {
		for (int i = 0; i < strings.length; i++) {
			strings[i] += " add";
		}
	}

	private static void incrementArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			array[i]++;
		}
	}

	private static void copy(int[] array, int[] temp) {
		System.arraycopy(array,0,temp,0,array.length);
	}

	public void sort(){

	}

}
