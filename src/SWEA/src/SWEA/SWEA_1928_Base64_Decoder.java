package SWEA;

//public class SWEA_1928_Base64_Decoder {
//
//}

import java.io.*;
import java.util.Base64;

public class SWEA_1928_Base64_Decoder {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for(int tc=1; tc<=T; tc++) {
			String encoded = br.readLine();
            String decoded = new String(Base64.getDecoder().decode(encoded));
            System.out.println("#"+tc+" "+decoded);
           
		}
	}

}
//
//import java.util.Scanner;
//import java.util.Base64;
//public class SWEA_1928_Base64_Decoder {
//    public static void main(String args[]) {
//        Scanner sc = new Scanner(System.in);
//        int T = sc.nextInt();
//        for(int t=1; t<=T; t++) {
//            String encoded = sc.next();
//            String decoded = new String(Base64.getDecoder().decode(encoded));
//            System.out.format("#%d %s\n", t, decoded);
//        }
//    }
//}