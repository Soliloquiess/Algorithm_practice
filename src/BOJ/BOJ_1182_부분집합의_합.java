package BOJ;


import java.util.*;
import java.io.*;
 
// https://www.acmicpc.net/problem/1182
 
public class BOJ_1182_부분집합의_합 {
    static int count = 0;
    static int s;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
 
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        s = Integer.parseInt(st.nextToken());
 
        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
 
        for(int i=0; i<n; i++)
            arr[i] = Integer.parseInt(st.nextToken());
 
        powerSet(arr, n, 0, 0);        
        // s가 0 일때는 부분집합 중에 공집합인 경우도 카운트 될 수 있음
        if(s == 0)
            count--;
        System.out.println(count);
    }
 
    static void powerSet(int[] arr, int n, int idx, int sum) {
        if(idx == n) {
            if(sum == s)
                count++;
            return;
        }
 
        powerSet(arr, n, idx + 1, sum);
        powerSet(arr, n, idx + 1, sum + arr[idx]);
    }
}

/*
비트 마스크 사용

import java.io.FileInputStream;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) throws Exception {
        // TODO Auto-generated method stub
 
        Scanner sc = new Scanner(new FileInputStream("input.txt"));
        //Scanner sc1 = new Scanner(System.in);
        int n = sc.nextInt();
        int s = sc.nextInt();
        int[] arr = new int[n];
        int result = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        //i는 0000~1111까지
        for (int i = 1; i < 1 << n; i++) {
 
            int bit = i;
            //0000 을 
            //bit!=0 은 도중에 할게 없으면 컷 0000111 일떄 1뽑고 난후 0이므로 돌 필요가 없다.
            for (int j = 0; bit != 0; j++, bit >>= 1) {
 
 
                //첫번째 자리가 0이면 j는 구할필요가 없다. ex) 10010일때 j의 자리는 0이므로 뽑을 필요가 없기 때문이다.
                if ((1 & bit) == 0){
                    continue;
                }
                sum = sum + arr[j];
            }
            if (sum == s) {
                result++;
            }
            sum = 0;
        }
        System.out.println(result);
 
    }
 
}
*/