package _2D_Array;

//public class _01_Array2D {
//
//}

public class Array2D {
	
	public static void main(String[] args) {
		Array2D a = new Array2D();
		
		//1. 2�����迭�� ũ�Ⱑ ����
		int[][] grid = new int[3][4];
		System.out.println("===1��======");
		a.print(grid);
		
		grid[0][1]=16;
		System.out.println("===after======");
		a.print(grid);
		
		
		//2. 2�����迭ũ�Ⱑ �ٸ����
		int[][] grid2 = new int[3][];
		System.out.println("===2��======");
//		a.print(grid2);
		grid2[0] = new int[1];
		grid2[1] = new int[1];
		grid2[2] = new int[5];
		System.out.println("===after======");
		a.print(grid2);
		
		//3. �ʱ�ȭ�� ���ÿ� ���� ������
		int[][] grid3 = {{1,2},
				 {0,0,3},
		                 {4,5,6}} ;
		
		System.out.println("===3 after======");
		a.print(grid3);
		
	}
	
	//1. 
	public void print(int[][] grid) {
		for(int i=0; i<grid.length; i++) {
			for(int j=0; j<grid[i].length; j++) {
				System.out.print(grid[i][j]+" ");
			}
			System.out.println();
		}
	}

}