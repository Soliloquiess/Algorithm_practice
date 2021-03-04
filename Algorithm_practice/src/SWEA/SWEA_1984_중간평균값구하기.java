package SWEA;

import java.util.Arrays;
import java.util.Scanner;

public class SWEA_1984_중간평균값구하기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int arr[] = new int[10];
		int sum =0;
		for(int tc= 0; tc<T;tc++){
			
			for(int i=0;i<10;i++) {
				arr[i]=sc.nextInt();
			}
			Arrays.sort(arr);
			for(int i=1;i<9;i++) {
				sum+=arr[i];
			}
			System.out.printf("#%d %d",tc+1,(int)(sum/8.0+0.5));
//			System.out.printf("#%d %d",tc+1,Math.round(sum/8.0));
			System.out.println();
			sum =0;
		}
		
	}
}