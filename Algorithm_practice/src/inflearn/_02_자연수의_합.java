package inflearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _02_자연수의_합 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a,b,i;
		int sum =0;
		a = Integer.parseInt(st.nextToken());
		b = Integer.parseInt(st.nextToken());
		
		for( i=a; i<b;i++) {
			sum +=i;
			System.out.print( i+"+");

		}
		System.out.printf("%d = %d\n", i, sum+i);
		System.out.println();
	}
}