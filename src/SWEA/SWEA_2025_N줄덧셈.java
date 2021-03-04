package SWEA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SWEA_2025_N¡Ÿµ°º¿ {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int num;
		int sum=0;
		for(int i=1; i<=N;i++) {
			
			sum +=i;
		}
		System.out.println(sum);
	}
}

//
//import java.util.Scanner;
//class Solution {
//    public static void main(String args[]) {
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//        int sum = 0;
//        for( int i=1; i<=num; i++ ) sum += i;
//        System.out.println(sum);
//    }
//}
