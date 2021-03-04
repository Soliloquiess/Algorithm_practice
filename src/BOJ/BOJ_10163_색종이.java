package BOJ;

//public class BOJ_10163_색종이 {
//
//}

import java.util.*;

public class BOJ_10163_색종이 {
	static int N; //색종이 개수
	static int[][] map; // 도화지
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt(); //색종이 개수
		
		map = new int[10][10]; // 도화직 크기 최대 가로, 세로 101칸
		
		for(int tc=1; tc<=N;tc++) {
			int a =sc.nextInt(); // X좌표
			int b =sc.nextInt(); // Y좌표
			int c =sc.nextInt(); // 너비
			int d =sc.nextInt(); // 높이
			
			//색종이의 크기만큼 탐색하면서 x,y좌표에 첫 번째 테스트케이스가 1인 경우 1입력 2인 경우 2 입력
			for(int i=a;i<a+c;i++) {
				for(int j=b;j<b+d;j++) {
					map[i][j] = tc;
				}
			}
		}
		
		//테스트케이스가 1부터 N까지 탐색을 하면서 갯수 출력
		for(int rep=1;rep<=N;rep++) {
			int count=0;
			for(int i=0;i<10;i++) {
				for(int j=0;j<10;j++) {
					if(map[i][j]==rep) count++;
				}
			}
			System.out.println(count);
		}
	}
}