package inflearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class _29_3의개수는small {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st; 
		Scanner sc= new Scanner(System.in);
		int n, tmp, i, cnt = 0, digit;
//		scanf("%d", &n);
		n = Integer.parseInt(br.readLine());
		for (i = 1; i <= n; i++) {
			tmp = i;
			while (tmp > 0) {
				digit = tmp % 10;			//i라는 숫자 1의 자리 분리.
				if (digit == 3) cnt++;		
				tmp = tmp / 10;				//0되면 break되서 자릿수 분리 시킴.
			}
		}
		System.out.printf("%d\n", cnt);
	}
}



