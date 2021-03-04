package SWEA;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class SWEA_2058_자릿수더하기 {
 public static void main(String[] args) throws IOException {
//     Scanner sc = new Scanner(System.in);
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     StringTokenizer st;
     
     int N = Integer.parseInt(br.readLine());
     int sum =0;
     while(N>0) {
    	 sum += N%10;
    	 N = N/10;
     }
     System.out.println(sum);
   }
}