package SWEA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

//public class SWEA_1954_달팽이숫자 {
//	public static void main(String[] args) throws NumberFormatException, IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		int T= Integer.parseInt(br.readLine());
//		
//		int n;
//		
//		for(int tc= 0; tc<T;tc++) {
//		
//			n = Integer.parseInt(br.readLine());
//			int arr[][] = new int[n+5][n+5];
//			int x = 1;
//			int i = 1;
//			int j = 1; 
//			
//			int Xaxis = 1;
//			int Yaxis = 1;
//			
//			for(int k = 1; k <= n*n; k++){
//			    arr[i][j] = x;
//			    x++;
//			    if( j <=n && Xaxis == 1 && Yaxis == 1){
//			        if(j+1 <= n && arr[i][j+1] == 0){j++;}
//			        else{
//			            i++;
//			            Xaxis = -1;
//			           
//			        }
//			    }
//			    else if( i <=n && Xaxis == -1 && Yaxis == 1){
//			        if(i+1 <= n  && arr[i+1][j] == 0){i++;}
//			        else{
//			            j--;
//			            
//			            Yaxis = -1;
//			            
//			        }
//			    }
//			    else if(  j >=1 && Xaxis == -1 && Yaxis == -1){
//			        if(j-1 > 0 && arr[i][j-1] == 0){j--;}
//			        else{
//			            i--;
//			            
//			            Xaxis = 1;
//			           
//			        }
//			    }
//			    else if(i >=1 && Yaxis == -1 && Xaxis == 1 ){
//			        if(i-1 >0 & arr[i-1][j] == 0){
//			           
//			            i--;}
//			        else{
//			            j++;
//			            Yaxis = 1;
//			           
//			        }
//			    }
//			}
//		
//
//	    	System.out.printf("#%d",tc+1);
//	    	System.out.println();
//			for(i = 1; i <= n; i++){
//
//			    for( j = 1; j <= n; j++){
//			        System.out.printf("%d ",arr[i][j]);
//			    }
//			   System.out.println();
//			}
//		}
//	}
//}


/* 
  
import java.util.*;

public class s_1954 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		
		for(int t = 1; t <= test; t++) {
			int n = sc.nextInt();
			int[][] a = new int[n][n];
			int turn = 1;
			int x = 0, y = -1;
			int cnt = 1;
			
			while(true) {
				for(int i = 0; i < n; i++) {
					y = y + turn;
					a[x][y] = cnt;
					cnt++;
				}
				n--;
				for(int i = 0; i < n; i++) {
					x = x + turn;
					a[x][y] = cnt;
					cnt++;
				}
				turn *= -1;
				if(n == 0)
					break;
			}
			System.out.println("#" + t);
			
			for(int i = 0; i < a.length; i++) {
				for(int j = 0; j < a.length; j++) {
					System.out.print(a[i][j] + " ");
				}
				System.out.println();
			}
		}
	}
}
*/

import java.io.*;

public class SWEA_1954_달팽이숫자 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		int dx[] = {0,1,0,-1};
		int dy[] = {1,0,-1,0};	//우,하,좌,상
		for(int tc=1; tc<=T; tc++) {
			int N = Integer.parseInt(br.readLine());
			
            //N 이 1인 경우를 따로 처리
			if(N == 1) {
				System.out.println("#"+tc);
				System.out.println(1);
				continue;
			}
			int[][] arr = new int[N][N];
           
			int x = 0;
			int y = 0;
			int dir = 0; //처음 방향은 0(우 방향)
			
            
			for(int i=0; i<N*N; i++) {
				
				arr[x][y] = i+1;
				x += dx[dir];
				y += dy[dir];
                
                //범위를 벗어나는 경우 방향 전환
				if(x >= N || y >= N || x < 0 || y < 0) {
					//원래 위치로 돌려주고
                    x -= dx[dir];
					y -= dy[dir];
                    
                    //방향 전환 (0->1 우에서 하/ 1->2 하에서 좌/ 2->3 좌에서 상/ 3->0 상에서 우)
					dir = (dir+1)%4;
                    
                    //전환한 방향으로 이동
					x += dx[dir];
					y += dy[dir];
				}
				
                //이동할 곳에 값이 있는 경우 방향 전환
				if(arr[x][y] != 0) {
					x -= dx[dir];
					y -= dy[dir];
					dir = (dir+1)%4;
					x += dx[dir];
					y += dy[dir];
				}
				
			}
			
			System.out.println("#"+tc);
			for(int i=0; i<N; i++) {
				for(int j=0; j<N; j++) {
					System.out.print(arr[i][j]+" ");
				}
				System.out.println();
			}
		}
	}

}

