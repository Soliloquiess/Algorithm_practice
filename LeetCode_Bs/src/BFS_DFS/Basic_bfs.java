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

		for (int i = 0; i < grid.length; i++) {	//row(��)
			for (int j = 0; j < grid[i].length; j++) {	//col(��)
				if (grid[i][j] == '1') {	//1�ΰ�� �����ϱ� ������ ã�´�.
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
		//integer �迭
		queue.offer(new int[] { x, y });
		//ť���� x,y�� ���� �� ����.	ó���� 0,0 ���� ��.
		while (!queue.isEmpty()) {	//���� ť�� ������ ť�� �ִ� �� ����.
//				int size = queue.size();
			int[] point = queue.poll();	//
//				for(int i=0; i<size; i++) {
			for (int[] dir : dirs) {	//ť�� ������� ����.
				int x1 = point[0] + dir[0];	//y��. ����Ʈ 0���� + �𷺼� 0����.
				int y1 = point[1] + dir[1];	//x��	
//				System.out.println("x1 " + x1 + " " + "    y1 " + y1 + "    " + grid[x][y] + " k " + k);
//				k++;
				if (x1 >= 0 && y1 >= 0 && x1 < grid.length && y1 < grid[0].length && grid[x1][y1] == '1') {
					//���� üũ�ؼ� 1�� 0���� ����� ��� �Ѵ�. 												
					//������ ������ if������ x1,y1�� -�� �Ǹ� �ȵ�. �׸��� ����� ������ �ѱ�� �ȵ�.		
					//�׸���  grid[x1][y1] == '1'�� 1�϶� �����Ѵ�.
					
					
					grid[x1][y1] = '0';
					queue.offer(new int[] { x1, y1 });

				}
			}
//		�� ���� �غôµ� �ű⵵ ���������̳� ���ΰ��� �ִµ�
//		�ǵ�� �ӵ��� ��ó���� ��¥ �Ⱑ �����ϴ�. ��ź�ۿ� �ȳ���..
//		�̷��� �ӱ���� ����..
//		���� 42 ������ �����ߴµ� ȭ���� �־ 

		}

	}

}