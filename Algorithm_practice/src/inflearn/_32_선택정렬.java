package inflearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class _32_선택정렬 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st; 
		Scanner sc = new Scanner(System.in);
		
		 //freopen("input.txt", "rt", stdin);
	    int []a = new int[101];
	    int n, tmp, idx, i, j;
//	    scanf("%d", &n);
	    n = Integer.parseInt(br.readLine());
	    
	    st = new StringTokenizer(br.readLine(), " ");
	    for (i = 0; i < n; i++) {
//	        scanf("%d", &a[i]);
	        a[i] = Integer.parseInt(st.nextToken());
	    }
	    for (i = 0; i < n - 1; i++) {
	        idx = i;
	        for (j = i + 1; j < n; j++) {
	            if (a[j] < a[idx]) idx = j;		//a[j]는 계속 바뀌는 숫자. 다 돌고나면 idx엔 가장 작은 값의 위치가 들어감.
	        }
	        //j포문에서 배열 끝까지 다 돌고 위치 바꾸는 과정.

	        tmp = a[i];
	        a[i] = a[idx];		//idx는 배열의 인덱스.
	        a[idx] = tmp;
	    }
	    for (i = 0; i < n; i++) {
	        System.out.printf("%d ", a[i]);
	    }
//	    return 0;
	}
}
