package BOJ;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BOJ_15652_N과M4 {
	static int N, M;
//	static boolean[] visited;
	static int[] a; // 실제 출력값을 담을 배열

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String[] temp = br.readLine().split(" ");// temp에 " "을 기준으로 String을 나눠 담음.
		N = Integer.parseInt(temp[0]); // String을 int로 변환 후 담음.
		M = Integer.parseInt(temp[1]);

//		visited = new boolean[N + 1];
		a = new int[N + 1];
		dfs(1, 1, bw);
		bw.flush();
		bw.close();
		br.close();
	}

	static void dfs(int depth, int com, BufferedWriter bw) {
		if (depth == M + 1) {// 종료 지점
			try {
				for (int i = 1; i <= M; i++) {
					bw.write(String.valueOf(a[i]) + " ");
				}
				bw.write("\n");
			} catch (IOException e) {
				e.printStackTrace();
			}
			return;
		}

		for (int i = 1; i <= N; i++) {
			if (i >= com) {
				a[depth] = i;
				dfs(depth + 1, i, bw);
			}

		}
	}
}

/*
import java.util.Scanner;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;
 
public class BOJ_15652_N과M4 {
 
	public static int[] arr;
	public static int N, M;
	public static StringBuilder sb = new StringBuilder();
 
	public static void main(String[] args) throws IOException {
 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
 
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
 
		arr = new int[M];
        
		dfs(1, 0);
		System.out.println(sb);
 
	}
 
	public static void dfs(int at, int depth) {
 
		if (depth == M) {
			for (int val : arr) {
				sb.append(val).append(' ');
			}
			sb.append('\n');
			return;
		}
        
		for (int i = at; i <= N; i++) {
 
			arr[depth] = i;
			dfs(i , depth + 1);//N과 M2에서 여기 dfs에 i+1에서 1을 추가 안한 부분만 다르다.

		}
	}
}

*/
/*

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
 
public class Main {
 
	public static int N, M;
	public static int[] arr;
	public static StringBuilder sb = new StringBuilder();
 
	public static void main(String[] args) throws IOException {
 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		arr = new int[M];
 
		dfs(1, 0);
		System.out.println(sb);
 
	}
 
	public static void dfs(int at, int depth) {
 
		if (depth == M) {
			for (int val : arr) {
				sb.append(val).append(' ');
			}
			sb.append('\n');
			return;
		}
 
		for (int i = at; i <= N; i++) {
			arr[depth] = i;
			dfs(i, depth + 1);
		}
 
	}
 
}


import java.util.*;
public class Main {
    static int[] cnt = new int[10];
    static StringBuilder go(int index, int selected, int n, int m) {
        if (selected == m) {
            StringBuilder sb = new StringBuilder();
            for (int i=1; i<=n; i++) {
                for (int j=1; j<=cnt[i]; j++) {
                    sb.append(i);
                    sb.append(" ");
                }
            }
            sb.append("\n");
            return sb;
        }
        StringBuilder ans = new StringBuilder();
        if (index > n) return ans;
        for (int i=m-selected; i>=1; i--) {
            cnt[index] = i;
            ans.append(go(index+1, selected+i, n, m));
        }
        cnt[index] = 0;
        ans.append(go(index+1, selected, n, m));
        return ans;
    }   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.print(go(1, 0, n, m));
    }
}


import java.io.*;
import java.util.*;

public class Main {
	static int m,n;
	static int list[];
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static void dfs(int cnt) throws IOException {
		
		
		if(cnt == m) {
			for(int i=0;i<m;i++) {
				bw.write(String.valueOf(list[i])+" ");			
				}
			bw.newLine();
			return;
		}
		
		for(int i =1;i<=n;i++) {
			if(cnt!=0 && list[cnt-1]>i) continue; //추가 된 조건부
            //이 부분을 제외하고는 N과 M(3)문제와 동일하다.
            // cnt!=0인 이유는 자신보다 앞의 숫자가 있는 경우는 2번째 자리 숫자부터이기 때문이다.
			list[cnt]=i;		
			dfs(cnt+1);			
		}	
	}
	
	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		
		list = new int [m];
		dfs(0);
		br.close();
		bw.flush();
		bw.close();
	}
	
}

*/