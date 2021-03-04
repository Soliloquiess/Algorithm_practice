package SWEA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SWEA_1859_백만장자_프로젝트 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringTokenizer st;
      
		for(int tc=1; tc<=T; tc++) {
			int N = Integer.parseInt(br.readLine());
			int[] price = new int[N];
          
          //매매가를 저장
			st = new StringTokenizer(br.readLine());
			for(int i=0; i<N; i++) {
				price[i] = Integer.parseInt(st.nextToken());
			}

			long ans = 0; //long 타입 사용!
          
          //맨 마지막 날짜부터 계산
          //i 날짜가 파는 날, j 날짜가 사는 날이 된다.
			for(int i=N-1; i>=0; i--) {
				
				int j = i-1; //현재 파는 날짜보다 바로 앞의 날짜들을 검사
				int tmp = 0;
				while(j >= 0 && price[i] > price[j]) {
					tmp += price[i]; //파는 날의 매매가를 더해준다.
					tmp -= price[j]; //사는 날의 매매가를 빼준다.
					j--; //앞의 날짜로 이동
				}
              
				ans += tmp; //이익에 더해준다.
				i = j+1; //파는 날을 옮겨준다.
			}
			
			System.out.println("#"+tc+" "+ans);
		}
	}
}



//
//	public static void main(String[] args) throws NumberFormatException, IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		StringTokenizer st;
//		
//		int T = Integer.parseInt(br.readLine());
//		for(int tc=1; tc<=T; tc++) {
//			st= new StringTokenizer(br.readLine());
//			int N = Integer.parseInt(st.nextToken());
//			int a[] = new int[N];
//			for(int i=0; i<N; i++) {
//
//				st= new StringTokenizer(br.readLine());
//				a[i] = Integer.parseInt(st.nextToken());
//			}
//			long sum = 0;
//			int max = a[N-1];
//			for(int i=N-2; i>=0; i--) {
//				if( a[i] > max ) max = a[i];
//				else sum += max - a[i];
//			}
//			System.out.format( "#%d %d\n", tc, sum ); 
//		}
//	}
//}

//import java.util.Scanner;
//public class Solution {
//	static Scanner sc = new Scanner(System.in);
//	public static void main(String args[]) {
//		int T = sc.nextInt();
//		for(int tc=1; tc<=T; tc++) {
//			int N = sc.nextInt();
//			int a[] = new int[N];
//			for(int i=0; i<N; i++) a[i] = sc.nextInt();
//			long sum = 0;
//			int max = a[N-1];
//			for(int i=N-2; i>=0; i--) {
//				if( a[i] > max ) max = a[i];
//				else sum += max - a[i];
//			}
//			System.out.format( "#%d %d\n", tc, sum ); 
//		}
//	}
//}

//import java.io.*;
//import java.util.StringTokenizer;
//
//public class SWEA_1859_백만장자_프로젝트 {
//
//	public static void main(String[] args) throws IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		int T = Integer.parseInt(br.readLine());
//		StringTokenizer st;
//        
//		for(int tc=1; tc<=T; tc++) {
//			int N = Integer.parseInt(br.readLine());
//			int[] price = new int[N];
//            
//            
//            //매매가를 저장
//			st = new StringTokenizer(br.readLine());
//			for(int i=0; i<N; i++) {
//				price[i] = Integer.parseInt(st.nextToken());
//			}
//			
//            
//			long ans = 0; //long 타입 사용!
//            
//            //맨 마지막 날짜부터 계산
//            //i 날짜가 파는 날, j 날짜가 사는 날이 된다.
//			for(int i=N-1; i>=0; i--) {
//				
//				int j = i-1; //현재 파는 날짜보다 바로 앞의 날짜들을 검사
//				int tmp = 0;
//				while(j >= 0 && price[i] > price[j]) {
//					tmp += price[i]; //파는 날의 매매가를 더해준다.
//					tmp -= price[j]; //사는 날의 매매가를 빼준다.
//					j--; //앞의 날짜로 이동
//				}
//                
//				ans += tmp; //이익에 더해준다.
//				i = j+1; //파는 날을 옮겨준다.
//			}
//			
//			System.out.println("#"+tc+" "+ans);
//		}
//	}
//
//}
