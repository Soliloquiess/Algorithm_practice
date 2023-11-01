package SWEA;

//public class SWEA_1945_간단한_소인수분해 {
//
//}
import java.io.*;

public class SWEA_1945_간단한_소인수분해 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for(int tc=1; tc<=T; tc++) {
			int N = Integer.parseInt(br.readLine());
			
			int a = 0;
			int b = 0;
			int c = 0;
			int d = 0;
			int e = 0;
			
			int tmp = N;
			while(tmp%2 == 0) {
				a++;
				tmp /= 2;
			}
			
			tmp = N;
			while(tmp%3 == 0) {
				b++;
				tmp /= 3;
			}
			
			tmp = N;
			while(tmp%5 == 0) {
				c++;
				tmp /= 5;
			}
			
			tmp = N;
			while(tmp%7 == 0) {
				d++;
				tmp /= 7;
			}
			
			tmp = N;
			while(tmp%11 == 0) {
				e++;
				tmp /= 11;
			}
			
			System.out.println("#"+tc+" "+a+" "+b+" "+c+" "+d+" "+e);
		}
	}

}
/*
import java.util.Scanner;
public class Solution {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int t=1; t<=T; t++) {
            int N = sc.nextInt();
            int a, v = 0, d = 0;
            for(int n=0; n<N; n++) {
                int command = sc.nextInt();
                if( command != 0 ) {
                    a = sc.nextInt();
                    if( command == 1 ) v += a;
                    else {
                        v -= a;
                        if( v<0 ) v=0;
                    }
                }
                d += v;
            }
            System.out.format( "#%d %d\n", t, d );
        }
    }
}
*/