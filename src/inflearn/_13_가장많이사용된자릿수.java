package inflearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _13_가장많이사용된자릿수 {
	
	static int []ch = new int[10];
	static int res=0;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//freopen("input.txt", "rt", stdin);
		int i, digit, max = -2147000000;
		char [] a = new char[101];
		//입력된 숫자 읽어야. string으로 읽어야 int형으로 못 읽고 스트링 형으로 읽어야!
//		scanf("%s", &a);
		
		String str =br.readLine();
		a = str.toCharArray();
		for (i = 0; i<str.length(); i++) {
			digit = a[i] - 48;	//아스키 문자 0이 48이므로 -48하면 실 숫자 0이 됨.
			ch[digit]++;
		}
		for (i = 0; i <= 9; i++) {
			if (ch[i] >= max) {
				max = ch[i];
				res = i;		//그 인덱스 번호가 답임(실제 답은 i(0부터 9까지 움직이는))
				//res = ch[i]로 쓰면 젤 많이 나온 수의 중복횟수가 나옴.
				//ch[i]는 i라는 애가 사용된 횟수
			}
		}

		//근데 3도 7번 5도 7번 쓰였으면 5가 답이 되야함.max 가 같더라도 
		//그래서 ch[i]>=max로 하면 3이 7인데 5가 7일때 ch[i]>=max면 max값과 같아도 max값이 바뀌므로 5가 바뀌어짐(오름차순가므로)
		System.out.printf("%d\n", res);
	}
}
