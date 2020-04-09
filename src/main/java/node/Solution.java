package node;

import java.util.ArrayList;
import java.util.LinkedList;


public class Solution {
	
	public ArrayList<Integer> PrintFromTopToBottom(Node root) {
		ArrayList<Integer> layerList = new ArrayList<Integer>();
		if (root == null)
			return layerList;
		LinkedList<Node> queue = new LinkedList<Node>();
		queue.add(root);
		while (!queue.isEmpty()) {
			Node node = queue.poll();
			layerList.add(node.val);
			if (node.left != null)
				queue.addLast(node.left);
			if (node.right != null)
				queue.addLast(node.right);
		}
		return layerList;
	}

}
