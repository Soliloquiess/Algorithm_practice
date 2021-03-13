package inflearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {

		InputStream is = System.in;
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		StringTokenizer st;
		st = new StringTokenizer(br.readLine(), " ");
//		queue<int> Q;
		Queue<Integer> Q = new LinkedList<>(); //int형 queue 선언, linkedlist 이용

		int i,n,k;
//		scanf("%d %d", &n, &k);
		n= Integer.parseInt(st.nextToken());
		k= Integer.parseInt(st.nextToken());
		for (i = 1; i <= n; i++) {		//왕자 푸시
			Q.add(i);
		}
		while (!Q.isEmpty()) {
			for (i = 1; i < k; i++) {		//이 사람들은 뒤로 푸시됨(열에서 없어지는 건 아님) k라고 외친 사람들임.
				Q.add(Q.peek());		//젤 앞에 있는 값을 뒤로 푸시
				Q.poll();				//그리고 그 앞의 값을 팝 시킴
			}
			Q.poll();
			if (Q.size() == 1) {		//큐에 자료 몇개 있냐. 
				//자료가 1일때 열에서 1개 남음. 그 떄 출력
				System.out.printf("%d\n", Q.peek());
				Q.poll();
			}
		}
	}
}




