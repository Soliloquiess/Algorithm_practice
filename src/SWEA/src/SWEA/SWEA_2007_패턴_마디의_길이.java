package SWEA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SWEA_2007_패턴_마디의_길이 {

	public static void main(String[] args) throws IOException {
		BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for(int tc = 1; tc<=T;tc++) {
			String word = br.readLine();
			
			for(int i =1; i<word.length();i++) {
				String pattern = word.substring(0,i);
				String next_pattern = word.substring(i,i+i);
				if(pattern.equals(next_pattern)) {
					System.out.println("#"+tc+" "+pattern.length());
					break;
				}
			}
		}
	}
}

//
//import java.util.Scanner;
//import java.util.regex.Pattern;
//class Solution {
//    public static void main(String args[]) {
//        Scanner sc = new Scanner(System.in);
//        int T = sc.nextInt();
//        for(int t=1; t<=T; t++) {
//            String s = sc.next();
//            int wavelength = 0;
//            for(int i=1; i<10; i++) {
//                String sub = s.substring(0,i);
//                String subNext = s.substring(i,i+i);
//                if( sub.equals(subNext) ) {
//                    wavelength = i;
//                    break;
//                }
//            }
//            System.out.format("#%d %d\n", t, wavelength);
//        }
//    }
//}
