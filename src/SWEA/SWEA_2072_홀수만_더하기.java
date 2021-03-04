package SWEA;


import java.io.*;
import java.util.*;
  
public class SWEA_2072_홀수만_더하기 {
     
     public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         
        StringTokenizer st; 
//      Scanner sc = new Scanner(System.in);
            
        int T = Integer.parseInt(br.readLine());
        for( int tc=1; tc<=T; tc++ ) {
            int sum = 0;
            st = new StringTokenizer(br.readLine());
            for( int j=0; j<10; j++ ) {
                 
                int n = Integer.parseInt(st.nextToken());
                if( n%2 == 1 ) sum+=n;
            }
            System.out.format("#%d %d\n", tc, sum);
        }
    }
}