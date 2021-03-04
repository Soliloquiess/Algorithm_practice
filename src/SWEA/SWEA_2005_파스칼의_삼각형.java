package SWEA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SWEA_2005_ÆÄ½ºÄ®ÀÇ_»ï°¢Çü {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		
		for(int tc=1; tc<=T;tc++) {

			int N = Integer.parseInt(br.readLine());

			int arr[][]= new int[N][N];
			arr[0][0] =1;
			for(int i = 1; i<N;i++) {	
				for(int j = 1; j< N;j++) {
					
					
					
					arr[i][0]=1;
					
					if(i==j) {
						arr[i][j]=1;
					}
					
					arr[i][j]= arr[i-1][j]+arr[i-1][j-1];	
				}
			}
			System.out.println("#"+tc);
			for(int i =0; i<N;i++) {
				for(int j =0;j<=i;j++) {
					
					System.out.print(arr[i][j] + " ");
				}
				System.out.println();
			}
		}
		
	}
}



//import java.util.*;
//
//public class SWEA_2005_ÆÄ½ºÄ®ÀÇ_»ï°¢Çü {
//	public static void main(String[] args) throws NumberFormatException, IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
////		int T = Integer.parseInt(br.readLine());
////		Scanner sc = new Scanner(System.in);
//		int test = Integer.parseInt(br.readLine());
//		
//		for(int t = 1; t <= test; t++) {
//			int n = Integer.parseInt(br.readLine());
//			int[][] a = new int[n][n];
//			a[0][0] = 1;
//			for(int i = 1; i < n; i++) {
//				a[i][0] = 1;
//				a[i][i] = 1;
//				for(int j = 1; j < i; j++) {
//					a[i][j] = a[i-1][j-1] + a[i-1][j];
//				}
//			}
//			System.out.println("#" + t + " ");
//			
//			for(int i = 0; i < n; i++) {
//				for(int j = 0; j <= i; j++) {
//					System.out.print(a[i][j] + " ");
//				}
//				System.out.println();
//			}
//		}
//	}
//}