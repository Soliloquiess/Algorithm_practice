package SWEA;

//public class SWEA_6730_장애물_경주_난이도 {
//
//}
import java.util.*;
public class SWEA_6730_장애물_경주_난이도 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int T = sc.nextInt();
		for(int tc=1; tc<=T; tc++) {
			int N = sc.nextInt();
			int[] a = new int[N];
			for(int i=0; i<N; i++) a[i] = sc.nextInt();
			int maxUp = 0;
			int maxDown = 0;
			for(int i=0; i<N-1; i++) {
				int diff = a[i+1] - a[i];
				if( diff > 0 ) {
					if( diff > maxUp ) maxUp = diff;
					continue;
				}
				if( diff < 0 ) {
					if( diff < -maxDown ) maxDown = -diff;
				}
			}
			System.out.format("#%d %d %d\n", tc, maxUp, maxDown);
		}
	}
}