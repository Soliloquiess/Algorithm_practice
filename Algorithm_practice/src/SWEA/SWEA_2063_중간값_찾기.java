package SWEA;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class SWEA_2063_중간값_찾기 {
 public static void main(String[] args) throws IOException {
//     Scanner sc = new Scanner(System.in);
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     StringTokenizer st;
     
     int T = Integer.parseInt(br.readLine());
     int[] n = new int[T];

     if(T< 9 ||T>199) {
    	 return;
     }
	 st= new StringTokenizer(br.readLine());
     for(int i=0; i<T; i++){
         
	     n[i]=Integer.parseInt(st.nextToken());
     }    
     Arrays.sort(n);
         		
     

     System.out.println(n[(T-1)/2]);
 	}
}