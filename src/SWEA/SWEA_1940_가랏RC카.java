package SWEA;

//public class SWEA_1940_가랏RC카 {
//
//}
import java.io.*;
import java.util.StringTokenizer;

public class SWEA_1940_가랏RC카 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for(int tc=1; tc<=T; tc++) {
			int time = Integer.parseInt(br.readLine()); //시간
			int rc = 0; //속도
			int dis = 0; //거리
            
			for(int i=0; i<time; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				int command = Integer.parseInt(st.nextToken());
				
				if(command != 0) {
					int accel = Integer.parseInt(st.nextToken()); //가속도
                    
					if(command == 1) { //가속
						rc += accel;
					} else { //감속
						if(rc < accel) {
							rc = 0;
						} else {
							rc -= accel;
						}
					}
                    
				}
                
				dis += rc;
			}
			System.out.println("#"+tc+" "+dis);
		}
	}

}

//import java.util.Scanner;
//public class SWEA_1940_가랏RC카 {
//    public static void main(String args[]) {
//        Scanner sc = new Scanner(System.in);
//        int T = sc.nextInt();
//        for(int t=1; t<=T; t++) {
//            int N = sc.nextInt();
//            int a, v = 0, d = 0;
//            for(int n=0; n<N; n++) {
//                int command = sc.nextInt();
//                if( command != 0 ) {
//                    a = sc.nextInt();
//                    if( command == 1 ) v += a;
//                    else {
//                        v -= a;
//                        if( v<0 ) v=0;
//                    }
//                }
//                d += v;
//            }
//            System.out.format( "#%d %d\n", t, d );
//        }
//    }
//}