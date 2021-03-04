package SWEA;

import java.util.*;

public class SWEA_1966_숫자를_정렬하자 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		for(int t = 1; t <= test; t++) {
			int n = sc.nextInt();
			int[] a = new int[n];
			for(int i = 0; i < n; i++) {
				a[i] = sc.nextInt();
			}
//			
//			for(int i = 0; i < n; i++) {
//				for(int j = 0; j < n - i - 1; j++) {
//					if(a[j] > a[j + 1]) {
//						int tmp = a[j];
//						a[j] = a[j+1];
//						a[j+1] = tmp;
//					}
//				}
//			}
			Arrays.sort(a);
			System.out.print("#" + t + " ");
			
			for(int i = 0; i < n; i++) {
				System.out.print(a[i] + " ");
			}
			System.out.println();
		}
	}
}