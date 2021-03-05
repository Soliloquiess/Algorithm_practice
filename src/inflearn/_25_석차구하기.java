package inflearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class _25_석차구하기 {
public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st; 
		Scanner sc = new Scanner(System.in);
		int i, j,  n;
		int []a = new int[200];
		int []b= new int[200];
//		scanf("%d", &n);
		st= new StringTokenizer(br.readLine()," ");
		n = Integer.parseInt(st.nextToken());

		st= new StringTokenizer(br.readLine()," ");
		for (i = 1; i <= n; i++) {
//			scanf("%d", &a[i]);		//pdf 기준 a[1]부터 a[5]까지 1 다 들어감
			a[i] = Integer.parseInt(st.nextToken());
			b[i] = 1;				//전부 1로 초기화(처음엔 배열 전부 1등)
		}
		for (i = 1; i <= n; i++) {	
			for (j = 1; j <= n; j++) {		//a[i] 와 a[j] 값 비교
				if (a[j] > a[i]) b[i]++;	//맨 앞부터  j 증가시키면서 j가 더 크면 i값을 증가.
			}
		}
		for (i = 1; i <= n; i++) {
			System.out.printf("%d ", b[i]);
		}
	}	
}