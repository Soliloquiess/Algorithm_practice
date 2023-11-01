package inflearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _11_숫자의총개수 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n, i, cnt = 0, tmp;
		n= Integer.parseInt(br.readLine());
		for (i = 1; i <= n; i++) {
			tmp = i;
			while (tmp > 0) {
				tmp = tmp / 10; //이게 한자리씩 없어지는거 최종적으로 0이 됨.
				//123이면 
				//12 되고 카운팅 1 되고
				//1 되고 카운팅 2개되고 다시 돌면서 
				//0 되고 카운팅 3 되고 브레이크 하고 올라가서 다시 계산
				//123이면 카운팅 3개 되는거 (3자리수라는 뜻임)
				cnt++;
			}
		}
		System.out.printf("%d\n", cnt);
	}
	
	
}
