package SWEA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SWEA_1545_거꾸로출력해보아요 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
        int n = Integer.parseInt(br.readLine());
        for( int i=n; i>=0; i--) {
            System.out.format("%d ", i);
        }
    }
}
//
//import java.util.Scanner;
//class Solution {
//    public static void main(String args[]) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        for( int i=n; i>=0; i--) {
//            System.out.format("%d ", i);
//        }
//    }
//}