package com.rj.demo._2018.interview.search;

import com.rj.demo._2018.interview.data_structure.BinaryTreeNode;

/**
 * @author Eric.Wu
 * @date 2018年4月12日 下午5:12:18
 * 
 * 二叉排序树，也可以称为二叉查找树，它的性质如下： 
 * 1.若它的左子树不为空，则左子树上所有的节点均小于其根节点 
 * 2.若它的右子树不为空，则右子树上所有的节点的值均大于根节点  
 * 3.它的左右子树也分别为二叉排序树 
 * 简单起见，假设树中元素都实现了Comparable接口或者他们可以按自然顺序比较 
 * 
 */
public class BinarySortSearch {

	private BinaryTreeNode root = null;  
	
	/**查找二叉排序树中是否有key值*/  
    public boolean searchBST(int key){  
    	BinaryTreeNode current = root;  
        while(current != null){  
            if(key == current.getData())  
                return true;  
            else if(key < current.getData())  
                current = current.getLeft();  
            else  
                current = current.getRight();  
        }  
        return false;  
    }  
}
