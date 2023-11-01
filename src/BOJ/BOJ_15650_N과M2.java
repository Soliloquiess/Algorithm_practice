package BOJ;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_15650_N과M2 {
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
		dfs(1, 1);
	}

	static void dfs(int depth, int com) {
		if (depth == M + 1) {// 종료 지점
			for (int i = 1; i <= M; i++) {
				System.out.print(a[i] + " ");
			}
			System.out.println();
			return;
		}

		for (int i = 1; i <= N; i++) {
			if (!visited[i] && com <= i) {
				visited[i] = true;
				a[depth] = i;
				dfs(depth + 1, i);
				visited[i] = false;
			}
		}
	}
}

/*
import java.util.*;

public class BOJ_15650_N과M2 {
	static int m,n; // M과 N변수

	static int list[],check[]; // 결과를 저장 할 list배열과 방문 여부를 체크 할 방문 배열
	
	static void dfs(int idx,int cnt) { // DFS메소드, 반복문의 시작부분을 변경해줘야 하므로 인자를 하나 더 추가한다.
  	
		if(cnt == m) { // 기존의 종료조건 이었던 수열의 끝에 도달하면 종료하는 부분은 동일하다.
			for(int i=0;i<m;i++) {
				System.out.print(list[i]+" ");
			}
			System.out.println("");
			return;
		}
		
		for(int i =idx+1;i<=n;i++) { // 반복문의 시작 부분을 변경해줘야 한다.
        							 // 초기에 시작할 때는 두번 째 자리는 1부터 N까지 탐색 
                                     // 2로 시작할 때는 두번 째 자리는 3부터 N까지 탐색
                                     // 3으로 시작할 때는 두번 째 자리는 4부터 N까지 탐색.. 반복이다.
			if(check[i]==1) continue; // 동일하다. 이미 방문한 경우는 넘긴다.
			check[i]=1; // 방문하지 않은 경우는 방문 처리 후
			list[cnt]=i; // cnt값의 자리는 i로 즉, 초기에는 0번인덱스(첫 번째 자리)는 1이다.
			dfs(i,cnt+1); // 현재의 i값보다 큰 경우를 탐색해야 하므로 i를 전달 후 반복문 시작부분에서 +1 해주는 것
			check[i]=0; // 모두 찾은 후에는 다시 방문 여부를 초기화
	
		}

	}
    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		
		n = sc.nextInt(); 
		m = sc.nextInt(); 
		
		check = new int[9];
		list = new int [9];
		dfs(0,0); // 초기의 시작은 1부터 N까지 탐색해야 하므로 0을 전달
	}
	
}

*/


//import java.util.*;
//public class BOJ_15650_N과M2 {
//    static boolean[] c = new boolean[10];
//    static int[] a = new int[10];
//    static void go(int index, int start, int n, int m) {
//        if (index == m) {
//            for (int i=0; i<m; i++) {
//                System.out.print(a[i]);
//                if (i != m-1) System.out.print(' ');
//            }
//            System.out.println();
//            return;
//        }
//        for (int i=start; i<=n; i++) {
//        	//N과 M1에서 다른건 i가 start부터 시작하고 start매개변수를 하나 추가해서 받아왔다.
//        	
//            if (c[i]) continue;
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


/*

import java.util.Scanner;

public class Main {
 
	public static int[] arr;
	public static int N, M;
 
	public static void main(String[] args) {
 
		Scanner in = new Scanner(System.in);
 
		N = in.nextInt();
		M = in.nextInt();
 
		arr = new int[M];
        
		dfs(1, 0);
 
	}
 
	public static void dfs(int at, int depth) {
 
		if (depth == M) {
			for (int val : arr) {
				System.out.print(val + " ");
			}
			System.out.println();
			return;
		}
        
		for (int i = at; i <= N; i++) {
 
			arr[depth] = i;
			dfs(i + 1, depth + 1);
 
		}
	}
}





import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;
 
public class Main {
 
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
			dfs(i + 1, depth + 1);
 
		}
	}
}
*/






/*
import java.util.Scanner;

class Main {
	static int n,m;	
	static void dfs(int[] a,boolean[] check,int v,int cnt) {
		if(cnt == m) {
			for(int i=0;i<m;i++) {
				System.out.print(a[i]+" ");
			}
			System.out.println();
			
			return;
		}
		
		
		for(int i=v;i<check.length;i++) {
			if(!check[i]) {
				check[i] = true;
				a[cnt] = i;
                // 깊이 탐색 시 자신을 전달해 자신+1 부터 반복하면 자신보다 큰 수만으로 수열을 고려하게 된다.
                // 덩달아 자기 자신은 고려하지 않기 때문에 좀 더 빠르다.
				dfs(a,check,i+1,cnt+1); 
				check[i] = false;
			}
		}
	}
	
	public static void main(String[] args)  {
		Scanner in = new Scanner(System.in);
		
		n = in.nextInt();
		m = in.nextInt();
		
		int a[] = new int[m];
		boolean check[] = new boolean[n+1];
		
		dfs(a,check,1,0);
		
	}
}

*/

