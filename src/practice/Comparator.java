package practice;

import java.util.Arrays;
import java.util.Scanner;

public class Comparator {


	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		Player[] player = new Player[n];
		Checker checker = new Checker();

		for(int i = 0; i < n; i++){
			player[i] = new Player(scan.next(), scan.nextInt());
		}
		scan.close();

		Arrays.sort(player, checker);
		for(int i = 0; i < player.length; i++){
			System.out.printf("%s %s\n", player[i].name, player[i].score);
		}
	}

}

class Checker implements java.util.Comparator<Player>{

	@Override
	public int compare(Player player1, Player player2) {
		if (player1.score == player2.score){
			return player1.name.compareTo(player2.name);
		}else {
			return player1.score > player2.score ? -1 : 1;
		}
	}
}

class Player{
	String name;
	int score;

	Player(String name, int score){
		this.name = name;
		this.score = score;
	}
}
