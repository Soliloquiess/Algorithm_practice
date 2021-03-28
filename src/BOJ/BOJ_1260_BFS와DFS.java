package BOJ;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BOJ_1260_BFS¿ÍDFS {

	public static int n, m, start;
	public static ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
	public static boolean[] d = new boolean[1001];

	// ±íÀÌ ¿ì¼± Å½»ö(DFS)
	public static void dfs(int x) {
		if (d[x]) return;
		d[x] = true;
		System.out.print(x + " ");
		for (int i = 0; i < adj.get(x).size(); i++) {
			int y = adj.get(x).get(i);
			dfs(y);
		}
	}

	// ³Êºñ ¿ì¼± Å½»ö(BFS)
	public static void bfs(int x) {
		Queue<Integer> q = new LinkedList<Integer>();
		q.offer(x);
		d[x] = true;
		while (!q.isEmpty()) {
			int now = q.poll();
			System.out.print(now + " ");
			for (int i = 0; i < adj.get(now).size(); i++) {
				int y = adj.get(now).get(i);
				if (!d[y]) {
					q.offer(y);
					d[y] = true;
				}
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();
		m = sc.nextInt();
		start = sc.nextInt();
		
		for (int i = 0; i <= n; i++) {
			adj.add(new ArrayList<Integer>());
		}
		
		for (int i = 0; i < m; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			adj.get(x).add(y);
			adj.get(y).add(x);
		}
		
		for(int i = 1; i <= n; i++) {
			Collections.sort(adj.get(i));
		}
		
		dfs(start);
		System.out.println();
		d = new boolean[1001];
		bfs(start);
	}

}
