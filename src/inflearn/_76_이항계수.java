package inflearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class _76_이항계수 {
	
	static int[][] dy= new int[21][21];

	//5C3 은 어케 계산하나. 4C2+ 4C3	자기가 참여한 부분집합 자기가 참여하지 않은 부분집합 2개로 분리 가능.
	//내가 들어가있을수도 아닐수 있는경우 2가지로 구분 가능.
	//4C2는 일단 5는 무조건 들어가고 나머지 4에서 아무나 와라 . 4C3은 4명중 3명 뽑아라 5인 나는 들어가지 않겠다라는 의미.
	//5명의 학생이 있다 치면 
	static int C(int n, int r) {
		if (dy[n][r] > 0) return dy[n][r];	//그 값이 있다면 리턴함.(전역변수는 0인데 0보다 크면 언제 재귀가 돌면서 구해져서 저장됨)
		//이게 메모이제이션. 배열에 저장했다가 전에 있던 값이 있으면 가지 뻗지 말고 바로 리턴. (강의 13:10 참조)
		//만약 0보다 크면 값이 구해져서 저장이 된거. 그럼 행렬로 같은 값이 들어오면 배열에 있던 그 값을 리턴해버리면 됨.

		if (n == r || r == 0) return 1;		//n과 r이 같아지거나 r이 0되었을 떄 리턴하고 
		else return dy[n][r] = C(n - 1, r) + C(n - 1, r - 1);		//그 외에는 DFS로 (여기선 DFS를 C로 이름 바꿈,) 나 빼고 n-1 하고 r-1은 내가 참여
		//그냥 r은 내가 참여하지 않는거 (5가)	r-1이 왼쪽 자식노드 r이 오른쪽 자식노드
		//dy[n][r]에 넣고 C(n - 1, r) + C(n - 1, r - 1); 이 값이 리턴 받으면 만약 3,2 리턴 받으면 3행 2열 리턴 받는데 그 값을
		//nr인 3행 2열에 저장하고 그 값을 리턴 받는거.
		//이렇게 하면 굉장히 재귀가 빠르게 가지가 쳐진다.

	}

	
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine(), " ");
		

		int n, r;
//		scanf("%d %d", &n, &r);
		n= Integer.parseInt(st.nextToken());

		r= Integer.parseInt(st.nextToken());
		System.out.printf("%d\n", C(n, r));
	}
}

