package SWEA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/*
7
8
0 1
0 2
1 3
1 4
2 4
3 5
4 5
5 6
*/

public class G2_AdjListTest {
	
	static class Node{
		
		int vertex;
		Node next;
		//연결리스트의 요소 하나하나 나타내려 만듬.
		//정점 번호랑 연결리스트 역할위한 링크의노드 포인터 가짐.
		public Node(int vertex, Node next) {	//생성자 생성.(노드생성)
			super();
			this.vertex = vertex;
			this.next = next;
			
		}
		public Node(int vertex) {		//정점정보만 있는 노드 생성.
			super();
			this.vertex = vertex;
		}
		@Override
		public String toString() {	//오버라이딩
			return "Node [vertex=" + vertex + ", next=" + next + "]";
		}
		
	}

	static int N;
	static Node[] adjList;	//노드 배열
	static boolean[] visited;
	//0번 정점에 서 인접해있는	인접 정점들의 연결리스트의 몫(head)
	//기차의 처음만 가져오면 다 딸려오듯. 리스트 처음만 알면 링크 따라 다 끌고 옴.
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		int C = Integer.parseInt(br.readLine());
		adjList = new Node[N];	//정점의 개수만큼 배열 만듬
		
		StringTokenizer st = null;
		for(int i =0; i<C;i++) {
			st = new StringTokenizer(br.readLine()," ");
			int from = Integer.parseInt(st.nextToken());
			int to = Integer.parseInt(st.nextToken());
			adjList[from] = new Node(to,adjList[from]);
			//0번 노드에서 마지막 노드 따라간 다음 그 마지막 노드 뒤에 붙여야(0-2면)
			//0-3이면 똑같이 2 마지막 따라가서 붙인다.
			//그리고 이 부분들이 상관이 없다.
			//from 의 정점의 헤드를 지금 새로 만드는 애로 바꿔라 대신 새로 만드는 애가 첫째가 되기 위해선 기존 헤드 정보를 넥스트에 두어서 자신의 뒤로 오게 하면 계속 첫번쨰 노드로 집어넣게 되는 것

			adjList[to] = new Node(from,adjList[to]);	//뒤집어서 한번 더해야
			//이렇게 하면 인접리스트 끝. 간선개수만큼 하면 지금 한 작업들이 계속 반복되면 각 노드마다 인접한 정점으로 연결리스트 만들고 각 헤드를 다 물고 있게 된다.
			
		}
		bfs();
		
		visited = new boolean[N];
		visited[0] = true;
		dfs(0);
	}
	private static void bfs() {
		Queue<Integer> queue = new LinkedList<Integer>();
		boolean [] visited = new boolean[N];
		
		//탐색 시작 정점 : 0으로 출발
		int start =0;
		queue.offer(start);
		visited[start] = true;
		
		while(!queue.isEmpty()) {	//큐가 비어있지 않을때까지 돌면서
			int current = queue.poll();	//뺀다(가장 앞의 정점)
			//현재 정점에 관련된 처리
			System.out.println((char)(current+65));	
			
			//인접 정점 탐색(여기서 부터 달라짐)	
			//아까는 인접행렬이라 정점개수만큼 들여다보며 하나씩 체크했는데 이번은 인접리스트라 어떤정점의 인접리스트엔 인접한 애들만 들어있ㅅ다.
//			그래서 인접여부 체크 할 필요가 없다.
			for(Node temp = adjList[current]; temp!=null; temp = temp.next) {
				//Node temp = adjList[current]; 이게 인접리스트의 첫번쨰 해드
				
//for(Node temp = adjList[current]; temp!=null; temp = temp.next) { 이 부분은 인접 정점만 반복처리
//탐색하는 법이 바뀌는 거 bfs 논리는 그대로임. 이 아래는 인접 체크 조건이 바뀐거. 불필요한 조건이 없어짐.
				
					if(!visited[temp.vertex]) {	//연결은 되어있으니 인접여부는 판단할 필요가 없고  노드가 저장된 정점을 보면 그게 어떤 정점 정보인지 알 수 있다. 그게 방문되었는지 아닌지만 체크
						queue.offer(temp.vertex);
						visited[temp.vertex] = true;
					}
					
				}
			}
		}
	
	private static void dfs(int current) {
	
		System.out.println((char)(current+65));
		
		for(Node temp = adjList[current]; temp!= null; temp = temp.next) {
			if(!visited[temp.vertex]) {

				visited[current] = true;
				dfs(temp.vertex);
			}
		}
	}	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
