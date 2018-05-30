package DataStructures.Arrays;

// DataStructures.Arrays - DS
import java.util.Scanner;

public class PrintReverseArray {

	public static void main(String[] args) {
		final Scanner scanner = new Scanner(System.in);
		int arrCount = Integer.parseInt(scanner.nextLine().trim());
		String[] arrItems = scanner.nextLine().split(" ");
		for (int i = arrCount -1; i >= 0; i--) {
			System.out.print(Integer.parseInt(arrItems[i].trim()) + " ");
		}
	}
}
