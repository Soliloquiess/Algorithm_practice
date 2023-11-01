package LinkedList;



class ListNode{
	int val;
	ListNode next;
	ListNode(int x){
		this.val = x;
	}
}

public class _03_ReverseLinkedList {
	public static void main(String[] args) {
		ListNode l1 = new ListNode(1);
		l1.next = new ListNode(2);
		l1.next.next = new ListNode(3);
		
		printNode(l1);
		ListNode head = reverseList(l1);
		printNode(head);
	}
	public static ListNode reverseList(ListNode current) {
		ListNode prev = null;
		ListNode next = null;
		while(current !=null) {
			next = current.next; // 2를 저장해두고

			current.next = prev; // 1.next 는 null로 설정하고

			prev = current; // prev는 1로 설정하고

			current = next; // current값을 2로 재설정
		}
		return prev;
	}
	
	
	
	public static void printNode(ListNode head) {
		System.out.println("printNOde: ");
		while(head != null) {
			System.out.println(head.val);
			head = head.next;
		}
		System.out.println();
	}
}




////1. Recursive
//class Solution {
// public ListNode reverseList(ListNode head) {
//     if (head == null || head.next == null) return head;
//
//     ListNode result = reverseList(head.next);
//
//     head.next.next = head;
//     head.next = null;
//
//     return result;
// }
//}
//
////2. iterative
//class Solution {
// public ListNode reverseList(ListNode head) {
//     ListNode parent = null;
//
//     while (head != null) {
//         ListNode current = head;
//         head = head.next;
//         current.next = parent;
//         parent = current;
//     }
//
//     return parent;
// }
//}
//https://bcp0109.tistory.com/entry/Reverse-Linked-List-Java
