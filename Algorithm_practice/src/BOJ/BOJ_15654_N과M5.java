package BOJ;

//public class BOJ_15654_N과M5 {
//
//}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ_15654_N과M5 {
	static int N, M;
	static boolean[] visited;
	static int[] a; // 실제 출력값을 담을 배열
	static int[] input;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] temp = br.readLine().split(" ");// temp에 " "을 기준으로 String을 나눠 담음.
		N = Integer.parseInt(temp[0]); // String을 int로 변환 후 담음.
		M = Integer.parseInt(temp[1]);

		visited = new boolean[N];
		a = new int[N];
		input = new int[N];

		temp = br.readLine().split(" ");
		for (int i = 0; i < N; i++) {
			input[i] = Integer.parseInt(temp[i]);
		}
		Arrays.sort(input);
		dfs(0);
	}

	static void dfs(int depth) {
		if (depth == M) {// 종료 지점.
			for (int i = 0; i < M; i++) {
				System.out.print(a[i] + " ");
			}
			System.out.println();
			return;
		}

		for (int i = 0; i < input.length; i++) {
			if (!visited[i]) {
				visited[i] = true;
				a[depth] = input[i];
				dfs(depth + 1);
				visited[i] = false;
			}
		}
	}
}
/*
import java.util.*;
public class BOJ_15654_N과M5 {
    static boolean[] c = new boolean[10];
    static int[] a = new int[10];
    static int[] num = new int[10];
    static StringBuilder go(int index, int n, int m) {
        if (index == m) {
            StringBuilder sb = new StringBuilder();
            for (int i=0; i<m; i++) {
                sb.append(num[a[i]]);
                if (i != m-1) sb.append(" ");
            }
            sb.append("\n");
            return sb;
        }
        StringBuilder ans = new StringBuilder();
        for (int i=0; i<n; i++) {
            if (c[i]) continue;
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
        for (int i=0; i<n; i++) {
            num[i] = sc.nextInt();
        }
        Arrays.sort(num, 0, n);
        System.out.print(go(0,n,m));
    }
}

*/