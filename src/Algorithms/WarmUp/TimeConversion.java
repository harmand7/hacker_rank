package Algorithms.WarmUp;


import java.util.Scanner;

public class TimeConversion {
	static String timeConversion(String s) {
		if (s == null || s.equals("")) {
			return "";
		}
		int hour = Integer.parseInt( s.split(":")[0]);
		if (hour == 12){
			if (s.contains("AM")){
				return "00" + s.subSequence(s.indexOf(':'),s.indexOf('A')).toString();
			}
			return hour + s.subSequence(s.indexOf(':'),s.indexOf('P')).toString();
		}else {
			if (s.contains("AM")){
				return "0" + hour + s.subSequence(s.indexOf(':'),s.indexOf('A')).toString();
			}else {
				hour += 12;
				return hour + s.subSequence(s.indexOf(':'),s.indexOf('P')).toString();
			}
		}
	}

	public static void main(String[] args) {
		final Scanner scan = new Scanner(System.in);
		while (true){
			String s = scan.nextLine();
			System.out.println(timeConversion(s));
		}
	}
}