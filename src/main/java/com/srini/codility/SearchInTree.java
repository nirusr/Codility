package com.srini.codility;
import javax.swing.tree.TreeNode;

class Node {
	public String nodeValue;
	public Node leftNode ;
	public Node rightNode;
	public Node(String nodevalue, Node leftNode, Node rightNode) {
		this.nodeValue = nodeValue;
		this.leftNode = leftNode;
		this.rightNode = rightNode;
	}
}

public class SearchInTree {
	//you are given binary tree
	//search a node with data.
	public static Node findNode(Node root, Node nodeToSearch) {
		
		if (root != null) {
			if ( root.nodeValue.equalsIgnoreCase(nodeToSearch.nodeValue)) {
				return root;
			}
			
			if ( root.leftNode != null) {
				return findNode(root.leftNode, nodeToSearch);
				
			}
			if (root.rightNode != null) {
				return findNode(root.rightNode, nodeToSearch);
			}
			
		}
			
		return null;	
			
			
					 
		
		
		
	}
	
	

}
