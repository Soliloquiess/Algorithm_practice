package inflearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class _35_Special_Sort {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st; 
		Scanner sc = new Scanner(System.in);
		
		int  n, tmp, min, i, j;
		int []a = new int[101];
//		scanf("%d", &n);
		n = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine()," ");
		for (i = 0; i < n; i++) {
//			scanf("%d", &a[i]);
			a[i] = Integer.parseInt(st.nextToken());
		}
		for (i = 0; i < n - 1; i++) {
			for (j = 0; j < n - i - 1; j++) {
				if (a[j] > 0 && a[j + 1] < 0) { //
					//j가 앞쪽(j가 양수) 그리고 j+1이 음수면 둘의 자리바꿈 해라.
					//그리고 a[j + 1] < 0 인 이유는 음수면 바꾸지 말고 입력된 그대로를 출력해야 하므로
					//그냥 if (a[j] > 0 && a[j + 1] < 0) 부분에 조건을 뺴고 더해보면서 실행해보자.

					//if (a[j] > a[j + 1]) 가 원래 오름차순으로 정렬되는 버블정렬(이렇게 쓰면 마이너스 까지 다 정렬)

					//여기 알고리즘(if()안의 내용이 아주 중요
					tmp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = tmp;
				}
			}
		}
		for (i = 0; i < n; i++) {
			System.out.printf("%d ", a[i]);
		}
	}
}

	