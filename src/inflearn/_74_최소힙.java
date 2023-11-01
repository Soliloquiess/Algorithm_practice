package inflearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;


//C++에서 최대힙을 여기 넣으니까 자바에선 최대힙이 된다. 아래는 73문제가 자바에서 최소힙
public class _74_최소힙 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
//		st = new StringTokenizer(br.readLine(), " ");
		

		int a;
//		priority_queue<int> pQ;	//우선순위 큐 자료형은 int 저장
		PriorityQueue<Integer> pQ = new PriorityQueue<>();

		
		while (true) {
			a = Integer.parseInt(br.readLine());
			if (a == -1) break;		//a가 -1이면 종료
			if (a == 0) {			//a가 0이면 큐가 비어있으면 -1 출력
				if (pQ.isEmpty()) {
					System.out.printf("-1\n");//이게 참이면 -1 출력(비어있지 않으면)
				}
				else {				//a가 0인데 큐가 비어있지 않으면 max값 출력.
					System.out.printf("%d\n", pQ.peek());	//pQ.top얘가 루트값. 그리고 팝 시킴.
					pQ.poll();		//팝 시키면 루트에서 제거됨.
				}
			}
			else pQ.add(a);
		}
	}
}

