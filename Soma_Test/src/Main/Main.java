package Main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {  
  public static void main(String args[]) { 
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    int E = sc.nextInt();
    int num;
    int count =0;
    int arr[] = new int[10001];
    arr[0] =10002;
    arr[10000]=10002;
    int answer = 0;
    for(int i =1; i<N;i++) {
    	num = sc.nextInt();
    	arr[num] = 2;	    	
    	arr[E] = 3;
    }
    
//    System.out.println(arr[E]);
    for(int i=1;i<10;i++) {
//   	System.out.println(arr[i]);
    	
    	if(arr[E+i]==2) {
    		count++;
    	}
    	if(arr[E-i]==2) {
    		
    		count++;
    		
    	}
    	if(count==M) {
    		answer = i;
    		break;
    		
    	}
    	
    }
    System.out.println(answer);
  }
}
  
//  	for(int i =0; i<N;i++) {
//  		System.out.println(arr[i]);
//  	}
 