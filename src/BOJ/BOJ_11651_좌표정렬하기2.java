package BOJ;

//public class BOJ_11651_좌표정렬하기2 {
//
//}
import java.util.Scanner;
import java.util.Arrays;
 
public class BOJ_11651_좌표정렬하기2 {
	public static void main(String[] args) {
 
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		
		int[][] arr = new int[N][2];
		
		for(int i = 0; i < N; i++) {
			// 위치 주의
			arr[i][1] = in.nextInt();
			arr[i][0] = in.nextInt();
		}
		
		Arrays.sort(arr, (e1, e2) -> {
			if(e1[0] == e2[0]) {
				return e1[1] - e2[1];
			} else {
				return e1[0] - e2[0];
			}
		});
		
		for(int i = 0; i < N; i++) {
			// 위치 주의. 여기 한줄만 전이랑 바뀐거.
			System.out.println(arr[i][1] + " " + arr[i][0]);
		}
	}
}

