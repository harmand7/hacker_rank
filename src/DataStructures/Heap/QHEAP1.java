package DataStructures.Heap;

import java.util.Arrays;
import java.util.Scanner;

public class QHEAP1 {
	public static void main(String[] args) {
		read();

	}

	private static void read() {
		MyHeap heap = new MyHeap();
		final Scanner scanner = new Scanner(System.in);
		int q = scanner.nextInt();
		for (int i =0; i< q; i++){
			int type = scanner.nextInt();
			int value = 0;
			switch (type){
				case 1:
					value = scanner.nextInt();
					heap.add(value);
					continue;
				case 2:
					value = scanner.nextInt();
					heap.poll(value);
					continue;
				case 3:
					System.out.println(heap.peek());
			}
		}
	}
}

class MyHeap {
	int capacity = 10;
	int size = 0;
	int[] items = new int[capacity];

	int leftChild(int index) {
		return items[leftChildIndex(index)];
	}

	int rightChild(int index) {
		return items[rightChildIndex(index)];
	}

	int parent(int index) {
		return items[parentIndex(index)];
	}

	int leftChildIndex(int index){
		return index*2+1;
	}

	int rightChildIndex(int index){
		return index*2+2;
	}

	int parentIndex(int index){
		return (index-2)/2;
	}

	boolean hasLeftChild(int index) {
		return leftChildIndex(index) < size;
	}

	boolean hasRightChild(int index) {
		return rightChildIndex(index) < size;
	}

	boolean hasParent(int index) {
		return parentIndex(index) >= 0;
	}

	private void swap (int indexOne, int indexTwo) {
		int temp = items[indexOne];
		items[indexOne] = items[indexTwo];
		items[indexTwo] = items[temp];
	}

	private void ensureCap(){
		if (size == capacity){
			items = Arrays.copyOf(items, capacity*2);
			capacity *= 2;
		}
	}

	public int getIndex(int v){
		for (int i = 0; i < size; i++) {
			if (v == items[i])
				return i;
		}
		return -1;
	}

	public int poll(int value){
		if (size == 0){
			throw new IllegalStateException();
		}
		int i = getIndex(value);
		if (i == 0){
			return poll();
		}
		int item = items[i];
		items[i] = items[--size];
		heapifyDown();
		return item;
	}

	public int peek(){
		if (size == 0) {
			throw new IllegalStateException();
		}
		return items[0];
	}

	public int poll(){
		if (size == 0) {
			throw new IllegalStateException();
		}
		int item = items[0];
		items[0] = items[--size];
		heapifyDown();
		return item;
	}

	public void add(int value){
		ensureCap();
		items[size++] = value;
		heapifyUp();
	}

	private void heapifyUp() {
		int i = size-1;
		while (hasParent(i) && parent(i) > items[i]){
			swap(parentIndex(i), i);
			i = parentIndex(i);
		}
	}

	private void heapifyDown() {
		int i = 0;
		while (hasLeftChild(i)){
			int smallerChildIndex = leftChildIndex(i);
			if (hasRightChild(i) && rightChild(i) < leftChild(i)){
				smallerChildIndex = rightChildIndex(i);
			}
			if (items[i] < items[smallerChildIndex]){
				break;
			}else {
				swap(i, smallerChildIndex);
			}
			i = smallerChildIndex;

		}
	}

}
