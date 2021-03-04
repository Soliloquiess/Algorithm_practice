package BOJ;

//
//
import java.util.Scanner;

public class BOJ_6603_로또 {

	static int[] arr;
	static boolean[] visit;
	static int N;

	public static void dfs(int start, int depth) {
		if(depth == 6) {	// 탈출 조건(출력)
			for(int i=0; i<N; i++) {
				if(visit[i] == true) {	// 탐색된곳 => 출력
					System.out.print(arr[i] + " ");
				}
			}
			System.out.println();
                        return;	// 재귀 함수 종료

		}
		
		for(int i=start; i<N; i++) {
			visit[i] = true;	// 방문한 곳 체크
			dfs(i+1, depth+1);	// 재귀호출, 하나의 깊이를 탐색 후 => 다음 호출시 깊이+1
			visit[i] = false;	// 초기화
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(true) {
			N = scan.nextInt();
			arr = new int[N];
			visit = new boolean[N];
			
			if(N == 0)
				break;
			
			for(int i=0; i<N; i++) {
				arr[i] = scan.nextInt();
			}
			
			dfs(0, 0);
			System.out.println();
		}
		
		scan.close();
	}

}

//public class BOJ_6603_로또 {
//
//}
//import java.util.Arrays;
//import java.util.Scanner;
//
//public class BOJ_6603_로또 {
//	
//	//static을 이용해 공유 변수를 만든다.
//	static int k;
//	static int[] arr;
//	static boolean[] skip; //스킵 판별
//	
//	static void dfs(int line,int count) {
//		
//		if(count == 6) {
//			for(int i = 0; i < k; i++) {
//				if(skip[i] == true)
//					System.out.print(arr[i] + " ");
//			}
//			System.out.println("");
//		}
//		
//		for(int j = line; j < k; j++) {
//			skip[j] = true;
//			dfs(j+1, count+1); //재귀호출
//			skip[j] = false; //재귀호출 끝나고 해당 배열을 탐색종료한다.
//		}
//	}
//	
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		
//		while(true) {
//			k = sc.nextInt(); //숫자 갯수, 6~13사이 값
//			if(k == 0) //0입력시 종료
//				break;
//			
//			arr = new int[k]; //갯수만큼 배열 생성
//			skip = new boolean[k]; //백트래킹
//			
//			for(int i = 0; i < arr.length; i++) { //배열 입력
//				arr[i] = sc.nextInt();
//			}
//			Arrays.sort(arr);
//			
//			dfs(0,0);
//			System.out.println();
//		}
//		sc.close();
//	}
//}