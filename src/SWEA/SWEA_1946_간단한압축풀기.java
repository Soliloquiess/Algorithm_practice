package SWEA;

import java.io.*;
import java.util.StringTokenizer;

public class SWEA_1946_간단한압축풀기 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for(int tc=1; tc<=T; tc++) {
        
			int n = Integer.parseInt(br.readLine());
			char[] c = new char[n]; //알파벳을 저장
			int[] num = new int[n]; // 알파벳 개수를 저장
			
            
			for(int i=0; i<n; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				c[i] = st.nextToken().charAt(0);
				num[i] = Integer.parseInt(st.nextToken());
			}
			
            
			System.out.println("#"+tc);
			int cnt=0; // 출력 횟수
			for(int i=0; i<n; i++) {
				for(int j=0; j<num[i]; j++) {
					System.out.print(c[i]);
					cnt++;
					if(cnt == 10) {
						System.out.println();
						cnt = 0;
					}
				}
				
			}
			System.out.println();
			
		}
	}

}


//import java.util.Scanner;
//public class SWEA_1946_간단한압축풀기 {
//    public static String str_repeat(String str, int times) {
//        return new String(new char[times]).replace("\0", str);
//    }
//    public static void main(String args[]) {
//        Scanner sc = new Scanner(System.in);
//        int T = sc.nextInt();
//        for(int t=1; t<=T; t++) {
//            int n = sc.nextInt();
//            String s = "";
//            for(int i=0; i<n; i++) {
//                String ch = sc.next();
//                int r = sc.nextInt();
//                s += str_repeat(ch, r);    
//            }
//            System.out.format("#%d\n", t);
//            for(int i=0; i<s.length(); i++) {
//                System.out.print(s.charAt(i));
//                if( i%10 == 9 )System.out.print("\n");
//            }
//            System.out.print("\n");
//        }
//    }
//}