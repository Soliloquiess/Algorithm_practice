package inflearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _03_진약수의_합 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n,i;
		int sum =1;
		System.out.print(1);
		n = Integer.parseInt(st.nextToken());
		for(i=2;i<n;i++) {
			if(n%i==0) {
				sum+=i;
				System.out.print(" + "+i);
			}
		}
		System.out.println(" = " +sum);
	}
}