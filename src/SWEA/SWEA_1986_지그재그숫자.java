package SWEA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SWEA_1986_지그재그숫자 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int sum =0;
		
		int T = Integer.parseInt(br.readLine());
		for(int tc = 0; tc<T;tc++) {
			int N = Integer.parseInt(br.readLine());
			for(int i =1; i<=N;i++) {
				if(i%2==0) {
					sum -=i;
				}
				else
				{
					sum+=i;
				}
			}
			
			System.out.printf("#%d %d", tc+1,sum);
			sum =0;
		}
	}
}


