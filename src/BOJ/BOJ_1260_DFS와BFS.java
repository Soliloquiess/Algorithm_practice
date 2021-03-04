package BOJ;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class BOJ_1260_DFS와BFS {

	static int[][] map; 
	static boolean[] visit; 
	static int n,m,v;
	
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt(); // 정점의 개수 (node)
		m = sc.nextInt(); // 간선의 개수 (line)
		v = sc.nextInt(); // 탐색을 시작할 정점의 번호 (start)
		
		map = new int[n+1][n+1]; // 인접 행렬 (인덱스 활용하기 위해 +1)
		visit = new boolean[n+1]; // 방문 여부
		
		int num1, num2; // 간선을 연결하는 두 정점의 번호
		
		for(int i=1; i<=m; i++){
			num1 = sc.nextInt();
			num2 = sc.nextInt();
			map[num1][num2] = map[num2][num1] = 1; // 정점간의 연결상태를 1로 표시
		}
		
		dfs(v); // DFS 수행
		ResetVisit();
		bfs(v); // BFS 수행
	}
	
	// 방문 정점 초기화
	public static void ResetVisit(){
		for (int i=1; i<n+1; i++){
			visit[i] = false;
		}
		System.out.println();
	}
	
	// 깊이 우선 탐색 (Depth First Search) - 재귀함수
	public static void dfs(int d) {
		visit[d] = true; // 방문한 정점임을 체크
		System.out.print(d + " ");
		
		for (int i=1; i<n+1; i++){
			if(map[d][i] == 1 & !visit[i]) { // 간선으로 연결되었으며 아직 방문하지 않은 정점
				dfs(i);
			}
		}
	}
	
	// 깊이 우선 탐색 (Depth First Search) - 스택
	public static void dfs2(int d) {
		Stack<Integer> stack = new Stack<>();
		stack.push(d);
		int p; // 탐색중인 정점
		boolean flag;
		
		visit[d] = true;
		System.out.print(d + " ");
		
		while (!stack.isEmpty()){
			p = stack.peek();
			flag = false;
			
			for (int i=1; i<n+1; i++){
				if(map[p][i] == 1 & !visit[i]) { // 간선으로 연결되었으며 아직 방문하지 않은 정점 
					stack.push(i);
					visit[i] = true;
					System.out.print(i + " ");
					flag = true;
					break;
				}
			}
			
			// 반복문에서 조건에 충족하지 않았을 경우 해당 정점 제거
			if (!flag) {
				stack.pop();
			}
		}
	}
	
	// 너비 우선 탐색 (Breadth First Search) - 큐
	public static void bfs(int b){	
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.add(b);
		visit[b] = true; // 방문한 정점임을 체크
		
		
		while (!queue.isEmpty()){
			b = queue.poll();
			System.out.print(b + " ");
			
			for (int i=1; i<n+1; i++){
				if(map[b][i] == 1 & !visit[i]) { // 간선으로 연결되었으며 아직 방문하지 않은 정점 
					queue.offer(i);
					visit[i] = true;
				}
			}
		}
	}
}

//https://sundries-in-myidea.tistory.com/4
//덤으로 이 아재꺼도 보자.