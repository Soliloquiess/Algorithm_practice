package SWEA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//public class SWEA_1989_초심자의_회문검사 {
//}

import java.util.Scanner;
public class SWEA_1989_초심자의_회문검사 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int t=1; t<=T; t++) {
            String s = sc.next();
//            int res = s.equals(new StringBuilder(s).reverse().toString())?1:0;
//            System.out.format("#%d %d\n", t, res);
            System.out.printf("#%d %d\n", t, is_palindrome(s));
        }
    }
    
    public static int  is_palindrome(String s) {
    	int len = s.length();
    	for(int i=0; i<len/2; i++) {
    		if( s.charAt(i) != s.charAt(len-1-i) ) return 0;
    	}
    	return 1;
    }
}
//
//	public class SWEA_1989_초심자의_회문검사 {
//
//		public static void main(String[] args) throws IOException {
//			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//			int T = Integer.parseInt(br.readLine());
//			for(int tc=1;tc<=T;tc++) {
//				String s = br.readLine();
//				String pel = "";
//				for(int i=s.length()-1; i>=0; i--) {
//					pel += s.substring(i,i+1);
//				}
//				if(s.equals(pel)) System.out.println("#"+tc+" "+1);
//				else System.out.println("#"+tc+" "+0);
//			}
//		}
//
//	}