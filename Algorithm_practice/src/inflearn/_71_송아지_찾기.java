package inflearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class _71_송아지_찾기 {

	public static void main(String[] args) throws IOException {

		InputStream is = System.in;
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		StringTokenizer st;
		st = new StringTokenizer(br.readLine(), " ");
		

		int []ch= new int[10001];
		int []d = { 1, -1, 5 };
//		queue<int> Q;
		//freopen("input.txt", "rt", stdin);
		int s, e, x, pos, i;
		Queue<Integer> Q = new LinkedList<>(); //int형 queue 선언, linkedlist 이용

		
//		scanf("%d %d", &s, &e);
		s = Integer.parseInt(st.nextToken());
		e = Integer.parseInt(st.nextToken());
		ch[s] = 1;		//s라는 지점은 다시는 큐에 들어가지 말아라. 출발지점이 0이아닌 1이라 가기 전 지점을 답으로 출력한다.
		
		Q.add(s);		//출발지점 넣음
		while (!Q.isEmpty()) {		//BFS탐색 일어남. 비어있기 전까지는 계속 돔
			x = Q.peek();
			Q.poll();			//첫번째 자료 꺼냄.
			for (i = 0; i < 3; i++) {		//여기서 계산.
				pos = x + d[i];				// 현재지점은 x 여기에 더하기를 하거나 뺴기를 하거나 하면 가려는 지점.	계속 도는데 그 지점이 원하는 지점인지 확인
				//왜 송아지가 있는 pos가 아닌 바로 전지점을 출력하나? 출발지점이 1로 체크해서. 출발지점은 원래 0이여야. 도착지점보다 1이 크게 되어있음.
				
				if (pos <= 0 || pos > 10000) continue;		//pos의 지점.
				if (pos == e) {		//pos=e면 우리가 원하는 지점 맞음.
					System.out.printf("%d\n", ch[x]);
					System.exit(0);		//이러면 프로그램 자체가 종료됨.
				}
				if (ch[pos] == 0) {		// ch라는 배열은 방문 했는지 체크배열도 되지만 거리배열도 됨 
					ch[pos] = ch[x] + 1;		// x지점까지 가는데 최소횟수가 들어잇음. 거기에 pos지점 가니까 +1을 해줌.
					//ch라는 배열이 최소횟수와 거리까지 다 구해줌.
					Q.add(pos);	//Q.push(pos)
				}
			}
		}
	}
}