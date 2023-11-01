package inflearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class _33_3등의_성적 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st; 
		Scanner sc = new Scanner(System.in);
		
		int  n, tmp, idx, i, j, cnt = 0;
		int [] a = new int[101];
//		scanf("%d", &n);
		
		n= Integer.parseInt(br.readLine());
		
		st = new StringTokenizer(br.readLine()," ");
		for (i = 0; i < n; i++) {
//			scanf("%d", &a[i]);
			a[i] = Integer.parseInt(st.nextToken());
		}
		for (i = 0; i < n - 1; i++) {
			idx = i;
			for (j = i + 1; j < n; j++) {
				if (a[j] > a[idx]) idx = j;
			}
			tmp = a[i];
			a[i] = a[idx];
			a[idx] = tmp;
		}
		//위 부분까지가 앞 문제의 선택정렬 그대로 사용.

		//이 밑은 내림차순 정렬 되고 실행.
		for (i = 1; i < n; i++) {	//0번 부터 자료 들어갔으나 1번부터 돌아야 된다.
			if (a[i - 1] != a[i]) cnt++;		//a의 i-1은 앞쪽.  앞쪽과 같지 않으면 ++해주는 거.
			if (cnt == 2) {		//3등 출력하는거.
				System.out.printf("%d\n", a[i]);
				break;
			}
		}
	}
}