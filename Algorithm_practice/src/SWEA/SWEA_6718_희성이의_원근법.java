package SWEA;

//public class SWEA_6718_희성이의_원근법 {
//}

import java.util.*; 
class Solution 
{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int d, score;
        for(int tc=1; tc<=T; tc++) {
            d = sc.nextInt();
            if( d < 100 ) score = 0;
            else if( d < 1000 ) score = 1;
            else if( d < 10000 ) score = 2;
            else if( d < 100000 ) score = 3;
            else if( d < 1000000 ) score = 4;
            else score = 5;
            System.out.format("#%d %d\n", tc, score);
        }
        sc.close();
    } 
}