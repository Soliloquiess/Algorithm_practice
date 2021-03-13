package inflearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class _31_탄화수소질량 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st; 
		Scanner sc= new Scanner(System.in);

//		char a[10];
		char [] a = new char [10];
		int c = 0, h = 0, i, pos;	//c=탄소의 개수 , h=수소의 개수 pos= 포지션.
//		scanf("%s", &a);
		String str = br.readLine();
		a = str.toCharArray();
		if (a[1] == 'H') {
			c = 1;
			pos = 1;
		}
		else {
			for (i = 1; a[i] != 'H'; i++) {
				c = c * 10 + (a[i] - 48);		//a[i]-48은 아스키 코드떄문에
			}
			pos = i;	//H의 위치.
		}
		//위에선 탄소 위치 구한거

		//이 밑은 수소 구하기

		if (a[pos + 1] == '\0') h = 1; 
		//자바라도 이건 되는 듯(마지막에 +1은 널인듯 널까지 도는건 못해도)
		else {
			for (i = pos + 1; i<a.length; i++) {
				h = h * 10 + (a[i] - 48);
			}
		}
		System.out.printf("%d\n", c * 12 + h);
//		printf("%d\n", c * 12 + h);
	}
}

