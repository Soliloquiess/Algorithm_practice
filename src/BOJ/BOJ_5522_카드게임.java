package BOJ;

import java.io.IOException;
import java.util.Scanner;

public class BOJ_5522_카드게임 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int sum =0; 
		for (int i =0; i<5;i++) {
			int num = sc.nextInt();
			sum +=num;
		}
		System.out.println(sum);
	}
}
