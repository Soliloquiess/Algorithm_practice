package inflearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class _34_버블정렬 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st; 
		Scanner sc = new Scanner(System.in);
		
		int n, i, j, tmp;
		int []a = new int [101];
//		scanf("%d", &n);
		n = Integer.parseInt(br.readLine());
		
		
		st = new StringTokenizer(br.readLine(), " ");
		for (i = 0; i < n; i++) {
//			scanf("%d", &a[i]);
			a[i] = Integer.parseInt(st.nextToken());
		}

		//j포문 돌면서 계속 스왑.
		//가장 큰 수가 맨 뒤로 옴(정렬 할 필요 없어짐. 그러면 그 앞까지 오게 다시 정렬(돌면)됨)
		for (i = 0; i < n - 1; i++) {
			for (j = 0; j < n - i - 1; j++) {			//i는 맨 처음에 0 그리고 맨 뒤자리가 정렬 될수 록 그 앞까지만 돈다.
				if (a[j] > a[j + 1]) {		//앞이 크고 뒤에가 작으면 스왑.
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