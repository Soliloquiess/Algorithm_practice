package BOJ;

//public class BOJ_15651_N과M3 {
//
//}
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BOJ_15651_N과M3 {
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
			
//				visited[i] = true;
				a[depth] = i;
				dfs(depth + 1, i, bw);
//				visited[i] = false;
			
		}
	}
}


/*
import java.util.*;
public class BOJ_15651_N과M3 {
    static boolean[] c = new boolean[10];
    static int[] a = new int[10];
    static StringBuilder go(int index, int n, int m) {
        if (index == m) {
            StringBuilder sb = new StringBuilder();
            for (int i=0; i<m; i++) {
                sb.append(a[i]);
                if (i != m-1) sb.append(" ");
            }
            sb.append("\n");
            return sb;
        }
        StringBuilder ans = new StringBuilder();
        for (int i=1; i<=n; i++) {
            // if (c[i]) continue;
            c[i] = true;
            a[index] = i;
            ans.append(go(index+1, n, m));
            c[i] = false;
        }
        return ans;
    }   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.print(go(0,n,m));
    }
}
*/

//import java.util.Scanner;
//
//public class BOJ_15651_N과M3 {
//	
//	public static int[] arr;
//	public static int N, M;
//	public static StringBuilder sb = new StringBuilder();
// 
//	public static void main(String[] args) {
// 
//		Scanner in = new Scanner(System.in);
// 
//		N = in.nextInt();
//		M = in.nextInt();
// 
//		arr = new int[M];
//        
//		dfs(0);
//		System.out.print(sb);
// 
//	}
// 
//	public static void dfs(int depth) {
//		// 깊이가 M이랑 같아지면 출력후 return
//		if (depth == M) {
//			for (int i = 0; i < M; i++) {
//				sb.append(arr[i] + " ");
//			}
//			sb.append('\n');
//			return;
//		}
// 
//		for (int i = 1; i <= N; i++) {
//			arr[depth] = i;
//			dfs(depth + 1);
//		}
//	}
// 
//}

/*

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
 
public class BOJ_15651_N과M3 {
	
	public static int[] arr;
	public static int N, M;
	public static StringBuilder sb = new StringBuilder();
 
	public static void main(String[] args) throws IOException {
 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
		StringTokenizer st = new StringTokenizer(br.readLine());
 
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
 
		arr = new int[M];
		dfs(0);
		System.out.println(sb);
	}
 
	public static void dfs(int depth) {
 
		if (depth == M) {
			for (int i = 0; i < M; i++) {
				sb.append(arr[i]).append(' ');
			}
			sb.append('\n');
			return;
		}
 
		for (int i = 1; i <= N; i++) {
			arr[depth] = i;
			dfs(depth + 1);
		}
	}
 
}

*/