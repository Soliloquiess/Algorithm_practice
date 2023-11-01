package BOJ;

import java.util.Scanner;

public class BOJ_4963_섬의개수 {
	static int[][] visit;
	static int[][] map;
	static int N, M;
	static int ans;
	static int[] dx = { 0, 0, 1, -1, 1, -1, 1, -1 };
	static int[] dy = { 1, -1, 0, 0, 1, 1, -1, -1 };

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			ans = 0;
			M = sc.nextInt();
			N = sc.nextInt();
			if(N == 0 && M == 0) break;
			
			map = new int[N][M];
			visit = new int[N][M];

			for (int i = 0; i < N; i++) {
				for (int k = 0; k < M; k++) {
					map[i][k] = sc.nextInt();
				}
			}

			for (int i = 0; i < N; i++) {
				for (int k = 0; k < M; k++) {
					if (map[i][k] == 0)
						continue;
					dfs(i, k);
					ans++;
				}
			}
			System.out.println(ans);
		}
	}

	static void dfs(int y, int x) {
		for (int i = 0; i < 8; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];

			if (nx < 0 || ny < 0 || nx >= M || ny >= N || map[ny][nx] == 0)
				continue;

			map[ny][nx] = 0;
			dfs(ny, nx);
		}
	}
}



//public class BOJ_4963_섬의개수 {
//
//}
//import java.util.*;
//
//public class Main {
//    static int[][] map;
//    static boolean[][] visit;
//    static int[] move_x = {1,-1,0,0,1,1,-1,-1};
//    static int[] move_y = {0,0,-1,1,1,-1,-1,1}; //대각선은 시계방향.
//    static int w,h;
//    static int cnt = 0;
//
//    static void dfs(int x, int y){
//        visit[x][y] = true;
//
//        for(int i=0; i<8; i++){
//            int mx = x+move_x[i];
//            int my = y+move_y[i];
//
//            if(mx >= 0 && my >= 0 && mx < h && my < w){
//                if(visit[mx][my] == false && map[mx][my] == 1){
//                    dfs(mx,my);
//                }
//            }
//        }
//    }
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        while(true){
//            w = scanner.nextInt();
//            h = scanner.nextInt();
//
//            map = new int[h][w];
//            visit = new boolean[h][w];
//            if(w == 0 && h == 0)
//                break;
//            for(int i=0; i<h; i++){
//                for(int j=0; j<w; j++){
//                    map[i][j] = scanner.nextInt();
//                }
//            }
//            cnt = 0;
//            for(int i=0; i<h; i++){
//                for(int j=0; j<w; j++){
//                    if(map[i][j] == 1 && visit[i][j] == false){
//                        dfs(i,j);
//                        cnt++;
//                    }
//                }
//            }
//            System.out.println(cnt);
//        }
//    }
//}

//import java.util.ArrayList;
//import java.util.LinkedList;
//import java.util.Queue;
//import java.util.Scanner;
//
//public class BOJ_4963_섬의개수 {
//    // 좌표의 상하좌우대각선에 대한 벡터
//    static int[] dx = {0, 0, -1, 1, -1, 1, 1, -1};
//    static int[] dy = {-1, 1, 0, 0, -1, -1, 1, 1};
//
//    static int w, h;
//    static int[][] map;
//    static int[][] visited; // 방문하지 않았으면: 0, 방문했으면: 1
//    static int cntOfIsland; // 섬의 수
//
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        while (true) {
//            w = scanner.nextInt();
//            h = scanner.nextInt();
//            cntOfIsland = 0;
//
//            if (w == 0 && h == 0) break; // 종료 조건: 0 0
//
//            map = new int[h][w];
//            visited = new int[h][w];
//
//            for (int i=0; i<h; i++) {
//                for (int j=0; j<w; j++) {
//                    map[i][j] = scanner.nextInt(); // 땅: 1, 바다: 0
//                    visited[i][j] = 0;
//                }
//            }
//
//            // 좌표 탐색
//            for (int i=0; i<h; i++) {
//                for (int j=0; j<w; j++) {
//                    // 해당 좌표가 땅이고, 방문하지 않은 좌표면 탐색 시작
//                    if (map[i][j] == 1 && visited[i][j] == 0) {
//                        bfs(i, j);
//                    }
//                }
//            }
//            System.out.println(cntOfIsland);
//        }
//    }
//
//    // 너비 우선 탐색
//    static void bfs(int x, int y) {
//        Queue<Pair> queue = new LinkedList<>();
//        queue.add(new Pair(x, y)); // 시작 좌표를 큐에 삽입
//        visited[x][y] = 1; // 방문
//
//        while (!queue.isEmpty()) {
//            int x1 = queue.peek().getX();
//            int y1 = queue.peek().getY();
//            queue.poll(); // 좌표를 방문하고 큐에서 추출
//
//            // 해당 좌표에 대해 상하좌우대각선을 확인
//            for (int i=0; i<8; i++) {
//                int nextX = x1 + dx[i];
//                int nextY = y1 + dy[i];
//
//                // 해당 좌표가 지도 안에 있으면
//                if (nextX >= 0 && nextX < h && nextY >=0 && nextY < w) {
//                    // 해당 좌표가 땅이고, 방문하지 않은 좌표면 같은 섬으로 표시
//                    if (map[nextX][nextY] == 1 && visited[nextX][nextY] == 0) {
//                        queue.add(new Pair(nextX, nextY)); // 다음 좌표를 큐에 삽입
//                        visited[nextX][nextY] = 1; // 방문
//                    }
//                }
//            }
//        }
//        cntOfIsland++; // 섬의 수 증가
//    }
//
//    // 좌표를 위한 클래스
//    public static class Pair {
//        private int x;
//        private int y;
//
//        public Pair(int x, int y) {
//            this.x = x;
//            this.y = y;
//        }
//        public int getX() { return x; }
//        public int getY() { return y; }
//    }
//}
