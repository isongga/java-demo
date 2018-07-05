package com.rj.demo._2018.data_structure;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Eric.Wu
 * @date 2018年4月10日 下午4:00:59
 * 
 */
public class BinaryTree {
	private List<Integer> preOrderArr = new ArrayList<Integer>();
	private List<Integer> midOrderArr  = new ArrayList<Integer>() ;
	private List<Integer> postOrderArr = new ArrayList<Integer>();
	private List<Integer> mirrorOrderArr = new ArrayList<Integer>();

	public int[] preOrderArray(BinaryTreeNode root) {
		if (null != root) {
			preOrderArr.add(root.getData());
			System.out.print(root.getData() + " ");
			preOrderArray(root.getLeft());
			preOrderArray(root.getRight());
		}
		return toArr(preOrderArr);
	}

	public int[] midOrderArray(BinaryTreeNode root) {
		if (null != root) {
			midOrderArray(root.getLeft());
			midOrderArr.add(root.getData());
			midOrderArray(root.getRight());
		}
		return toArr(midOrderArr);
	}
	
	private static int index = 0;//先序序列中节点的位置
	
	public int indexOfRootNode(int[] preOrderArr, int[] midOrderArr) {
		
		int index = preOrderArr[0];
	}

	public void postOrderArray(int[] preOrderArr, int[] midOrderArr) {
		if(midOrderArr.length == 0) {
			return;
		}
		int rootNode = preOrderArr[index++];
		int indexOfRootNodeInMidOrderArr = indexOfRootNodeInMidOrderArr(rootNode, midOrderArr);
		int[] leftSubTree = subtree(0, indexOfRootNodeInMidOrderArr, preOrderArr);
		
		
	}
	
	private int[] subtree(int i, int j, int[] midOrderArr) {
		int len = j-i;
		int[] subtree = new int[j-i];
		while(i<j) {
			subtree
		}
		return subtree;
	}
	
	private int indexOfRootNodeInMidOrderArr(int rootNode, int[] midOrderArr) {
		for(int i=0; i<midOrderArr.length-1; i++) {
			if(rootNode == midOrderArr[i])
				return i;
		}
		return -1;
	}

	public BinaryTreeNode mirror(BinaryTreeNode root) {
		if (root == null)
			return null;
		else {
			BinaryTreeNode temp = root.getLeft();
			root.setLeft(root.getRight());
			root.setRight(temp);
			mirror(root.getLeft());
			mirror(root.getRight());
		}
		return root;
	}
	
	public void printMirror(BinaryTreeNode root) {
		this.preOrderArray(root);
	}
	
	public void print(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	private int[] toArr(List<Integer> list) {
		int[] arr = new int[list.size()];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = list.get(i);
		}
		return arr;
	}

}
