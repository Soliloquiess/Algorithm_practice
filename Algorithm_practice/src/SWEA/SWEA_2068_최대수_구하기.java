package SWEA;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SWEA_2068_최대수_구하기 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int T= Integer.parseInt(br.readLine());
		for(int i =1; i<=T; i++) {
			
			
			 st = new StringTokenizer(br.readLine()); 
            int max = 0;
            for(int j=0; j<10; j++) {
           
            	int n = Integer.parseInt(st.nextToken());
                if( n > max ) max = n;
            }
            System.out.printf("#%d %d\n", i,max);
			
		}			
	}
}
//https://suancodestore.blogspot.com/2019/10/swea2068.html
//
//
//import java.util.*;
//public class Solution {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int T = sc.nextInt();
//        for(int i=1; i<=T; i++){
//            int[] n = new int[10];
//            for(int j=0; j<10; j++)
//                n[j]=sc.nextInt();
//            Arrays.sort(n);
//            System.out.println("#"+i+" "+n[9]);
//        }
//    }
//}
//
//
//출처: https://data-make.tistory.com/158 [Data Makes Our Future]


//2068. 최대수 구하기
//import java.util.Scanner;
//public class Solution2068 {
// public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     int T = sc.nextInt();
//     for(int i=0; i<T; i++) {
//         int max = 0;
//         for(int j=0; j<10; j++) {
//             int num = sc.nextInt();
//             if(num > max)
//                 max = num;
//         }
//         System.out.println("#"+(i+1)+" "+max);
//         max = 0;
//     }
// }
//}
//
//
//출처: https://data-make.tistory.com/158 [Data Makes Our Future]	
//


///

//package Main;
//
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.Scanner;
//import java.util.StringTokenizer;
//
//public class SWEA_2063_중간값_찾기 {
// public static void main(String[] args) throws IOException {
////     Scanner sc = new Scanner(System.in);
//     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//     StringTokenizer st;
//     
//     int T = Integer.parseInt(br.readLine());
//     for(int i=0; i<T; i++) {
//         int max = 0;
//         st = new StringTokenizer(br.readLine());
//         for(int j=0; j<10; j++) {
//             int num = Integer.parseInt(st.nextToken());
//             if(num > max)
//                 max = num;
//         }
//         System.out.println("#"+(i+1)+" "+max);
//         max = 0;
//     }
// }
//}

