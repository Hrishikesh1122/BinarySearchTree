package com.hrishikesh.binarytree;
/*************************************************************************
 * Purpose : Implement Binary Search Tree
 * @author Hrishikesh Ugavekar
 * @Version 1.0
 * @since 14-06-202
 *
 ************************************************************************/
public class TreeNode {
	TreeNode left;
	TreeNode right;
    int data;
	public TreeNode getLeft() {
		return left;
	}
	public void setLeft(TreeNode left) {
		this.left = left;
	}
	public TreeNode getRight() {
		return right;
	}
	public void setRight(TreeNode right) {
		this.right = right;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public TreeNode(int data) {
		this.data = data;
		left=null;
		right=null;
	}
    
}
