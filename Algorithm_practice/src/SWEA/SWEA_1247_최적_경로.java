package SWEA;


import java.util.*;
//
//public class SWEA_1247_최적_경로 {
//	static int N;
//	static int Min;
//	
//	public static void Perm(int num,int[][] map, int[] result, boolean[] check) {
//		//집도착
//		if(num==N+1) {
//			int sum = 0;
//			//최소 거리의 합 계산
//			for(int i=0;i<N+1;i++) {
//				sum += Math.abs(map[result[i]][0]-map[result[i+1]][0]) + Math.abs(map[result[i]][1]-map[result[i+1]][1]);
//			}
//			
//			//가지치기->실행시간 줄일 수 있음.
//			if(sum<Min) Min = sum;
//			return;
//		}
//		
//		//집을 0과 방문으로 체크
//		result[0] = 0;
//		check[0] = true;
//		
//		//회사를 N+1과 방문으로 체크
//		result[N+1] = N+1;
//		check[N+1] = true;
//		
//		
//		//순열 생성
//		for(int i=1;i<N+1;i++) {
//			if(check[i]) continue;
//			result[num] = i;
//			check[i] = true;
//			Perm(num+1,map,result,check);
//			check[i] = false;
//		}
//	}
//	
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int T = sc.nextInt();//테스트케이스 개수 입력
//		
//		for(int tc=1;tc<=T;tc++) {
//			N = sc.nextInt();//고객의 수
//			
//			int[][] map = new int[N+2][2]; //좌표저장배열
//			boolean[] check = new boolean[N+2]; //방문 체크
//			int[] result = new int[N+2]; //뽑는 결과
//			
//			//최소
//			Min = Integer.MAX_VALUE;
//			
//			//집좌표
//			map[0][0] = sc.nextInt();
//			map[0][1] = sc.nextInt();
//			
//			//회사좌표
//			map[N+1][0] = sc.nextInt();
//			map[N+1][1] = sc.nextInt();
//			
//			//고객의 좌표 입력 받아서 1~N까지 입력
//			for(int i=1;i<=N;i++) {
//				map[i][0] = sc.nextInt();
//				map[i][1] = sc.nextInt();
//			}
//			Perm(1,map,result,check);
//			System.out.printf("#%d %d\n",tc,Min);
//		}
//		
//	}
//	
//	
//}


import java.util.Scanner;

public class SWEA_1247_최적_경로 {
 
    static int N, min;
    static Point company;
    static Point home;
    static Point map[];
    static boolean visited[];
 
    static class Point {
        int r, c;
 
        public Point(int r, int c) {
            this.r = r;
            this.c = c;
        }
    }
 
    static void dfs(int idx, Point current, int tmp) {
        if(min <= tmp)
            return;
         
        if (idx == N) {
            tmp += Math.abs(home.r - current.r) + Math.abs(home.c - current.c);
            min = Math.min(min, tmp);
        }
        for (int i = 0; i < N; i++) {
            if (!visited[i]) {
                visited[i] = true;
                int dist = Math.abs(map[i].r - current.r) + Math.abs(map[i].c - current.c);
                dfs(idx + 1, map[i], tmp + dist);
                visited[i] = false;
            }
        }
    }
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int T = sc.nextInt();
        for (int tc = 1; tc <= 10; tc++) {
            N = sc.nextInt();
            company = new Point(sc.nextInt(), sc.nextInt());
            home = new Point(sc.nextInt(), sc.nextInt());
            min = Integer.MAX_VALUE;
            map = new Point[N];
            visited = new boolean[N];
 
            for (int i = 0; i < N; i++) {
                map[i] = new Point(sc.nextInt(), sc.nextInt());
            }
 
            dfs(0, company, 0);
            System.out.println("#" + tc + " " + min);
        }
    }
}