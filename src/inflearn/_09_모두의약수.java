package inflearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _09_모두의약수 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int []cnt =new int[50001];
		int n, i, j;
		n = Integer.parseInt(br.readLine());
		for (i = 1; i <= n; i++) {
			for (j = i; j <= n; j = j + i) {	//j는 j+i(i의 배수로 돌아야)
				//배열로 주고 배열 안 전부 1로 둔 다음. 해당 수가 배열 들어오면 그 수를 증가시키면 됨.
				cnt[j]++;
			}
		}
		for (i = 1; i <= n; i++) {
			System.out.print(cnt[i]+" ");
		}
	}
}
