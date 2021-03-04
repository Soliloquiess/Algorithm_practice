package inflearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _04_나이차이 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		StringTokenizer st = new StringTokenizer(br.readLine()," ");

		int n,i,a;
		int max =-2147000000;
		int min = 2147000000;
		n = Integer.parseInt(st.nextToken());

//		st = new StringTokenizer(br.readLine()," ");
		//br.readLine뒤에 " "가 없어도 결과는 잘 나오네? 왜일까.. 
		st = new StringTokenizer(br.readLine()," ");
		for(i = 1; i<=n;i++) {
			a=Integer.parseInt(st.nextToken());
			if(a>max) max = a;
			if(a<min) min = a;
		}
		System.out.println(max-min);
	}
}
