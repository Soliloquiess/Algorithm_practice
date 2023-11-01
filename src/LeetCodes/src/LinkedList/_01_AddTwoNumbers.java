package LinkedList;


//class ListNode{
//	int val;
//	ListNode next;
//	ListNode(int x){
//		this.val = x;
//	}
//}
public class _01_AddTwoNumbers {
	public static void main(String[] args) {
		ListNode l1 = new ListNode(2);
		l1.next = new ListNode(4);
		l1.next.next = new ListNode(3);
		
		ListNode l2 = new ListNode(5);
		l2.next = new ListNode(6);
		l2.next.next = new ListNode(2);
		ListNode node = solve(l1, l2);
		while(node!=null) {	//받은거 찍어보자.
			System.out.println(node.val);
			node = node.next;
		}
	}
	
	public static ListNode solve(ListNode l1, ListNode l2) {
		ListNode newHead = new ListNode(0);
		ListNode p1 =l1, p2 =l2 , p3=newHead;
		int carry =0;
		
		while(p1 != null|| p2!= null) {
			if(p1 != null) {
				carry+= p1.val;
				p1 =p1.next;	//p1먹으면 다음으로 넘어가고 p1이 다음거 가리키게 됨
				//p2도 마찬가지
			}
			if(p2 != null) {
				carry += p2.val;
				p2 = p2.next;
			}
			p3.next = new ListNode(carry%10);
			p3 =p3.next;
			carry /= 10;
		}
		if(carry==1) p3.next = new ListNode(1);
		return newHead.next;	//넘길떄는 뉴헤드의 넥스트.
	}
}