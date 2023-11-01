package SWEA;

import java.util.*;
import java.io.*;
import java.util.*;

public class SWEA_1961_숫자배열회전 {
	static int N;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for(int tc=1; tc<=T; tc++) {
			N = Integer.parseInt(br.readLine());
			int[][] arr = new int[N][N];
			
			StringTokenizer st;
			for(int i=0; i<N; i++) {
				st = new StringTokenizer(br.readLine());
				for(int j=0; j<N; j++) {
					arr[i][j] = Integer.parseInt(st.nextToken());
				}
			}
			
            //기존의 배열을 90도 회전
			int[][] arr90 = rotate(arr);
            
            //90도 회전한 배열을 다시 90도 회전 == 180도 회전
			int[][] arr180 = rotate(arr90);
            
            //180도 회전한 배열을 다시 90도 회전 == 270도 회전
			int[][] arr270 = rotate(arr180);
						
                        
			System.out.println("#"+tc);
			for(int i=0; i<N; i++) {
            
            	//90도 회전 배열 출력
				for(int j=0; j<N; j++) {
					System.out.print(arr90[i][j]);
				}
				System.out.print(" ");
                
                //180도 회전 배열 출력
				for(int j=0; j<N; j++) {
					System.out.print(arr180[i][j]);
				}
				System.out.print(" ");
                
                //270도 회전 배열 출력
				for(int j=0; j<N; j++) {
					System.out.print(arr270[i][j]);
				}
				System.out.println();
			}
		}

	}
	
	
	//90도 회전시키는 함수
	static int[][] rotate(int[][] arr) {
    
		int[][] newarr = new int[N][N]; //새로운 배열에다 회전한 값을 넣어준다.
		int k = 0; //기존 배열의 행을 가르키는 index
        
		for(int j=N-1; j>=0; j--) {
			for(int i=0; i<N; i++) {
            	//새로운 배열에는 마지막 열(N-1)부터, 각 열에서는 첫 행(0)부터 채워준다.
                //기존 배열의 k행 i열값을 넣어준다. (0행0열부터 순차대로 넣어준다)
				newarr[i][j] = arr[k][i];
			}
			k++;
		}
		
		return newarr;
	}

}
//public class SWEA_1961_숫자배열회전 {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int test = sc.nextInt();
//		for(int t = 1; t <= test; t++) {
//			int n = sc.nextInt();
//			int[][] a = new int[n][n];
//			for(int i = 0; i < n; i++) {
//				for(int j = 0; j < n; j++) {
//					a[i][j] = sc.nextInt();
//				}
//			}
//			System.out.println("#" + t + " ");
//			for(int i = 0; i < n; i++) {
//				for(int j = 0; j < n; j++) {
//					System.out.print(a[n-j-1][i]);
//				}
//				System.out.print(" ");
//				for(int j = 0; j < n; j++) {
//					System.out.print(a[n-i-1][n-j-1]);
//				}
//				System.out.print(" ");
//				for(int j = 0; j < n; j++) {
//					System.out.print(a[j][n-1-i]);
//				}
//				System.out.println();
//			}
//		}
//	}
//}