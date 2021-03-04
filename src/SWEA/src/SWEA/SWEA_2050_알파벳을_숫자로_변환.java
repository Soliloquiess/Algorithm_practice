package SWEA;

import java.io.*;
import java.util.*;
public class SWEA_2050_알파벳을_숫자로_변환 {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String s = br.readLine();
        
        for(int i=0;i<s.length();i++) {
            int n = s.charAt(i)-'A'+1;
//            bw.write(n +" ");
            System.out.print(n+" ");
        }
        
//        bw.flush();
//        bw.close();
    }
}


/*

import java.util.Scanner;
class Solution {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        for(int i=0; i<s.length(); i++) {
            int num = (int) s.charAt(i);
            System.out.format("%d ", num-64);
        }
    }
}

*/