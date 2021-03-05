package inflearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _19_분노유발자 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st; 
		st = new StringTokenizer(br.readLine()," ");		

		int n, i, cnt = 0,  max;
		int []h = new int[101];
		n = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine()," ");	
		for (i = 1; i <= n; i++) {
			h[i] = Integer.parseInt(st.nextToken());
		}
		max = h[n];	//맨 뒤를 맥스로 줌
		for (i = n - 1; i >= 1; i--) {		//맨 뒤에서 부터 앞으로 가면서 비교한다.(for문을 거꾸로 돌게 한다.)
			if (h[i] > max) {
				max = h[i];
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}