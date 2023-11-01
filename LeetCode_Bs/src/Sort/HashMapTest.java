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
    HashMap<Integer,Integer> map = new HashMap<Integer,Integer>(){{//�ʱⰪ ����
        put(1,3);
        put(2,424231);
        put(3,4242);
    }};
    		
    System.out.println(map); //��ü ��� : {1=���, 2=�ٳ���, 3=����}
    System.out.println(map.get(1));//key�� 1�� value��� : ���
    		
    //entrySet() Ȱ��
    for (Entry<Integer, Integer> entry : map.entrySet()) {
        System.out.println("[Key]:" + entry.getKey() + " [Value]:" + entry.getValue());
    }
    //[Key]:1 [Value]:���
    //[Key]:2 [Value]:�ٳ���
    //[Key]:3 [Value]:����

    List<Integer> keySetList = new ArrayList<>(map.keySet());
    // �������� //
    Collections.sort(keySetList, new Comparator<Integer>() {
        @Override
        public int compare(Integer o1, Integer o2) {
            return map.get(o1).compareTo(map.get(o2));
        }

    });
     
    for(Integer key : keySetList) {
        System.out.println(String.format("Key : %s, Value : %s", key, map.get(key)));
    }
    //KeySet() Ȱ��
    for(Integer i : map.keySet()){ //����� key�� Ȯ��
        System.out.println("[Key]:" + i + " [Value]:" + map.get(i));
    }
    //[Key]:1 [Value]:���
    //[Key]:2 [Value]:�ٳ���
    //[Key]:3 [Value]:����
    
    System.out.println();
  }
}