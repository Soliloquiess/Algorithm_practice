package BOJ;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_15649_N과M_1 {
	static int N, M;
	static boolean[] visited;
	static int[] a; // 실제 출력값을 담을 배열

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] temp = br.readLine().split(" ");// temp에 " "을 기준으로 String을 나눠 담음.
		N = Integer.parseInt(temp[0]); // String을 int로 변환 후 담음.
		M = Integer.parseInt(temp[1]);

		visited = new boolean[N + 1];
		a = new int[N + 1];
		dfs(1);
	}

	static void dfs(int depth) {
		if (depth == M + 1) {// 종료 지점
			for (int i = 1; i <= M; i++) {
				System.out.print(a[i] + " ");
			}
			System.out.println();
			return;
		}

		for (int i = 1; i <= N; i++) {
			if (!visited[i]) {
				visited[i] = true;
				a[depth] = i;
				dfs(depth + 1);
				visited[i] = false;
			}
		}
	}
}



//import java.util.*;
//public class BOJ_15649_N과M_1 {
//    static boolean[] c = new boolean[10];
//    static int[] a = new int[10];
//    static void go(int index, int start,int n, int m) {
//        if (index == m) {
//            for (int i=0; i<m; i++) {
//                System.out.print(a[i]);
//                if (i != m-1) System.out.print(' ');
//            }
//            System.out.println();
//            return;
//        }
//        for (int i=1; i<=n; i++) {
//        	if (c[i]) continue;
//            c[i] = true;
//            a[index] = i;
//            go(index+1, i+1, n, m);
//            c[i] = false;
//        }
//    }   
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int m = sc.nextInt();
//        go(0,1,n,m);
//    }
//}

 


//
//import java.util.*;
//
//public class BOJ_15649_N과M_1 {
//	static int m,n; // N과 M을 입력받는다.
//	static int list[],check[]; // 숫자의 방문여부를 체크 할 방문배열과 결과를 저장 할 배열을 선언
//	
//	static void dfs(int cnt) { // DFS메소드, 반복횟수를 인자로 받는다. 초기 0부터 시작
//			
//		if(cnt == m) { // 0부터 M번까지 반복했으면 하나의 처리가 완성
//        			   // 개인적인 생각으로는 이부분이 백트래킹에 해당한다고 생각한다.
//                       // M보다 큰 횟수는 고려하지 않고 배제한다.
//			for(int i=0;i<m;i++) { // 현재 결과배열을 출력
//				System.out.print(list[i]+" ");
//			}
//			System.out.println("");
//			return; // DFS 종료 
//		}
//		
//		for(int i =1;i<=n;i++) { // 수의 범위는 1부터 N까지이다.
//			
//			if(check[i]==1) continue; // 이미 방문한 배열이면 건너뛴다.
//			check[i]=1; // 방문하지 않았다면, 방문처리 후
//			list[cnt]=i; // 현재 반복횟수에 해당하는 배열에 i값을 넣는다.
//			dfs(cnt+1); // 반복횟수를 증가시킨다.
//			check[i]=0; // dfs가 종료 후에는 다시 방문여부를 0으로 초기화한다.
//			
//			
//		}
//		
//		
//	
//	}
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);	
//		
//		n = sc.nextInt(); 
//		m = sc.nextInt(); 
//		
//		check = new int[9]; // n과 m의 최대범위
//		list = new int [9];
//		dfs(0);
//	}
//	
//}


//
//
//import java.util.Scanner;
//
//public class BOJ_15649_N과M_1 {
// 
//	public static int[] arr;
//	public static boolean[] visit;
// 
//	public static void main(String[] args) {
// 
//		Scanner in = new Scanner(System.in);
// 
//		int N = in.nextInt();
//		int M = in.nextInt();
// 
//		arr = new int[M];
//		visit = new boolean[N];
//		dfs(N, M, 0);
// 
//	}
// 
//	public static void dfs(int N, int M, int depth) {
//		if (depth == M) {
//			for (int val : arr) {
//				System.out.print(val + " ");
//			}
//			System.out.println();
//			return;
//		}
// 
//		for (int i = 0; i < N; i++) {
//			if (!visit[i]) {
//				visit[i] = true;
//				arr[depth] = i + 1;
//				dfs(N, M, depth + 1);
//				visit[i] = false;
//			}
//		}
//	}
// 
//}
//
//
//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//import java.io.IOException;
//import java.util.StringTokenizer;
// 
//public class BOJ_15649_N과M_1 {
// 
//	public static int[] arr;
//	public static boolean[] visit;
//	public static StringBuilder sb = new StringBuilder();
// 
//	public static void main(String[] args) throws IOException {
// 
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
// 
//		StringTokenizer st = new StringTokenizer(br.readLine());
// 
//		int N = Integer.parseInt(st.nextToken());
//		int M = Integer.parseInt(st.nextToken());
// 
//		arr = new int[M];
//		visit = new boolean[N];
//		dfs(N, M, 0);
//		System.out.println(sb);
// 
//	}
// 
//	public static void dfs(int N, int M, int depth) {
//		if (depth == M) {
//			for (int val : arr) {
//				sb.append(val).append(' ');
//			}
//			sb.append('\n');
//			return;
//		}
// 
//		for (int i = 0; i < N; i++) {
//			if (!visit[i]) {
//				visit[i] = true;
//				arr[depth] = i + 1;
//				dfs(N, M, depth + 1);
//				visit[i] = false;
//			}
//		}
//	}
// 
//}