package practice;

import java.util.Scanner;
import java.util.Stack;

public class QueueWithStack{
	public static void main(String[] args) {
		MyQueue<Integer> queue = new MyQueue<Integer>();

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		for (int i = 0; i < n; i++) {
			int operation = scan.nextInt();
			if (operation == 1) { // enqueue
				queue.enqueue(scan.nextInt());
			} else if (operation == 2) { // dequeue
				queue.dequeue();
			} else if (operation == 3) { // print/peek
				System.out.println(queue.peek());
			}
		}
		scan.close();
	}

	static class MyQueue<T> {
		Stack<T> first = null;
		Stack<T> second = null;
		MyQueue (){
			this.first = new Stack<T>();
			this.second = new Stack<T>();
		}

		void enqueue(T object){
			first.push(object);
		}

		T dequeue() {
			if (second.isEmpty()){
				moveToSecond();
			}
			return second.pop();
		}

		T peek() {
			if (second.isEmpty()){
				moveToSecond();
			}
			return second.peek();
		}

		private void moveToSecond(){
			while (!first.isEmpty()){
				second.push(first.pop());
			}
		}
	}

}