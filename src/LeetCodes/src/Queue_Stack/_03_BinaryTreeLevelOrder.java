package Queue_Stack;


import java.util.*;


class TreeNode{
	int val;
	TreeNode left, right;
	TreeNode(int x){
		this.val=x;
	}
}

//이 문제가 bfs 푸는데 가장 기본적인 문제. 트리노드 기본 제공 하고 그 트리노드로 어떤식으로 짜낼것인가.
//bfs로 큐가 빠를지 dfs로 스택이 빠를지 
public class _03_BinaryTreeLevelOrder{
	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);
		System.out.println(solve(root));
	}
	public static List<List<Integer>> solve(TreeNode root) {
		List<List<Integer>> result = new ArrayList<>();
		Queue<TreeNode> queue = new LinkedList<>();
		//큐에 트리노드가 들어가있음.
		queue.offer(root);
		
		
		//거의 공식처럼 외우면 됨.
		while(!queue.isEmpty()) {	//널까지 감.
			int size = queue.size();
			List<Integer> list = new ArrayList<>();
			//여기에 저장해라.
			for(int i=0; i<size; i++) {
				TreeNode node = queue.poll();
				//트리노드 타입으로로 꺼냄(큐에서 하나씩 꺼냄)
				list.add(node.val);
				//val에 그 값이 담기는데 그걸 리스트에 담음.(3이 딱 담김)
				//큐 링크드리스트로 계속 이어짐. 널이 나올때 까지.
				if(node.left!=null) {
					queue.offer(node.left);
				}
				if(node.right!= null) {
					queue.offer(node.right);
				}
			}
//			6,7은 널이 나오면 없어짐 이 for문 한바퀴 돌면 3 한바퀴 돈거.
			
//			for문 끝나자마자 그 값을 result에 담음.
//			이 while문이 다 끝나면 result를 리턴.
			result.add(list);
		}
		return result;
	}
}
