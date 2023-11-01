package inflearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class _26_말아톤 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st; 
		Scanner sc = new Scanner(System.in);
		int i, j, n, cnt = 0;
//		scanf("%d ", &n);
		
		n = Integer.parseInt(br.readLine());
//		vector<int> a(n + 1);			//	N+1해야 0~N까지 의 배열이 생기므로
		int [] a = new int [n+1];
		st = new StringTokenizer(br.readLine(), " ");
		for (i = 1; i <= n; i++) {
//			scanf("%d", &a[i]);
			a[i] = Integer.parseInt(st.nextToken());
		}
//		printf("1 ");	//첫번째 사람은 그냥 1등
		System.out.print("1 ");
		for (i = 2; i <= n; i++) {		//첫번째는 1등이 가능하므로 2부터 돈다.
			cnt = 0;		//매 사람마다 초기화(j 포문 돌기 전에 초기화 해줘야. j는 i라는 사람이므로)
			for (j = i - 1; j >= 1; j--) {
				if (a[j] >= a[i]) cnt++;			//앞에 달리고 있는 사람에 + 해주는거임.
				//a[j]는 내 앞에 달리고 있는 사람. 내 앞에 있는 사람이 값이 크거나 같으면 제칠 수 없으므로 등수가 밀려남.
				// 그리고 카운팅 끝나면. i라는 사람의 등수 출력.
			
			}
//			printf("%d ", cnt + 1);			//cnt가 0이였으므로 +1
			System.out.printf("%d ", cnt + 1);	
		}

	}	
}
	
