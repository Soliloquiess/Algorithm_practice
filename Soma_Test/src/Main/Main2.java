package Main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class Main2 {  
  public static void main(String args[]) { 
    Scanner sc = new Scanner(System.in);
    
    int N = sc.nextInt();
    int arr[] = new int[N];	
    int sum1=0;
    int sum2=0;
    for(int i = 0; i<N; i++) {
    	arr[i]=sc.nextInt();
    }
    
    for(int i =0; i<N;i++) {
    	System.out.print(arr[i]+" ");
    }
    for(int i =0; i<N/2;i++) {
    	sum1+= arr[i];
    }
    for(int i =N/2; i<N;i++) {
    	sum2+= arr[i];
    }
    if(sum1>sum2)
    {
    	for(int i =0; i<N/2;i++) {
    		for(int j =0; j<N/2;j++) {
    			int temp=j;
    			
    		}
    	}
    }
    
    System.out.println(sum1);
    System.out.println(sum2);
  }
  
  //알고 3문제밖에 못 풀었다 아 내가 빡통이다.
  //안녕하세요. 비전공 국비충 하나도 모르는 사람입니다. 파이썬? 점프 투 파이썬 기초 보고 있읍니다. 국비인가 들으면 네카라쿠배? 이런데 갈 수 읻나요? 국비듣고 가는게 목표임미다
}