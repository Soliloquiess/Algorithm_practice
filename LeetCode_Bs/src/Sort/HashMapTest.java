package Sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class HashMapTest {  
  public static void main(String args[]) { 
    Scanner sc = new Scanner(System.in);
    int P = sc.nextInt();
    int N = sc.nextInt();
    int H = sc.nextInt();
    HashMap<Integer,Integer> map = new HashMap<Integer,Integer>(){{//초기값 지정
        put(1,3);
        put(2,424231);
        put(3,4242);
    }};
    		
    System.out.println(map); //전체 출력 : {1=사과, 2=바나나, 3=포도}
    System.out.println(map.get(1));//key값 1의 value얻기 : 사과
    		
    //entrySet() 활용
    for (Entry<Integer, Integer> entry : map.entrySet()) {
        System.out.println("[Key]:" + entry.getKey() + " [Value]:" + entry.getValue());
    }
    //[Key]:1 [Value]:사과
    //[Key]:2 [Value]:바나나
    //[Key]:3 [Value]:포도

    List<Integer> keySetList = new ArrayList<>(map.keySet());
    // 내림차순 //
    Collections.sort(keySetList, new Comparator<Integer>() {
        @Override
        public int compare(Integer o1, Integer o2) {
            return map.get(o1).compareTo(map.get(o2));
        }

    });
     
    for(Integer key : keySetList) {
        System.out.println(String.format("Key : %s, Value : %s", key, map.get(key)));
    }
    //KeySet() 활용
    for(Integer i : map.keySet()){ //저장된 key값 확인
        System.out.println("[Key]:" + i + " [Value]:" + map.get(i));
    }
    //[Key]:1 [Value]:사과
    //[Key]:2 [Value]:바나나
    //[Key]:3 [Value]:포도
    
    System.out.println();
  }
}