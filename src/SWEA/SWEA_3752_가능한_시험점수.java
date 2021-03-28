package SWEA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.StringTokenizer;

//부분집합은 아니다. 2의 100승이기 때문.
//문제의 개수 N, 2의 100승 -> 부분집합 X
//삼성코테는 논리력 중요. 근데 dp는 논리력과는 다름. 경험적 요소가 많아서 삼성코테에서 dp는 안 나옴.
//완탐으로 생각해보고 그럼 그리디 이런식으로 나눠가야한다.
public class SWEA_3752_가능한_시험점수 {
//	static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder output = new StringBuilder();
	static StringTokenizer tokens;
	
	static int T;
	static int N;
	static int score[];
	static boolean visited[];
	static int Answer;
	public static void main(String[] args)  throws IOException{
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		//입력에 대한 크기도 고려해 봐야 해서 이 문제를 넣었다.
		T = Integer.parseInt(input.readLine());
		for(int t = 1; t<=T;t++) {
			N = Integer.parseInt(input.readLine());
			score = new int[N];
			tokens = new StringTokenizer(input.readLine(), " ");
			int total = 0;
			for(int i = 0; i<N;i++) {
				score[i] = Integer.parseInt(tokens.nextToken());
				total+=score[i];
			}
			//맞을 수 있는 점수들을 표현해 줄 배열.
			visited = new boolean[total+1];
			
			Answer = 0;
			visited[0] = true; //0점은 언제나 존재한다.
			solve(0,total);
			output.append("#").append(t).append(" ").append(Answer).append("\n");
		}
	}
	
	static void solve(int n, int max)
	{
		if(n==N) {
			//끝~~->결과 확인 - 배열에 몇개가 체크 되어있는지 살펴보자,.
			for(boolean bool: visited) {
				if(bool) {
					Answer++;
				}
			}
			return;
		}
		for(int i = max; i>=0; i--) {
			if(visited[i]) {
				visited[i+score[n]]=true;	//한녀석 끝나면 다음 재귀로 가준다.
			}
		}
		solve(n+1, max);
	}
}


/*
2
3
2 3 5
10
1 1 1 1 1 1 1 1 1 1
 */
//2, 3, 5
// 