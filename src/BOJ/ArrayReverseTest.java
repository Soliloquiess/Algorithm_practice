package BOJ;

import java.util.Arrays;
import java.util.Collections;


public class ArrayReverseTest {
	public static void test03(String[] args) {
		int[] arr = {50, 20, 10, 30, 40};
		Arrays.sort(arr);

		for(int i=0; i<arr.length; i++) {

			System.out.println(arr[i]);
		}
}

//primitive data type 배열을 Arrays.sort 함수에 입력하면 배열의 값이 변경됨.
//올림 차순으로 (arr) sort 했으므로 아래와 같이 변경됨.
//10, 20, 30, 40, 50

public static void main(String[] args) {
	Integer[] arr2 = { 4, 2, 1, 5, 3 };

	Arrays.sort(arr2, Collections.reverseOrder());
	for(int i=0; i<arr2.length; i++){

		System.out.println(arr2[i]);
	}

}

//primitive data type 이 아닌 객체의 배열을 이용함.
//Collection 클래스의 reverseOrder() 함수를 이용.
//지금까지와 반대 order. 즉, 반대로 sort 하겠다는 의미. ==> 내림차순 
//(5, 4, 3, 2, 1 )


public static void main1(String[] args) {

	int[] arr1 = {21,4,19,31,16};
	Arrays.sort(arr1, 2, arr1.length);

	for(int i=0; i<arr1.length; i++) {

			System.out.println(arr1[i]);
		}
	}
}
//primitive data type 배열을 Arrays.sor 함수에 입력하면 배열의 값이 변경됨.
//올림 차순으로 sort 했으므로 아래와 같이 변경됨.
//Arrays.sort(arr1, 2, arr1.length)  ==> 1번째는 배열, (2번째, 3번째)는 변경할 index 범위 지정.
//(21, 4 , 16 , 19, 31)

