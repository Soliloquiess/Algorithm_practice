package Jungol;

import java.util.Arrays;
import java.util.Scanner;

public class Jungol_1205_조커 {
	public static void main(String[] args) throws Exception {
		
		Scanner sc = new Scanner(System.in);
		int	N = sc. nextInt();
		int [] a = new int[N];
		int joker =0;
		for(int i =0; i<N; i++) {
			a[i] = sc.nextInt();
			if(a[i]==0) joker++;
		}
//		System.out.println(Arrays.toString(a));
		Arrays.sort(a);
//		System.out.println(Arrays.toString(a));
		
		if(joker ==N){
			System.out.println(joker);
		}
		else {
			int max = 0;
			for(int i = joker; i<N; i++) {
				int jok = joker;
				int len =1;
				int val = a[i];
				for(int j =i+1; j<N;j++) {
					if(a[j]-val==0) 	{
							continue;
					}
					else if(a[j]-val<=jok+1) {
						int diff = a[j]- val-1;
						jok = jok-diff;
						len = len+diff+1;
						val = a[j];
					}
					else {
						break; 
					}
				}
				max = Math.max(max, len+jok);
			}
			System.out.println(max);
		}
	}
}