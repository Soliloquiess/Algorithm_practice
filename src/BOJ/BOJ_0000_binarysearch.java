package BOJ;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ_0000_binarysearch {
	static int n,m;
	static int arr[];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		arr = new int[n];
		for(int i =0; i<n;i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		m = sc.nextInt();
		for(int i =0;i<m;i++) {
			int num =sc.nextInt();
			if(binarysearch(num)) System.out.println("1");
			else System.out.println("0");
		}
	}
	public static boolean binarysearch(int num) {
		int leftIndex = 0;
		int rightIndex= n-1;
		
		while(leftIndex<=rightIndex) {
			int midIndex = (leftIndex+rightIndex)/2;
			int mid = arr[midIndex];
			
			if(num<mid) rightIndex= midIndex-1;
			else if(num>mid)leftIndex= midIndex+1;
			else return true;
		}
		return false;
	}
}
