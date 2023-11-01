package BFS_DFS;

public class Basic_dfs {

	public static void main(String[] args) {
		char[][] grid = {
				{ '1', '1', '0', '0', '0' },
				{ '1', '1', '0', '0', '0' }, 
				{ '0', '0', '1', '0', '0' },
				{ '0', '0', '0', '1', '1' } };

		Basic_dfs a = new Basic_dfs();
		System.out.println(a.numsIslands(grid));
	}

	int[][] dirs = { { 0, 1 }, { 0, -1 }, { 1, 0 }, { -1, 0 } };
	int m, n;

	int numsIslands(char[][] grid) {
		if (grid == null || grid.length == 0 || grid[0].length == 0)
			return 0;
		m = grid.length;
		n = grid[0].length;
		int count = 0;
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (grid[i][j] == '1') {
					count++;
					System.out.println("i: " + i + " y: " + j);
					dfs(grid, i, j);
				}
			}	
		}
		return count;
	}

	void dfs(char[][] grid, int i, int j) {
		System.out.println("==merge=====i: " + i + " y: " + j);
		if (i < 0 || i >= m || j < 0 || j >= n || grid[i][j] != '1')
			//범위 벗어나거나 배열값으로 들어온게 1이 아니면 던져주는 거.
			return;
		grid[i][j] = 'X';	//다시는 안갈꺼니까 0을 넣던가 X를 넣던가

		
//				for(int[] dir: dirs) {
//					merge(grid, i+dir[0], j+dir[1]);
//				}
// 		이 45~48 주석 부분이 밑의 dfs 부분과 같다. dfs 밑의 줄과 똑같은 결과 반환.
		

		dfs(grid, i - 1, j);
		dfs(grid, i + 1, j);
		dfs(grid, i, j + 1);
		dfs(grid, i, j - 1);
	}

}