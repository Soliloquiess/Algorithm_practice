package inflearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _08_올바른괄호 {
	public static void main(String[] args) throws IOException {
		

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int i, cnt = 0;
		String str =br.readLine();
		char []a = str.toCharArray();
		
		for (i = 0; i<str.length(); i++) {
			if (a[i] == '(') cnt++;	//(면 증가
			else if (a[i] == ')') cnt--;	//)면 감소.
			if (cnt < 0) break;//여기서 )먼저 입력 되면 이 포문 나오게 한다. 때문에 이거 안넣고 )(를 돌리면 yes가 나옴.
			//혹은 (가 음수가 되면 나오게.
		}

		if (cnt == 0) System.out.println("YES");
		else System.out.println("NO");

	}
}