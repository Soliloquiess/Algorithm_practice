package BOJ;

//public class BOJ_10845_큐 {
//
//}


//1. 배열로 큐를 구현하여 문제풀이

import java.util.Scanner;

class Queue{
	private int[] queue;
	private int frontIndex = 0;
	private int backIndex = -1;
	
	Queue(){
		
	}
	
	Queue(int number){
		queue = new int[number];
	}
	
	public void push(int x) {
		queue[++backIndex] = x;
	}
	
	public int size() {
		return backIndex - frontIndex + 1;
	}
	
	public boolean isEmpty() {
		if (size()==0)
			return true;
		else
			return false;
	}
	
	public int  pop() {
		if (isEmpty())
			return -1;
		else
			return queue[frontIndex++];
	}
	
	public int front() {
		if (isEmpty())
			return -1;
		else
			return queue[frontIndex];
	}
	
	public int back() {
		if (isEmpty())
			return -1;
		else
			return queue[backIndex];
	}
	
}
public class BOJ_10845_큐  {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		Queue queue = new Queue(number);
		for(int i = 0; i <number; i++) {
			String command = scanner.next();
			switch(command) {
				case "push":
					int x = scanner.nextInt();
					queue.push(x);
					break;
				case "pop":
					System.out.println(queue.pop());
					break;
				case "empty":
					if (queue.isEmpty())
						System.out.println(1);
					else
						System.out.println(0);
					break;
				case "front":
					System.out.println(queue.front());
					break;
				case "back":
					System.out.println(queue.back());
					break;
				case "size":
					System.out.println(queue.size());
					break;
			}
		}
	}
}
 

/*

2. 큐 라이브러리를 이용해서 문제풀이

import java.util.Scanner;
import java.util.LinkedList;

public class Main {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		LinkedList<Integer> queue = new LinkedList<>();
		for(int i = 0; i <number; i++) {
			String command = scanner.next();
			switch(command) {
				case "push":
					int x = scanner.nextInt();
					queue.add(x);
					break;
				case "pop":
					if (queue.isEmpty())
						System.out.println(-1);
					else
						System.out.println(queue.removeFirst());
					break;
				case "empty":
					if (queue.isEmpty())
						System.out.println(1);
					else
						System.out.println(0);
					break;
				case "front":
					if (queue.isEmpty())
						System.out.println(-1);
					else
						System.out.println(queue.getFirst());
					break;
				case "back":
					if (queue.isEmpty())
						System.out.println(-1);
					else
						System.out.println(queue.getLast());
					break;
				case "size":
					System.out.println(queue.size());
					break;
			}
		}
	}
}

*/