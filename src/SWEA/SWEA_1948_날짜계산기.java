package SWEA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

//public class SWEA_1948_날짜계산기 {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int t = sc.nextInt();
//		int[] m = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
//		for(int i = 1; i <= t; i++) {
//			int[] a = new int[4];
//			int day = 0;
//			for(int j = 0; j < 4; j++) {
//				a[j] = sc.nextInt();
//			}
//			if(a[0] == a[2])
//				day += a[3] - (a[1] - 1);
//			else {
//				day += m[a[0]] - a[1];
//				for(int j = a[0] + 1; j < a[2]; j++) {
//					day += m[j];
//				}
//				day += (a[3] + 1);
//			}
//			System.out.println("#" + i + " " + day);
//		}
//	}
//}




public class SWEA_1948_날짜계산기 {
public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();
    int days[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    for(int t=1; t<=T; t++) {
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();
        int dif = 1+d2-d1;
        for( int i=m1; i<m2; i++) 
        	{
        		dif += days[i-1];
        	}
        System.out.format("#%d %d\n", t, dif );   
    }
}
}




/*
import java.util.StringTokenizer;

public class SWEA_1948_날짜계산기 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		int[] date = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}; //월별 일수를 미리 저장
		
		for(int tc=1; tc<=T; tc++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int m1 = Integer.parseInt(st.nextToken())-1;
			int d1 = Integer.parseInt(st.nextToken());
			int m2 = Integer.parseInt(st.nextToken())-1;
			int d2 = Integer.parseInt(st.nextToken());
			
			
			int sum = date[m1]-d1+1; //첫 번째 달을 합에 미리 저장
            
            //두 번째 달부터 마지막 달까지 모두 합해준다.
			for(int i=m1+1; i<=m2; i++) {
				sum += date[i];
			}
            
            //마지막 달의 일수에서 입력받은 두 번째 일수를 빼준 값을 총 합에서 빼준다.
			sum -= date[m2]-d2;
            
			System.out.println("#"+tc+" "+sum);
		}
	}

}
*/