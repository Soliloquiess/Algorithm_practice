package inflearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class _27_N팩토리얼의표현법 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st; 
		Scanner sc= new Scanner(System.in);
		int n, i, j, tmp;
//		scanf("%d", &n);
		n = Integer.parseInt(br.readLine());
//		vector<int> ch(n + 1);	//각 요소가 0인 배열을 n개까지 있는 배열로 만듬.
		int []ch = new int[n+1];
		//1은 소수 아니므로 소인수분해 하면 안됨(배열 채우면 안됨)

		for (i = 2; i <= n; i++) {		//2부터 소인수 분해 해서  배열 채움.
			tmp = i;
			j = 2;
			while (true) {
				if (tmp % j == 0) {		//tmp를 j가 나눠 떨어지게 하는 지 보자.		소수들만 여기서 발견 됨.
					
					tmp = tmp / j;		//나눠 떨어지면 몫으로 바꿔야
					ch[j]++;			//그리고 인수가 발견 되었다. 그리고 더해야 됨.
				}
				else j++;				//나눠 떨어지지 않으면 j증가
				if (tmp == 1) break;
			}
		}
//		printf("%d! = ", n);
		System.out.printf("%d! = ", n);;
		for (j = 2; j <= n; j++) {
			if (ch[j] != 0) System.out.printf("%d ", ch[j]);
			//체크가 된것만 개수 출력하면 됨.
		}

	}
}

