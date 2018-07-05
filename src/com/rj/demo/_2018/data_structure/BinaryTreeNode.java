package com.rj.demo._2018.data_structure;

/**
 * @author Eric.Wu
 * @date 2018年4月10日 下午4:00:01
 * 
 */
//二叉树节点
public class BinaryTreeNode {
	private int data;
	private BinaryTreeNode left;
	private BinaryTreeNode right;

	public BinaryTreeNode() {
	}

	public BinaryTreeNode(int data, BinaryTreeNode left, BinaryTreeNode right) {
		super();
		this.data = data;
		this.left = left;
		this.right = right;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public BinaryTreeNode getLeft() {
		return left;
	}

	public void setLeft(BinaryTreeNode left) {
		this.left = left;
	}

	public BinaryTreeNode getRight() {
		return right;
	}

	public void setRight(BinaryTreeNode right) {
		this.right = right;
	}
}
