package com.hrishikesh.binarytree;

/*************************************************************************
 * Purpose : Implement Binary Search Tree
 * @author Hrishikesh Ugavekar
 * @Version 1.0
 * @since 14-06-202
 *
 ************************************************************************/
public class BinaryTree {
	
	TreeNode root;
	int size=0;
	
	/**
	 * Default constructor to make root of the tree null.
	 */
	public BinaryTree() {
		root =null;
	}
	
	/**
	 * @param data from main
	 * Starts with creating node object of TreeNode
	 */
	public void insert(int data) {
		TreeNode node= new TreeNode(data);
		//For the first insertion, if root is null make new node as root.
		if(root==null) {
			root = node;
			size++;
		}
		// For further insertions
		else {
			TreeNode parent = root;
			TreeNode temp = root;
			//To traverse through tree. 
			while(temp!=null) {
				parent=temp;
				if(data<temp.getData()) {
					temp=temp.getLeft();
				}
				else {
					temp=temp.getRight();
				}
			}//End While
			if(data<parent.getData()) {
				parent.setLeft(node);
				size++;
			}
			else {
				parent.setRight(node);
				size++;
			}
		}//End else
	}//End method
	
	/**
	 * @return size of the tree
	 */
	public int size() {
		return size;
	}

}
