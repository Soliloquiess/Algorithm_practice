package inflearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _16_아나그램 {
	static int []a = new int [60];
	static int []b = new int [60];
	public static void main(String[] args) throws IOException {
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n, i;
		String str = br.readLine();

		char []arr = str.toCharArray();
//		scanf("%s", &str);
		for (i = 0; i<arr.length; i++) {
			if (arr[i] >= 65 && arr[i] <= 90)
				a[arr[i] - 64]++; //소문자는 65~90 a[1]에 저장하려면 65-64 하면 1 나옴
			
			else a[arr[i] - 70]++; 
			//65~90사이가 아닐때 기준으로 -70하는거. 그러면 a[27]부터 올라감.
			//-70하는건 소문자 a가 97이고 알파벳 수는 26개 96이 Z이므로 97이 a라 -27해야 a[27]에 저장가능
		}

//		scanf("%s", &str);
		String str2 = br.readLine();

		char []arr2 = str.toCharArray();
		for (i = 0; i<arr2.length; i++) {
			if (arr2[i] >= 65 && arr2[i] <= 90)
				b[arr2[i] - 64]++;
			else b[arr2[i] - 70]++;
		}

		for (i = 1; i <= 52; i++) {		//아나그램인지 아닌지 확인( 알파벳 소문자 대문자 더하면 52)
			if (a[i] != b[i]) {			//누군가 하나라도 다르면 아나그램 아님./
				System.out.print("NO\n");
//				exit(0);
				System.exit(0);
			}
		}
		System.out.print("YES\n");
	}
}