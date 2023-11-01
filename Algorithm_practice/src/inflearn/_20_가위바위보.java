package inflearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _20_가위바위보 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st; 
		
		st = new StringTokenizer(br.readLine()," ");		
		int  i, j, n, A = 0, B = 0;
		int [] a= new int[101];
		int [] b =new int[101];
		n = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine()," ");
		for (i = 1; i <= n; i++) {
			a[i] = Integer.parseInt(st.nextToken());
		}
		st = new StringTokenizer(br.readLine()," ");		
		for (i = 1; i <= n; i++) {
			b[i] = Integer.parseInt(st.nextToken());
		}
		for (i = 1; i <= n; i++) {
			if (a[i] == b[i]) System.out.println("D");
			//1=가위 2=바위 3= 보	//비김.
			else if (a[i] == 1 && b[i] == 3) System.out.println("A");	//1=가위 3=보
			else if (a[i] == 2 && b[i] == 1) System.out.println("A");	//2=바위 1= 가위
			else if (a[i] == 3 && b[i] == 2) System.out.println("A");//3=보  2= 바위
			else System.out.println("B");	//그 외엔 다 패배.
		}
	}
}