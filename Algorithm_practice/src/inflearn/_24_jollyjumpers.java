package inflearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class _24_jollyjumpers {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st; 
		Scanner sc = new Scanner(System.in);
		int n, i, now, pre, pos;
//		scanf("%d", &n);
		n = sc.nextInt();
//		vector<int> ch(n);
		int [] ch = new int [n];
		//이렇게 쓰면 n-1까지의 배열이 생성되고 그 안의 내용들은 0으로 초기화된다.

//		scanf("%d", &pre); //얘도 첫번째 숫자 읽는거
		pre = sc.nextInt();
		for (i = 1; i < n; i++) {
//			scanf("%d", &now);
			now = sc.nextInt();
			pos = Math.abs(pre - now);		//절대값 함수 호출.
			if (pos > 0 && pos < n && ch[pos] == 0) ch[pos] = 1;	

			//0 ~n의 범이 안에 있는지 그리고 5를 넣었다고 가정시 배열 0~4 까지의 배열 내용이 0인지 맞으면 1 넣음.(중복체크 의미도 있음)
			//그리고 (pos > 0 && pos < n) 얘를 먼저 넣는데 예를 들어 n = 5, 1 4 2 3 9 를 입력하면 차닌 3 2 1 6 인데  그럼 ch[6]=0이 되게 된다.
			//근데 배열은 ch[0]~ch[4]까지이므로 ch[6]은 못온다. 그래서 이 부분을 거짓으로 만들기 위해 (pos > 0 && pos < n)
			//이 부분을 먼저 실행하고 범위 벗어나면 바로 벗어나게 한다.


			else {		//if문 만족 안할시 (중복하거나 할시) 바로 no출력하고 끝냄.
				System.out.println("NO");
				
			}
			pre = now; //pre는 현재의 now가 되고 그 다음 ,	이 now가 앞의 항으로 전환되고 읽어들이는게 now 됨
		}
		System.out.println("YES");
		
	}
}