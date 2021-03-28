package Map;

import java.util.*;

public class MapTest {

	
	public static void main(String[] args) {
		
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "A");
		map.put(2, "B");
		map.put(3, "C");
		
		//1. 맵 뺴내는 방법1 포문 이용
		for(Integer key : map.keySet()) {	//키셋으로 받아와서 출력함.
			System.out.println("key: "+key+" values "+map.get(key));
		}
		System.out.println();
		//2 entrySet
		for(Map.Entry<Integer, String> elem : map.entrySet()) {	//elem를 맵에있는 entry의 셋으로 받겠다.
			System.out.println("key: "+elem.getKey()+" value "+elem.getValue());
		}
		//3.Iterator 사용.
		Iterator<Integer> keys = map.keySet().iterator();
			while(keys.hasNext()) {
				Integer key = keys.next();
				System.out.println("key "+key);
			}
		
		
	}
}