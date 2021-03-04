package SWEA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SWEA_1936_1대1_가위바위보 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
//		int a = sc.nextInt();
		int a = Integer.parseInt(st.nextToken());
//        int b = sc.nextInt();
        int b = Integer.parseInt(st.nextToken());
        if( b-a == 1 || b-a == -2 ) System.out.println("B");
        else System.out.println("A");

	}
}
//
//import java.util.Scanner;
//class Solution {
//    public static void main(String args[]) {
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        if( b-a == 1 || b-a == -2 ) System.out.println("B");
//        else System.out.println("A");
//    }
//}