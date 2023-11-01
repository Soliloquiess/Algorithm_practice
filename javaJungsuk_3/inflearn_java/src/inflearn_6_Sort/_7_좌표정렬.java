package inflearn_6_Sort;


import java.util.*;
class Point implements Comparable<Point>{
	public int x, y;
	Point(int x, int y){
		this.x=x;
		this.y=y;
	}
	@Override	//이 부분은 걍 외워서 하는 것도 나쁘지는 않다.
	public int compareTo(Point o){
		if(this.x==o.x) return this.y-o.y;	//현재 객체와 매개변수로 넘어온 객체가 같으면 
		else return this.x-o.x;
	}
}

class _7_좌표정렬 {	
	public static void main(String[] args){
		Scanner kb = new Scanner(System.in);
		int n=kb.nextInt();
		ArrayList<Point> arr=new ArrayList<>();
		for(int i=0; i<n; i++){
			int x=kb.nextInt();
			int y=kb.nextInt();
			arr.add(new Point(x, y));
		}
		Collections.sort(arr);	//Comparable인터페이스로 정렬
		for(Point o : arr) System.out.println(o.x+" "+o.y);
	}
}
