package LinkedList;


import java.util.Comparator;
import java.util.PriorityQueue;

public class _02_MergeKSortedList {

	public static void main(String[] args) {
		ListNode l1 = new ListNode(1);
		l1.next = new ListNode(4);
		l1.next.next = new ListNode(5);

		ListNode l2 = new ListNode(1);
		l2.next = new ListNode(3);
		l2.next.next = new ListNode(4);

		ListNode l3 = new ListNode(2);
		l3.next = new ListNode(6);

		ListNode[] list = new ListNode[3];
		list[0] = l1;
		list[1] = l2;
		list[2] = l3;
		_02_MergeKSortedList a = new _02_MergeKSortedList();
		ListNode result = a.mergeKLists(list);
		System.out.println("====");
		while(result !=null) {
			System.out.println(result.val);
			result= result.next;
		}
	}

	public ListNode mergeKLists(ListNode[] lists) {
		// 1
		PriorityQueue<ListNode> queue = new PriorityQueue<ListNode>(Comp);
		//우선순위 큐 오름차순 소팅.
		ListNode newHead = new ListNode(0);
		ListNode p = newHead;	
		for (ListNode node : lists) {	
			//리스트 노드타입으로 받음
			if (node != null)	//널이 아니면 큐에 넣음. (담을 그릇 만듬)
				queue.offer(node);
		}

		// 2
		while (!queue.isEmpty()) {
			//(리스트노드가) 큐에 들어있으면
			//p.next에 노드 들어감.
			//
			ListNode node = queue.poll();
			System.out.print(""+node.val+"\t");
			p.next = node;
			p = p.next;
			if (node.next != null)	//맨 앞이 날아가고 다시 소팅함. 그럼 포인터가 다시 최소인 1 가리킴.
				queue.offer(node.next);
		}
		return newHead.next;
		//
	}

	Comparator<ListNode> Comp = new Comparator<ListNode>() {	//이거에 대해 비교하고 오름차순으로

		@Override
		public int compare(ListNode a, ListNode b) {
			// TODO Auto-generated method stub
			return a.val - b.val;
		}

	};

}