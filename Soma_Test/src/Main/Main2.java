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
  
  //�˰� 3�����ۿ� �� Ǯ���� �� ���� �����̴�.
  //�ȳ��ϼ���. ������ ������ �ϳ��� �𸣴� ����Դϴ�. ���̽�? ���� �� ���̽� ���� ���� �����ϴ�. �����ΰ� ������ ��ī�����? �̷��� �� �� �޳���? ������ ���°� ��ǥ�ӹ̴�
}