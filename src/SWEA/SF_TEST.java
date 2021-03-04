package SWEA;

import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;


public class SF_TEST 
{
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		int TC = sc.nextInt();
		int i;
		int j;
		
		int N;
		int M1;
		int M2;

		
		for(int q =0; q<TC;q++) {	//테케만큼 돈다.
			int sum1 =0;
			int sum2 =0;
			int m1count=0;
			int m2count=0;
			 N = sc.nextInt();
			 M1 = sc.nextInt();
			 M2 = sc.nextInt();
			int arr1[] = new int[M1+100];

//			int arr1[] = new int[M1+10];
			int arr2[] = new int[M2+200];

//			int arr2[] = new int[M2+20];
			int arr4[] = new int[M1 +M2+400];
//			int arr4[] = new int[M1 +M2+40];

			int arr3[] = new int [N];

			int arr5[] = new int[M1 +M2+400];

//			int arr5[] = new int[M1 +M2+40];
			for( j=0; j<N;j++) {	//N개의 블럭 입력.
				int block = sc.nextInt();
				arr3[j] = block;
			}
			
			Arrays.sort(arr3);
			
			for(int a=N-1;a>=0;a--) {
				if(a%2==0) {
					if(m1count!=M1) {
						
							
						m1count++;
						arr1[a] = arr3[a]; 
					}
//					else if(m1count>M1) {
//						a--;
//					}
					else if(m1count>=M1) {
						
						m2count++;
						arr2[a] = arr3[a]; 
					}
				}
				else {
					if(m2count!=M2) {
						m2count++;
						arr2[a] = arr3[a];
					}
					else if(m2count>=M2) {
						
						m1count++;
						arr1[a] = arr3[a]; 
					}
					
				}
			}
			
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			
			for( i =arr1.length-1; i>=0;i++) {
				for( j =1;j<arr1.length;j++) {
					arr4[i] = arr1[i]*j;
					sum1 += arr4[i];
					i--;
				}
				break;
			}
			
			for( i =arr2.length-1; i>=0;i++) {
				for( j =1;j<arr1.length;j++) {
					arr5[i] = arr2[i]*j;
					sum2 += arr5[i];
					i--;
					
				}
				break;
			}
			
			System.out.print("#"+(q+1)+" ");
			System.out.println( sum1+sum2);
			
			
//			for(int k=N-1; k>=0;k--) {
//				System.out.println(arr4[k]);
//			}
		}
	}
}