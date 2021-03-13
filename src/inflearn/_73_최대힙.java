


package inflearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

//C++에서 최소힙을 여기 넣으니까 자바에선 최대힙이 된다. 아래는 74문제가 자바에서 최대힙
public class _73_최대힙 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
//		st = new StringTokenizer(br.readLine(), " ");
		

//		priority_queue<int> pQ;

		PriorityQueue<Integer> pQ = new PriorityQueue<>();
		
		
		while (true) {
//			scanf("%d", &a);
			int a = Integer.parseInt(br.readLine());
			if (a == -1) break;
			if (a == 0) {
				if (pQ.isEmpty()) System.out.printf("-1\n");
				else {
					System.out.printf("%d\n", -pQ.peek());		//여기도 출력할 때 - 붙여주면 됨. 원상태 복구.
					pQ.poll();
				}
			}
			else pQ.add(-a);		//-a만 바꿔주면 됨 작은 값이 루트로 들어가는 효과. 음수지만 절대값으로 하면 작은값
		}
	}
}