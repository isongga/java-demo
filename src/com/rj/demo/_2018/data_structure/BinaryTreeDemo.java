package com.rj.demo._2018.interview.data_structure;
/**
 * @author Eric.Wu
 * @date 2018年4月10日 下午4:00:00
 * 
 */
public class BinaryTreeDemo {

	public static void main (String[] args) {
		BinaryTreeNode node8 = new BinaryTreeNode(8, null, null);
		BinaryTreeNode node7 = new BinaryTreeNode(7, null, null);
		BinaryTreeNode node6 = new BinaryTreeNode(6, node8, null);
		BinaryTreeNode node5 = new BinaryTreeNode(5, null, null);
		BinaryTreeNode node4 = new BinaryTreeNode(4, null, node7);
		BinaryTreeNode node3 = new BinaryTreeNode(3, node5, node6);
		BinaryTreeNode node2 = new BinaryTreeNode(2, node4, null);
		BinaryTreeNode node1 = new BinaryTreeNode(1, node2, node3);
		
		BinaryTree tree = new BinaryTree();
		tree.preOrderArray(node1);
		System.out.println("\n");
		tree.print(tree.midOrderArray(node1));
		System.out.println("\n");
		tree.printMirror(tree.mirror(node1));
		System.out.println("\n");
		tree.print(tree.rebuildTree(tree.preOrderArray(node1), tree.midOrderArray(node1)));
		
	}

	
}
