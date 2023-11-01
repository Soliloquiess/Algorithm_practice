package BFS_DFS;

//public class Basic_bfs {
//
//}
import java.util.*;
import java.util.Queue;

public class Basic_bfs {

	public static void main(String[] args) {

		char[][] grid = {
				{ '1', '1', '0', '0', '1' },
				{ '1', '1', '0', '0', '0' }, 
				{ '0', '0', '0', '0', '0' },
				{ '0', '0', '0', '1', '1' } };

		Basic_bfs a = new Basic_bfs();
		System.out.println(a.numberOfIsland(grid));
	}

	int numberOfIsland(char[][] grid) {
		if (grid == null || grid.length == 0)
			return 0;
		int count = 0;

		for (int i = 0; i < grid.length; i++) {	//row(행)
			for (int j = 0; j < grid[i].length; j++) {	//col(열)
				if (grid[i][j] == '1') {	//1인경우 육지니까 육지를 찾는다.
					count++;
					bfs(grid, i, j);	//
				}
			}
		}
		return count;
	}

	int[][] dirs = { { -1, 0 }, { 1, 0 }, { 0, 1 }, { 0, -1 } };
	static int k = 0;

	void bfs(char[][] grid, int x, int y) {		//
		Queue<int[]> queue = new LinkedList<>();
		//integer 배열
		queue.offer(new int[] { x, y });
		//큐에다 x,y에 대한 값 넣음.	처음엔 0,0 들어올 듯.
		while (!queue.isEmpty()) {	//만약 큐에 있으면 큐에 있는 거 뽑음.
//				int size = queue.size();
			int[] point = queue.poll();	//
//				for(int i=0; i<size; i++) {
			for (int[] dir : dirs) {	//큐를 사방으로 조사.
				int x1 = point[0] + dir[0];	//y축. 포인트 0번방 + 디렉션 0번방.
				int y1 = point[1] + dir[1];	//x축	
//				System.out.println("x1 " + x1 + " " + "    y1 " + y1 + "    " + grid[x][y] + " k " + k);
//				k++;
				if (x1 >= 0 && y1 >= 0 && x1 < grid.length && y1 < grid[0].length && grid[x1][y1] == '1') {
					//조건 체크해서 1을 0으로 만들어 줘야 한다. 												
					//들어오는 조건을 if문으로 x1,y1이 -가 되면 안됨. 그리고 행렬의 범위를 넘기면 안됨.		
					//그리고  grid[x1][y1] == '1'가 1일때 들어가야한다.
					
					
					grid[x1][y1] = '0';
					queue.offer(new int[] { x1, y1 });

				}
			}
//		저 싸피 해봤는데 거기도 스태프들이나 프로같이 있는데
//		피드백 속도랑 일처리가 진짜 기가 막힙니다. 감탄밖에 안나옴..
//		이래서 머기업을 가야..
//		저도 42 예전에 문의했는데 화난적 있어서 

		}

	}

}