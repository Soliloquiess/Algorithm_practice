package BOJ;

//public class BOJ_2564_경비원 {
//
//}
import java.util.Scanner;

/**
 * @author YSM
 *
 */
public class BOJ_2564_경비원 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();	//가로
		int c = sc.nextInt();	//배열 세로
		int n = sc.nextInt();	//상점의 개수
		
		int[] pos = new int[n+1];
		
		// 0,0 지점부터 모든 상점과 경비까지의 거리를 입력.
		// 왼쪽 모러리를 거리 계산의 기준으로 한다.
		for(int i = 0; i <= n; i++) {
			int block = sc.nextInt();	//블럭위치(동서남북)
			int point = sc.nextInt();	//거리?
			switch(block) {
			case 1:	//뷱
				pos[i] = point;
				break;
			case 2:	//남
				pos[i] = 2*r + c - point;
				break;
			case 3:	//서
				pos[i] = 2*(r + c) - point;
				break;
			case 4:	//동
				pos[i] = r + point;
				break;
			}
		}
		int totalDistance = 0;
		for( int i = 0; i < n; i++) {
			int tmp = Math.abs(pos[i]-pos[n]); // 반시계
			int tmp2 = 2*(r+c) - tmp; // 시계
			totalDistance += tmp < tmp2 ? tmp : tmp2;
		}
		System.out.println(totalDistance);
	}
}

/*

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 경비원 X의 위치 계속 바귐~
		String[] line = br.readLine().split(" ");
		int R = Integer.parseInt(line[0]);
		int C = Integer.parseInt(line[1]);

		int N = Integer.parseInt(br.readLine());
		int[] dist = new int[N + 1];
		for (int i = 0; i <= N; i++) {
			line = br.readLine().split(" ");
			int w = Integer.parseInt(line[0]);
			int d = Integer.parseInt(line[1]);

			//남쪽 0 위치를 기준으로 시계방향 거리 계산
			if (w == 1) {
				dist[i] = 2 * R + C - d;
			} else if (w == 2) {
				dist[i] = d;
			} else if (w == 3) {
				dist[i] = 2 * R + C + d;
			} else if (w == 4) {
				dist[i] = R + C - d;
			}
		}

		int answer = 0;
		for (int i = 0; i < N; i++) {
			dist[i] = Math.abs(dist[i] - dist[N]);  // 동근이의 위치를 기준으로 거리 계산
			dist[i] = Math.min(dist[i], 2*R+2*C - dist[i]);
			answer += dist[i];
		}

		System.out.println(answer);
	}

}
*/
