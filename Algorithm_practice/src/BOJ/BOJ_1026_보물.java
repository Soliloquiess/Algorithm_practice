package BOJ;

//S = A[0]B[0] + … + A[N-1]B[N-1]를 가장 작게 하기 위해서는
// A에서 가장큰것과 B에서 가장작은것들을 순서대로 곱하면 된다.
//A를 내림차순으로 정렬을 하고, B를 오름차순으로 정렬을 한다.
//두 배열 A,B가 같은 길이이기때문에 인덱스는 함께 공유를 할 수 있다.


import java.util.Arrays;
import java.util.Scanner;

public class BOJ_1026_보물 {
    public static Integer solution(int [] arr1, int [] arr2) {
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int sum = 0;
        for (int i = 0; i < arr1.length; i++)
            sum += arr1[i] * arr2[arr2.length-1-i];
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr1 = new int[n];
        int [] arr2 = new int[n];
        for (int i = 0; i < n; i++)
            arr1[i] = sc.nextInt();

        for (int i = 0; i < n; i++)
            arr2[i] = sc.nextInt();

        System.out.println(solution(arr1, arr2));
    }
}

/*

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;
public class BOJ_1026_보물 {
public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine());
		int[] A = new int[N];
	
		Integer[] B = new Integer[N];
		st = new StringTokenizer(br.readLine());
	
		for(int i = 0; i < N; i++) {
			A[i] = Integer.parseInt(st.nextToken());
		}
	
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) {
			B[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(A);
		Arrays.sort(B, Collections.reverseOrder());
	
		int prod = 0;
		for(int i = 0; i < N; i++) { 
			prod += A[i] * B[i];
		}
		System.out.println(prod);
	}
}
*/